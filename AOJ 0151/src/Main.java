import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] field;
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		field = new char[n][n];
		for(int i = 0; i < field.length; i++){
			field[i] = sc.next().toCharArray();
		}
		return true;
	}
	
	static void solve(){
		int[] dx = {0, 1, 1, 1, 0, -1, -1, -1}, dy = {1, 1, 0, -1, -1, -1, 0, 1};
		int res = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[0].length; j++){
				int val1 = 0, val2 = 0;
				for(int k = 0; k < dx.length/2; k++){
					int nx = j + dx[k], ny = i + dy[k];
					if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length){
						val1 = field[ny][nx] - '0';
						while(true){
							if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length){
								val1 += field[ny][nx]-'0';
							}else{
								break;
							}
							nx += dx[k]; ny += dy[k];
						}
						res = Math.max(res, val1);
					}else{
						nx = j; ny = i;
						nx = j + dx[k+4];ny = j + dy[k+4];
						if(0 > nx || nx >= field[0].length || 0 > ny || ny >= field.length)continue;
						val2 = field[ny][nx] - '0';
						while(true){
							if(0 <= nx && nx < field[0].length && 0 <= ny && ny < field.length){
								val2 += field[ny][nx]-'0';
							}else{
								break;
							}
							nx += dx[k]; ny += dy[k];
						}
					}
					res = Math.max(res, val1 + val2);
				}
			}
		}
		System.out.println(res);
	}

}
