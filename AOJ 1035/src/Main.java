import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w, q;
	static int[] wall;
	public static void main(String[] args) {
		while(read()){
			//solve();
		}
	}
	
	static boolean read(){
		w = sc.nextInt();
		q = sc.nextInt();
		wall = new int[w];
		Arrays.fill(wall, -1);
		if( w == 0 && q == 0 )return false;
		for(int i = 0; i < q; i++){
			char order = sc.next().charAt(0);
			int id = sc.nextInt();
			int size = sc.nextInt();
			solve(order, id, size);
		}
		return true;
	}
	
	static void solve(char order, int id, int size){
		if(id == q-1){
			
		}else if(size >= w){
			System.out.println("impossible");
		}else if(order == 's'){
			for(int i = 0; i < wall.length; i++){
				if(wall[i] != -1){wall[i] = id;break;}
			}
		}else if(order == 'w'){
			
		}
	}

}
