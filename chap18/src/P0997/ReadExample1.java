package P0997;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws IOException {
		

			InputStream is = new FileInputStream("D:/temp/test.txt");
			int readByte;
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
				}
			is.close();

	}
}
