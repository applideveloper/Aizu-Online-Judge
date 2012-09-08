import java.util.*;
public class Main {
	static Scanner sc= new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if( n == 0 )return false;
		return true;
	}
	
	static void solve(){
		int sum = 0;
		int res = 0;
		for(int i = 1; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(i+j == n){res++; break;}
				
			}
			
		}
	}

}
