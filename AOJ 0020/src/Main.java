import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String[] in;
	public static void main(String[] args) {
		while(read()){
			sovle();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		in = sc.next().split(" ");
		return true;
	}
	
	static void sovle(){
		for(int i = 0; i < in.length; i++){
			char[] word = in[i].toCharArray();
			for(int j = 0; j < word.length; j++){
				char letter = word[j];
				if(Character.isLetter(letter))word[j] = Character.toUpperCase(letter);
			}
			System.out.print(word);
			if(i != in.length-1){
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
	}

}
