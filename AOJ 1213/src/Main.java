import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	//static int[][] field;
	static int IC_x, IC_y, PC_x, PC_y, ACM_x, ACM_y;
	public static void main(String[] args) {
		int count = 1;
		while(read()){
			System.out.print(count + " ");
			solve();
			count++;
		}
	}
	
	static boolean read(){
		IC_x = sc.nextInt();
		IC_y = sc.nextInt();
		PC_x = sc.nextInt();
		PC_y = sc.nextInt();
		ACM_x = sc.nextInt();
		ACM_y = sc.nextInt();
		if(IC_x == 0 && IC_y == 0 && PC_x == 0 && PC_y == 0 && ACM_x == 0 && ACM_y == 0)return false;
		return true;
	}

	static void solve(){
		
	}
}
