package PilasyColas;
import java.util.Scanner;

public class FunGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		QueueArray<Character> qResult = new QueueArray<>(27);
		QueueArray<Character> qOriginal = new QueueArray<>(str.length());
		QueueArray<Character> qOriginalmap = new QueueArray<>(str.length());
		StackArrayGeneric<Character> qGarbage = new StackArrayGeneric<>(str.length());
		QueueArray<Character> qSubq = new QueueArray<>(str.length());
		QueueArray<String> qAnswer = new QueueArray<>(50);
		
		StackArrayGeneric<Character> s = new StackArrayGeneric<>(str.length());
		
		for(int i =0; i<str.length();i++) {
			Character c = new Character(str.toCharArray()[i]);
			qOriginal.enqueue(c);
		}
		
		while(!qOriginal.empty()) {
			
		}
		
		/**
		int subCheck = 0;
		int tamMin=0;
		
		for(int i =0; i<str.length();i++) {
			Character c = new Character(str.toCharArray()[i]);
			qOriginal.enqueue(c);
		}
		
		while(!qOriginal.empty()) {
			
			
			qSubOriginal.clone(qOriginal);
			
			//qResultado.enqueue(qOriginal.dequeue());
			
			//for (int i = 0;i<qSubOriginal.getCount();i++) {
				
			//}
			while(!qSubOriginal.empty()) {
				if(qResultado.existChar(qSubOriginal.peek())) {
					qSubOriginal.dequeue();
				}else
					qResultado.enqueue(qSubOriginal.dequeue());
			}
			
			String sResultado = qResultado.toString();
			if(sResultado.length()>= tamMin) {
				qRespuesta.enqueue(sResultado);
				tamMin = sResultado.length();	
			}
			
			qResultado.clear(27);
			qOriginal.dequeue();
			
		}**/
		
		while(!qAnswer.empty()) {
			System.out.println(qAnswer.dequeue());
		}
		

	}

}
