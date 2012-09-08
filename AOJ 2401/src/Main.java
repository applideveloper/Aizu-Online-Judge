import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		in = sc.next();
		if(in.equals("#"))return false;
		return true;
	}
	
	static void solve(){
		String[] tmp = in.split("=");
		String left = tmp[0], right = tmp[1];
		
		
	}

}
