package PilasyColas;
import java.util.Scanner;
import java.util.stream.Stream;



public class main {
	
	static int[] StrToInArr(String str){
		int[] array = Stream.of(str.split(" "))
                .mapToInt(token -> Integer.parseInt(token))
                .toArray();
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();

		StackArray stack = new StackArray(StrToInArr(numbers));
		
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
	}

}
