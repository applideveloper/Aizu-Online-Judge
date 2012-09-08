import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w, h;
	static char[][] field;
	static int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		w = sc.nextInt();
		h = sc.nextInt();
		if(w == 0 && h == 0)return false;
		field = new char[h][w];
		for(int i = 0; i < field.length; i++){
			field[i] = sc.next().toCharArray();
		}
		return true;
	}
	
	static void solve(){
		int res = 1<<29;
		int start_x = -1, start_y = -1, tile = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == 'o'){
					start_x = j;
					start_y = i;
					field[i][j] = '.';
				}
				if(field[i][j] == '*')tile++;
			}
		}
		res = dfs(start_x, start_y, tile, 1);
		System.out.println((res == 1<<29) ? -1 : res);
	}
	
	static int dfs(int x, int y, int tile, int round){
		field[y][x] = '.';
		if(tile == 0)return round;
		for(int i = 0; i < dx.length && i < dy.length; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(nx < 0 || nx >= field[0].length || ny < 0 || ny >= field.length)continue;
			if(field[ny][nx] == '*')dfs(nx, ny, tile--, round++);
		}
	}

}
