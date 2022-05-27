package ex13;

public class HumenTester {
	public static void main(String[] args) {
		
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);
		
		gildong.gianWeight(3);
		chulsu.reduseWeight(5);
		
		System.out.println("이름 : "+gildong.getname());
		System.out.println("이름 : "+gildong.getHeight() + "cm");
		System.out.println("이름 : "+gildong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름 : "+chulsu.getname());
		System.out.println("이름 : "+chulsu.getHeight() + "cm");
		System.out.println("이름 : "+chulsu.getWeight() + "kg");
	}
}
