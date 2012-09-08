import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] edge;
	public static void main(String[] args) {
		//System.out.println(1<<29);
		//System.out.println(Integer.MAX_VALUE);
		edge = new int[1000000][2];
		for(int i = 0; i < edge.length; i++){
			for(int j = 0; j < edge[0].length; j++){
				edge[i][j] = 1<<29;
			}
		}
		//System.out.println(edge.length);
		//System.out.println(edge[0].length);
		String str = "AOKI";
		String str2 = "AOKI";
		str2 += "";
		//String str2 =  new String("AOKI");
		//str2 = str;
		if(str == str2)System.out.println("OK");
		StringBuffer sb = new StringBuffer("AOKI");
		
		System.out.println(sb.reverse());
		System.out.println(str+str2);
		
		System.out.println(str.equals("AOKI"));
		System.out.println(str.substring(0, 2));
	}

}
