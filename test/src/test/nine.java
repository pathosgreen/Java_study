package test;

import java.util.Scanner;

public class nine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 몇단? : ");
		int dan;
		
		do {
			dan = sc.nextInt();
		}while(dan<2 || dan>9);
		
		System.out.println("단 출력");
		for(int i=1;i<=9;i++) {
			System.out.printf("%2d * %2d = %2d \n",dan,i,dan*i);
		}
		
	}
}
