import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] mountains;//�R�̏���ۑ�����z��
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	/**
	 * read�֐��œ��͂̓ǂݍ��݂��s��
	 */
	static boolean read(){
		if(!sc.hasNext())return false;
		mountains = new int[10];
		for(int i = 0; i < 10; i++){
			mountains[i] = sc.nextInt();//int�^�̓��͂̓ǂݍ��݂�nextInt()��
		}
		return true;
	}
	/**
	 * solve�֐��Ōv�Z���A�o�͂���
	 */
	static void solve(){
		//Arrays.sort(mountains);���́A�ȉ��̏����͂���1�s�łł���
		for(int i = 0; i < 10; i++){
			for(int j = i; j < 10; j++){
				if(mountains[j] < mountains[i]){
					int swap = mountains[i];
					mountains[i] = mountains[j];
					mountains[j] = swap;
				}
			}
		}
		System.out.println(mountains[9]);//C�����printf("\n");�ɂ�����̂�System.out.println();
		System.out.println(mountains[8]);
		System.out.println(mountains[7]);
	}

}
