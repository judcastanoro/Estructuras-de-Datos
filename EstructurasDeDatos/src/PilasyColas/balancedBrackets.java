package PilasyColas;

import java.util.Scanner;

public class balancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nCasos = Integer.parseInt(sc.nextLine());
		String brackets = "";
		QueueArray<Boolean> qAnswer = new QueueArray<>(10);
		
		
		for(int i=0;i<nCasos;i++) {
			brackets= sc.nextLine();
			char cas = ' ';
			boolean caso = true;
			StackArrayGeneric<Character> stack = new StackArrayGeneric<>(brackets.length());
			
			for(int j=0;j<brackets.length();j++) {
				
				cas = brackets.charAt(j);
				switch(cas){
					case '{':
						stack.push(new Character(cas));
						break;
					case '[':
						stack.push(new Character(cas));
						break;
					case '(':
						stack.push(new Character(cas));
						break;
					case '}':
						try {
							Character c = new Character(stack.pop());
							if('{'!=c) {
								caso=false;
							}
						}
						catch (Exception e) {
							caso=false;
						}
						break;
						
					case ']':
						try {
							Character c = new Character(stack.pop());
							if('['!=c) {
								caso=false;
							}
						}
						catch (Exception e) {
							caso=false;
						}
						break;
						
					case ')':
						try {
							Character c = new Character(stack.pop());
							if('('!=c) {
								caso=false;
							}
						}
						catch (Exception e) {
							caso=false;
						}
						break;
						
					
				}
				
			}
			
			if(stack.empty() && caso==true) {
				qAnswer.enqueue(true);
			}else
				qAnswer.enqueue(false);
			
		}
		
		while(!qAnswer.empty()) {
			if(qAnswer.pop()) {
				System.out.println("YES");
			}else
				System.out.println("NO");
		}

	}

}
