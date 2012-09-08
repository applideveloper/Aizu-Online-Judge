import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Stack<String> s = new Stack<String>();
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		String[] in = sc.nextLine().split(" ");
		for(int i = 0; i < in.length; i++){
			s.add(in[i]);
		}
		return true;
	}
	
	static void solve(){
		
	}

}
