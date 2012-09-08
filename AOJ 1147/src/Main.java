import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] score;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		
		score = new int[n];
		for(int i = 0; i < score.length; i++){
			score[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		Arrays.sort(score);
		int res = 0;
		for(int i = 1; i < score.length-1; i++){
			res += score[i];
		}
		System.out.println(res/(n-2));
	}

}
