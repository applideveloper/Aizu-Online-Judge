import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int h, w, c;
	static int[][] field;
	static int res = 0;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		h = sc.nextInt();
		w = sc.nextInt();
		c = sc.nextInt();
		if( h == 0 && w == 0 && c == 0 )return false;
		field = new int[h][w];
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				field[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve(){
		dfs();
		System.out.println(res);
	}
	
	static void dfs(){
		
	}
}
