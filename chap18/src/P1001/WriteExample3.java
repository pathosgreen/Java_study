package P1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:/Temp/test3.txt");
		byte[] data = "ABCD".getBytes();
			os.write(data,1,2);
		os.flush();
		os.close();
	}
}
