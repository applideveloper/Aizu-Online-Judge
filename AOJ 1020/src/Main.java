import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static char s, t, b;
	static int[]dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
	static char[][] field = {{'A', 'B', 'C'},
							 {'D', 'E', 'F'},
							 {'G', 'H', 'I'}};
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		s = sc.next().charAt(0);
		t = sc.next().charAt(0);
		b = sc.next().charAt(0);
		return true;
	}
	
	static void solve(){
		double all = Math.pow(4, b);
		double pattern = 0.0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				if(field[i][j] == s)pattern = dfs(j, i, 1.0);
			}
		}
	}
	
	static double dfs(int x, int y, double count){
		if(field[y][x] == t)return count;
		
		return 0.0;
	}

}
