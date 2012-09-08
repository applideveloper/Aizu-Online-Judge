import java.util.*;
class Edge{
	int from, to, cost;
}
public class Main {
	static Scanner sc  = new Scanner(System.in);
	static int n, m, k, d;
	static Edge[] edge;
	static int[] cal;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		d = sc.nextInt();
		if(n == 0 && m == 0 && k == 0 && d == 0)return false;
		
		cal = new int[m];
		for(int i = 0; i < cal.length; i++){
			cal[i] = sc.nextInt();
		}
		edge = new Edge[d];
		for(int i = 0; i < edge.length; i++){
			edge[i] = new Edge();
		}
	}

	static void solve(){
		
	}
	

}
