package P423;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
		
		System.out.println(data1+5); // 실행은 되나 다른 값이 나옴
		System.out.println(value1+5);
//		int result = value1+value2;
//		System.out.println(data1+"+"+data2+"="+result);
		
	}
}
