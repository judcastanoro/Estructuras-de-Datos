package PilasyColas;

import java.util.Scanner;




public class funGames3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		QueueArray<Character> qOriginal = new QueueArray<>(str.length());
		QueueArray<Character> qAnswer = new QueueArray<>(str.length());
		
		for(int i =0; i<str.length();i++) {
			Character c = new Character(str.toCharArray()[i]);
			qOriginal.enqueue(c);
		}
		
		while(!qOriginal.empty()) {
			char c = qOriginal.dequeue();
			boolean b = false;
			int in = qAnswer.getCount();			
			
			for(int i=0;i<in;i++) {
				char co = qAnswer.dequeue();
				qAnswer.enqueue(co);
				if (co==c)
					b=true;
				
			}
			
			
			if(!b) {
				qAnswer.enqueue(c);
			}else {
				String s = "";//qAnswer.toString();
				int siz = qAnswer.getCount();
				char cet = ' ';
				
				for(int i=0;i<siz;i++) {
					cet = qAnswer.dequeue();
					s+=cet;
					qAnswer.enqueue(cet);
				}
				
				
				String copy = s;
				QueueArray<Character> qSub = new QueueArray<>(str.length());
				
				for(int i =0; i<copy.length();i++) {
					if(copy.toCharArray()[i]!=c) {
						Character ch = new Character(copy.toCharArray()[i]);
						qSub.enqueue(ch);
					}
				}
				qSub.enqueue(c);
				copy=qSub.toString();
				
				String copyc ="";
				
				while(!qSub.empty()) {
					copyc+=qSub.dequeue();
				}
				copy=copyc;
				
				qAnswer.clear(str.length());
				
				if(s.compareTo(copy)<=0){
					for(int i =0; i<s.length();i++) {
						Character ch = new Character(s.toCharArray()[i]);
						qAnswer.enqueue(ch);
					}
				}else {
					for(int i =0; i<s.length();i++) {
						Character ch = new Character(copy.toCharArray()[i]);
						qAnswer.enqueue(ch);
						}
				}
				
				
			}
		}
		
		
		String s= "";
		while(!qAnswer.empty()) {
			s+=qAnswer.dequeue();
		}
		System.out.println(s);

		
	}

}
