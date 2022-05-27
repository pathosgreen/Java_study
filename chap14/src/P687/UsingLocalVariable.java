package P687;

import P682.MyFunctionalInterFace;

public class UsingLocalVariable {
	
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
		
		// 람다식
		MyFunctionalInterFace fi = () -> {
			System.out.println("arg : "+arg);
			System.out.println("localVar : "+localVar+"\n");
		};
		fi.method();
	}
}
