package chap04;

public class ContinueExample {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if( i%2 !=0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<=50; i++) {
			if( i%5 !=0 && i!=0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
