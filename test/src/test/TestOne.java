package test;

public class TestOne {
	public static void main(String[] args) {
		
		int i=0;
		while(true) {
			i++;
			if(i % 5 == 0){
				System.out.println("i="+i );
			}
			if(i>=50) {
				break;
			}
		}
	}
}
