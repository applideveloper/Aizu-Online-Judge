import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] mountains;//山の情報を保存する配列
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	/**
	 * read関数で入力の読み込みを行う
	 */
	static boolean read(){
		if(!sc.hasNext())return false;
		mountains = new int[10];
		for(int i = 0; i < 10; i++){
			mountains[i] = sc.nextInt();//int型の入力の読み込みはnextInt()で
		}
		return true;
	}
	/**
	 * solve関数で計算し、出力する
	 */
	static void solve(){
		//Arrays.sort(mountains);実は、以下の処理はこの1行でできた
		for(int i = 0; i < 10; i++){
			for(int j = i; j < 10; j++){
				if(mountains[j] < mountains[i]){
					int swap = mountains[i];
					mountains[i] = mountains[j];
					mountains[j] = swap;
				}
			}
		}
		System.out.println(mountains[9]);//C言語のprintf("\n");にあたるのがSystem.out.println();
		System.out.println(mountains[8]);
		System.out.println(mountains[7]);
	}

}
