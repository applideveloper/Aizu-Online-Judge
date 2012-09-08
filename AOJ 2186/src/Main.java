import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, gx, gy, p;
	//static int[] mx, my;
	static int[][] field, m;
	public static void main(String[] args) {
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			read();
			solve();
		}
	}
	static void read(){
		
		gx = sc.nextInt();
		gy = sc.nextInt();
		p = sc.nextInt();
		field = new int[15][15];
		m = new int[15][15];
		for(int i = 0; i < p; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if( a == c )m[d][c] = 1;
			if( b == d )m[d][c] = 2;
			if( a == c && b == d)m[d][c] = 0;
		}
	}
	
	static void solve(){
		int res = 0;
		int[][]dp = new int[15][15];
		for(int i = dp.length-1; i > -1; i--){
			if(m[i][0] != 2 && m[i][0] != 3)dp[i][0] = 1;
		}
		for(int i = 0; i > dp[0].length; i++){
			if(m[0][i] != 1 && m[0][i] != 3)dp[dp.length-1][i] = 1;
		}
		
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[0].length; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = field.length-1; i > -1; i--){
			for(int j = 1; j < field[0].length; j++){
				if(m[i][j] != 1 && m[i][j] != 3)dp[i][j] += dp[i][j-1];
				if(m[i][j] != 2 && m[i][j] != 3)dp[i][j] += dp[i+1][j];
			}
		}
		//for(int = 0; i < dp.)
		System.out.println(dp[gy][gx]);
	}
	

}
