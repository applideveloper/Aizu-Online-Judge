import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m, l;
	static double[] x, y, a, r;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		if(n == 0 && m == 0 && l == 0)return false;
		
		x = new double[n];
		y = new double[n];
		a = new double[n];
		r = new double[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
			a[i] = sc.nextDouble();
			r[i] = sc.nextDouble();
		}
		return true;
	}
	
	static void solve(){
		
	}

}
