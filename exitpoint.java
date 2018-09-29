package jan13;

import java.util.Scanner;

public class exitpoint {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[][] arr = new int[x][y];
		for(int j= 0;j<x;j++)
		for (int i = 0; i < y; i++) {
			int z = scn.nextInt();
			arr[j][i] = z;
			}
		int row = 0, col = 0;
		int dir = 0;
		while (true) {
			dir = (dir + arr[row][col]) % 4;
			if (dir == 0) {
				col++;
				if (col == arr[0].length) {
					col--;
					System.out.println(row + " " + col);
					break;
				}
			} else if (dir == 1) {
				row++;
				if (row == arr.length) {
					row--;
					System.out.println(row + " " + col);
					break;
				}
			} else if (dir == 2) {
				col--;
				if (col == -1) {
					col++;
					System.out.println(row + ", " + col);
					break;
				}
			} else {
				row--;
				if (row == -1) {
					row++;
					System.out.println(row + ", " + col);
					break;
				}
			}

		}
	}
}