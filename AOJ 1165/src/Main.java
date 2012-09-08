import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] n, d;
	static int[][]field;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	static int x = 250, y = 250;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		N = sc.nextInt();
		if ( N == 0 )return false;
		n = new int[N];
		d = new int[N];
		field = new int[500][500];
		for(int [] a: field)Arrays.fill(a, -1);
		field[y][x] = 0;
		for(int i = 1; i < n.length; i++){
			n[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		int sx = 0, sy = 0, h = 0, w = 0;;
		for(int k = 1; k < n.length; k++){
			for(int i = 0; i < field.length; i++){
				for(int j = 0; j < field[0].length; j++){
					if(field[i][j] == n[k]){sx = j; sy = i;}
				}
			}
			int nx = sx + dx[d[k]], ny = sy + dy[d[k]];
			field[ny][nx] = k;
		}
		for(int k = 0; k < N; k++){
			for(int i = 0; i < field.length; i++){
				for(int j = 0; j < field[0].length; j++){
					if(field[i][j] == k){sx = j; sy = i;}
				}
			}
			for(int i = 0; i < 2; i++){
				int nx = sx + dx[i], ny = sy + dy[i];
				int s = 1;
				if(field[ny][nx] == -1)continue;
				while(true){
					nx += dx[i]; ny += dy[i];
					
				}
			}
		}
		//print();
	}
	
	static void print(){
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
	}

}
