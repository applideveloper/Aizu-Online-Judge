import java.util.Scanner;
import java.util.Arrays;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w, h, sx, sy, gx, gy, n;
	static int[][] field;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		w = sc.nextInt();
		h = sc.nextInt();
		if(w == 0 && h == 0)return false;
		sx = sc.nextInt();
		sy = sc.nextInt();
		gx = sc.nextInt();
		gy = sc.nextInt();
		n = sc.nextInt();
		
		field = new int[h][w];
		for(int i = 0; i < field.length; i++)Arrays.fill(field[i], -1);
		int c = 0, d = 0, x = 0, y = 0;
		for(int i = 0; i < n; i++){
			c = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			if(d == 0){
				for(int j = 0; j < 2; j++){
					for(int k = 0; k < 4; k++){
						field[y+k][x+j] = c;
					}
				}
			}else{
				for(int j = 0; j < 4; j++){
					for(int k = 0; k < 2; k++){
						field[y+k][x+j] = c;
					}
				}				
			}
		}
		return true;
	}
	
	static void solve(){
		if(field[sy][sx] == -1){
			System.out.println("NG");
		}else{
			//dfs()
		}
	}

}
