import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m, l;
	static final int INF = 1<<29;
	static int[][] dist, edge, distance;
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
		distance = new int[n+1][n+1];
		edge = new int[n+1][n+1];
		dist = new int[n+1][l+1];
		for(int[]i:distance)Arrays.fill(i, INF);
		for(int[]i:edge)Arrays.fill(i, INF);
		for(int[]i:dist)Arrays.fill(i, INF);
		for(int i = 0; i < m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			distance[a][b] = distance[b][a] = d;
			edge[a][b] = edge[b][a] = e;
		}
		return true;
	}
	
	static void solve(){
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(n, new Comparator<int[]>(){
			public int compare(int[] obj1, int[] obj2){
				return dist[obj1[0]][obj1[1]] - dist[obj2[0]][obj2[1]];
			}
		});
		dist[1][l] = 0;
		q.add(new int[]{0, l});
		int res = INF;
		while(!q.isEmpty()){
			int[] p = q.poll();
			int v = p[0], c = p[1];
			if(v == n){res = Math.min(res, dist[v][c]);continue;}
			for(int i = 1; i < dist.length; i++ ){
				if(distance[v][i] == INF)continue;
				int w = dist[v][c] + edge[v][i];
				if(w < dist[i][c]){
					dist[i][c] = w;
					q.add(new int[]{i,c});
				}
				if(distance[v][i] <= c && dist[v][c] < dist[i][c-distance[v][i]]){
					dist[i][c-distance[v][i]] = dist[v][c];
					q.add(new int[]{i, c-distance[v][i]});
				}
			}
		}
		System.out.println(res);
		q.clear();
	}

}
