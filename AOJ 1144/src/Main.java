import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] field;
	static int h, w;
	static int[] dx = {1, 0, -1, 0}, dy = {0, -1, 0, 1};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		w = sc.nextInt();
		h = sc.nextInt();
		if(w == 0 && h == 0)return false;
		
		field = new int[h][w];
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				field[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	/*
	 * field[y][x] = 0 => in field
	 * field[y][x] = 1 => obstacle
	 * field[y][x] = 2 => start
	 * field[y][x] = 3 => goal
	 */
	static void solve(){
		int res = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == 2){
					field[i][j] = 0;
					res = dfs(j, i, 1);//start searching.
				}
			}
		}
		print(field);
		if(res == 1 << 20){
			System.out.println(-1);
		}else{
			System.out.println(res);
		}
	}
	
	static int dfs(int x, int y, int round){
		//System.out.println("line 50 round = " +round);
		if(round > 10)return 1<<20;
		int ans = 1<<20;
		for(int i = 0; i < dx.length && i < dy.length; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length && field[ny][nx] != 1){
				if(field[ny][nx] == 3)return round++;
				while(true){
					nx = nx + dx[i]; ny = ny + dy[i];
					//If the point is in field, check a value.
					if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length){
						//The point is goal.
						if(field[ny][nx] == 3)return round++;
						//The point is obstacle.
						if(field[ny][nx] == 1){
							field[ny][nx] = 0;//remove obstacle.
							ans = Math.min(ans, dfs(nx - dx[i], ny - dy[i], round++));//restart searching.
							field[ny][nx] = 1;//put obstacle.
							break;
						}
					}else{
						break;
					}
				}
			}
		}
		//System.out.println("line 76 ans = " +ans);
		return ans;
	}

	static void print(int[][]f){
		for(int i = 0; i < f.length; i++){
			for(int j = 0; j < f[0].length; j++){
				System.out.print(f[i][j] + " ");
			}
			System.out.println();
		}
	}
}
