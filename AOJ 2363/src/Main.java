import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int t, p, q;
	static int[] v_Otsuki, n, m;
	static int[][] v;
	static double[] r_Otsuki;
	static double[][] r;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		t = sc.nextInt();
		v = new int[t][100];
		r = new double[t][100];
		for(int i = 0; i < t; i++){
			n = sc.nextInt();
			m = sc.nextInt();
			for(int j = 0; j < m; j++){
				v[i][j] = sc.nextInt();
				r[i][j] = sc.nextDouble();
			}
		}
		p = sc.nextInt();
		q = sc.nextInt();
		v_Otsuki = new int[p];
		r_Otsuki = new double[p];
		for(int i = 0; i < q; i++){
			v_Otsuki[i] = sc.nextInt();
			r_Otsuki[i] = sc.nextDouble();
		}
		return true;
	}

	static void solve(){
		double E = 0.0, E_Otsuki = 0.0;
		boolean f = false;
		
		for(int i = 0; i < v_Otsuki.length; i++){
			E_Otsuki += v_Otsuki[i]*r_Otsuki[i];
		}
		System.out.println("Otsuki = "+E_Otsuki);
		for(int i = 0; i < v.length; i++){
			for(int j = 0; j < v[0].length; j++){
				E += v[i][j]*r[i][j];
			}
			E += E*(n-m)/n;
			System.out.println("me = "+E);
			if(E > E_Otsuki){f = true; break;}
			E = 0.0;
		}
		
		if(f){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
