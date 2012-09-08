import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	class Circle{
		int x, y, r, c;
		Circle(int a, int b, int c, int d){
			this.x = a;
			this.y = b;
			this.r = c;
			this.c = d;
		}
	}
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		
		Circle[] circle = new Circle[n];
		for(int i = 0; i < n; i++){
			circle[i] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		return true;
	}
	
	static void solve(){
		
	}

}
