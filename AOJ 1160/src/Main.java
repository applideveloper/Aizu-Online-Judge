import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w, h;
	static int field[][];
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		w = sc.nextInt();
		h = sc.nextInt();
		if( w == 0 && h == 0 )return false;
		field = new int[h][w];
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				field[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == 1){dfs(j, i);res++;}
			}
		}
		System.out.println(res);
	}
	
	static void dfs(int x, int y){
		field[y][x] = 0;
		int[] dx = {0, 1, 1, 1, 0, -1, -1, -1}, dy = {1, 1, 0, -1, -1, -1, 0, 1};
		for(int i = 0; i < dx.length; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(0 <= ny && field.length < ny 
			&& 0 <= nx && field[0].length < nx 
			&& field[ny][nx] == 1){
				dfs(nx, ny);
			}
		}
	}

}
