package chap02;

public class VariableScopeExample {
	public static void main(String[] args) {
		
		int v1 = 13;
		int v2 = 0;
		if(v1>10) {
			 v2 = v1 - 10;
		} // if end
		int v3 = v1 + v2 + 5; 
		System.out.println( "v3 = " + v3 );
	} // m e
} // c e
