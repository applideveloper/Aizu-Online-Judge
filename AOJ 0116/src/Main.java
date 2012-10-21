import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H, W;
	static char[][] field;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		H = sc.nextInt();
		W = sc.nextInt();
		field = new char[H][W];
		for(int i = 0; i < field.length; i++){
			field[i] = sc.next().toCharArray();
		}
		return true;
	}
	
	static void solve(){
		
	}
}
