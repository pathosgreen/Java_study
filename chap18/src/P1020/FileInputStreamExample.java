package P1020;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(
			"D:/KimBJ/javadata/chap18/src/P1020/FileInputStreamExample.java");
			
			int data;
			while((data=fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
