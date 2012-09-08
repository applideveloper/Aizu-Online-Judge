import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> pre = new ArrayList<Integer>();
	static ArrayList<Integer> now = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		read();
		solve();
	}
	
	static void read(){
		while(true){
			String[] in = sc.next().split(",");
			if(in.equals(""))break;
			pre.add(Integer.parseInt(in[0]));
			System.out.println(in[0]);
		}
		System.out.println(111);
		while(sc.hasNext()){
			String[] in = sc.next().split(",");
			now.add(Integer.parseInt(in[0]));
			System.out.println(in[0]);
		}
		System.out.println(222);
	}
	
	static void solve(){
		TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
		int[] key = new int[now.size()];
		for(int i = 0; i < now.size(); i++){
			if(pre.contains(now.get(i))){
				map.put(now.get(i), map.get(now.get(i))+1);
				key[i] = now.get(i);
			}
		}
		for(int i = 0; i < map.size(); i++){
			System.out.println(key[i] + " " + map.get(key[i]));
		}
	}

}
