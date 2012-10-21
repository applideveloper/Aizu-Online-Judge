import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H, W, L;
	static char[][] field;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		H = sc.nextInt();
		W = sc.nextInt();
		L = sc.nextInt();
		if(H == 0 && W == 0 && L == 0)return false;
		field = new char[H][W];
		for(int i = 0; i < field.length; i++){
			field[i] = sc.next().toCharArray();
		}
		return true;
	}
	
	static void solve(){
		/**
		 * ‰ŠúˆÊ’u‚Ì’²¸
		 */
		int sx = -1, sy = -1;
		char direction = 'X';
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == 'N' || field[i][j] == 'E' || field[i][j] == 'S' || field[i][j] == 'W'){
					sx = j; sy = i;
					direction = field[i][j];
					field[i][j] = '.';
				}
			}
		}
		System.out.println("sx = " + sx + " sy = " + sy + " direction = " + direction);
		
		int x = sx, y = sy;
		int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
		while(L >= 0){
			int nx = 0, ny = 0;
			switch(direction){
			case 'N':
				nx = x + dx[0]; ny = y + dy[0];
				if(isField(nx, ny)){
					x += dx[0]; y += dy[0];
				}else{
					direction = 'E';
					nx = x + dx[1]; ny = y + dy[1];
					if(isField(nx, ny))x += dx[1]; y += dy[1];
				}
				break;
			case 'E':
				nx = x + dx[1]; ny = y + dy[1];
				if(isField(nx, ny)){
					x += dx[1]; y += dy[1];
				}else{
					direction = 'S';
					nx = x + dx[2]; ny = y + dy[2];
					if(isField(nx, ny))x += dx[2]; y += dy[2];
				}
				break;
			case 'S':
				nx = x + dx[2]; ny = y + dy[2];
				if(isField(nx, ny)){
					x += dx[2]; y += dy[2];
				}else{
					direction = 'W';
					nx = x + dx[3]; ny = y + dy[3];
					if(isField(nx, ny))x += dx[3]; y += dy[3];
				}
				break;
			case 'W':
				nx = x + dx[3]; ny = y + dy[3];
				if(isField(nx, ny)){
					x += dx[3]; y += dy[3];
				}else{
					direction = 'N';
					nx = x + dx[1]; ny = y + dy[1];
					if(isField(nx, ny))x += dx[1]; y += dy[1];
				}
				break;
			}
			L--;
		}
		System.out.println(y + " " + x + " " + direction);
	}
	
	static boolean isField(int x, int y){
		if(x < 0 || x >= field[0].length || y < 0 || y >= field.length)return false;
		if(field[y][x] == '#')return false;
		return true;
	}
}
