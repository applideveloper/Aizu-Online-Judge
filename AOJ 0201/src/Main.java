import java.util.*;
public class Main {
	static Scanner sc= new Scanner(System.in);
	static int n, m;
	static HashMap<String, Integer> item = new HashMap<String, Integer>();
	static HashMap<String, ArrayList<String>> recipe = new HashMap<String, ArrayList<String>>();
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		
		for(int i = 0; i < n; i++){
			item.put(sc.next(), sc.nextInt());
		}
		m = sc.nextInt();
		for(int i = 0; i < m; i++){
			String name = sc.next();
			int k = sc.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			for(int j = 0; j < k; j++){
				list.add(sc.next());
			}
			if(!list.isEmpty())recipe.put(name, list);
		}
		return true;
	}
	
	static void solve(){
		System.out.println(rec(sc.next()));
		if(!item.isEmpty())item.clear();
		if(!recipe.isEmpty())recipe.clear();
	}
	
	static int rec(String make){
		int res = 0;
		if(recipe.containsKey(make)) {
			for(int i = 0; i < recipe.get(make).size(); i++){
				res += rec(recipe.get(make).get(i));
			}
		}else{
			res = item.get(make);
		}
		if(item.get(make) < res)res = item.get(make);
		return res;
	}
}
