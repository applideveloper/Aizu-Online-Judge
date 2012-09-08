import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static String start = "0000000";
	static String[] segment = {
		"0111111",
		"0000110",
		"1011011",
		"1001111",
		"1010110",
		"1101101",
		"1111101",
		"0100111",
		"1111111",
		"1101111"
	};
	public static void main(String[] args) {
		while(read()){}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == -1)return false;
		for(int i = 0; i < n; i++)solve();
		return true;
	}
	static void solve(){
		String next = segment[sc.nextInt()];
		char[] order = new char[7];
		for(int i = 0; i < order.length; i++){
			if(next.charAt(i) == start.charAt(i)){
				order[i] = '0';
			}else{
				order[i] = '1';
			}
		}
		System.out.println(order);
		start = next;
	}

}
