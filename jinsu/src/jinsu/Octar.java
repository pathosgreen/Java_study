package jinsu;

public class Octar {
	
	static final int JINSUNUM = 8; // JINSUNUM진수 프로그램
	
	public static void main(String[] args) {
		
		int num = 35;
		int cnt = 0;
		int[] bin = new int[15];
		while (num>=1) { // 8진수 연산
			
			bin[cnt] = num%JINSUNUM;
			cnt++;
			num=num/JINSUNUM;
		}
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(+bin[i]);
		}
	}

}
