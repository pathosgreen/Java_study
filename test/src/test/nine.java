package test;

import java.io.IOException;
import java.util.Scanner;

public class nine {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("구구단 몇단? : ");
			int dan = sc.nextInt();
			if(!(dan==0||(dan==1))){
				System.out.println("단 출력");
				for(int j=1;j<=9;j++) {
					System.out.print(dan + " * " + j + " = " + dan*j + "\n");
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
