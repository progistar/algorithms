package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P13460_Escaping {
	
	public static int MIN_MOVE = Integer.MAX_VALUE;
	public static int[][][][] MOVES = null;

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		String[] fields = null;
		
		int N = 0; // row size
		int M = 0; // col size
		
		int rx = 0;
		int ry = 0;
		int bx = 0;
		int by = 0;
		
		line = BR.readLine();
		fields = line.split("\\s");
		N = Integer.parseInt(fields[0]);
		M = Integer.parseInt(fields[1]);
		
		char[][] maze = new char[N][M];
		MOVES = new int[N][M][N][M];
		
		for(int i=0; i<MOVES.length; i++) {
			for(int j=0; j<MOVES[i].length; j++) {
				for(int k=0; k<MOVES[i][j].length; k++) {
					Arrays.fill(MOVES[i][j][k], Integer.MAX_VALUE);
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			line = BR.readLine();
			for(int j=0; j<line.length(); j++) {
				maze[i][j] = line.charAt(j);
				
				if(maze[i][j] == 'R') {
					rx = j;
					ry = i;
				} else if(maze[i][j] == 'B') {
					bx = j;
					by = i;
				}
			}
		}
		
		BR.close();
		
		MIN_MOVE = Math.min(solve(rx, ry, bx, by, maze, 0), MIN_MOVE);
		if(MIN_MOVE == Integer.MAX_VALUE) {
			MIN_MOVE = -1;
		}
		System.out.println(MIN_MOVE);
	}
	
	public static int solve (int rx, int ry, int bx, int by, char[][] maze, int stepCount) {
		if(stepCount == 10) {
			return Integer.MAX_VALUE;
		}
		
		MOVES[ry][rx][by][bx] = stepCount;
		int isRedInHole = Integer.MAX_VALUE;
		int isBlueInHole = Integer.MAX_VALUE;
		
		// right
		if(maze[ry][rx+1] != '#' || maze[by][bx+1] != '#') {
			int rx_ = rx;
			int bx_ = bx;
			
			// move
			while(maze[ry][++rx_] != '#') {
				if(maze[ry][rx_] == 'O') {
					isRedInHole = rx_ - rx;
				}
			}
			while(maze[by][++bx_] != '#') {
				if(maze[by][bx_] == 'O') {
					isBlueInHole = bx_ - bx;
				}
			};
			rx_--; bx_--;
			
			if(rx_ == bx_) {
				if(ry == by && rx < bx) {
					rx_--;
				} else if(ry == by && rx > bx) {
					bx_--;
				}
			}
			
			if(isBlueInHole == Integer.MAX_VALUE && isRedInHole != Integer.MAX_VALUE) {
				return stepCount + 1;
			}
			
			if(isBlueInHole == Integer.MAX_VALUE) {
				MIN_MOVE = Math.min(solve(rx_, ry, bx_, by, maze, stepCount+1), MIN_MOVE);
			}
			isBlueInHole = Integer.MAX_VALUE;
			isRedInHole = Integer.MAX_VALUE;
		}
		
		// down
		if(maze[ry+1][rx] != '#' || maze[by+1][bx] != '#') {
			int ry_ = ry;
			int by_ = by;
			
			// move
			while(maze[++ry_][rx] != '#') {
				if(maze[ry_][rx] == 'O') {
					isRedInHole = ry_ - ry;
				}
			}
			while(maze[++by_][bx] != '#') {
				if(maze[by_][bx] == 'O') {
					isBlueInHole = by_ - by;
				}
			};
			ry_--; by_--;
			
			if(ry_ == by_) {
				if(rx == bx && ry < by) {
					ry_--;
				} else if(rx == bx && ry > by) {
					by_--;
				}
			}
			
			if(isBlueInHole == Integer.MAX_VALUE && isRedInHole != Integer.MAX_VALUE) {
				return stepCount + 1;
			}
			
			if(isBlueInHole == Integer.MAX_VALUE) {
				MIN_MOVE = Math.min(solve(rx, ry_, bx, by_, maze, stepCount+1), MIN_MOVE);
			}
			isBlueInHole = Integer.MAX_VALUE;
			isRedInHole = Integer.MAX_VALUE;
		}
		
		
		// left
		if(maze[ry][rx-1] != '#' || maze[by][bx-1] != '#') {
			int rx_ = rx;
			int bx_ = bx;
			
			// move
			while(maze[ry][--rx_] != '#') {
				if(maze[ry][rx_] == 'O') {
					isRedInHole = - rx_ + rx;
				}
			}
			while(maze[by][--bx_] != '#') {
				if(maze[by][bx_] == 'O') {
					isBlueInHole = - bx_ + bx;
				}
			};
			rx_++; bx_++;
			if(bx_ == rx_) {
				if(ry == by && rx < bx) {
					bx_++;
				} else if(ry == by && rx > bx) {
					rx_++;
				}
			}
			
			if(isBlueInHole == Integer.MAX_VALUE && isRedInHole != Integer.MAX_VALUE) {
				return stepCount + 1;
			}
			
			if(isBlueInHole == Integer.MAX_VALUE) {
				MIN_MOVE = Math.min(solve(rx_, ry, bx_, by, maze, stepCount+1), MIN_MOVE);
			}
			isBlueInHole = Integer.MAX_VALUE;
			isRedInHole = Integer.MAX_VALUE;
		}
		
		// up
		if(maze[ry-1][rx] != '#' || maze[by-1][bx] != '#') {
			int ry_ = ry;
			int by_ = by;
			
			// move
			while(maze[--ry_][rx] != '#') {
				if(maze[ry_][rx] == 'O') {
					isRedInHole = - ry_ + ry;
				}
			}
			while(maze[--by_][bx] != '#') {
				if(maze[by_][bx] == 'O') {
					isBlueInHole = - by_ + by;
				}
			};
			ry_++; by_++;
			
			if(by_ == ry_) {
				if(rx == bx && ry < by) {
					by_++;
				} else if(rx == bx && ry > by ) {
					ry_++;
				}
			}
			
			if(isBlueInHole == Integer.MAX_VALUE && isRedInHole != Integer.MAX_VALUE) {
				return stepCount + 1;
			}
			
			if(isBlueInHole == Integer.MAX_VALUE) {
				MIN_MOVE = Math.min(solve(rx, ry_, bx, by_, maze, stepCount+1), MIN_MOVE);
			}
			isBlueInHole = Integer.MAX_VALUE;
			isRedInHole = Integer.MAX_VALUE;
		}
		
		return MIN_MOVE;
	}
}
