package demo.codequality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BadCodeDemo {

	/**
	 * Stream is not being close by this method so ideally Continuous Integration should catch such kind of potential issues.
	 * @param filePath
	 * @param fileName
	 */
	public static void readFile(String filePath, String fileName){
		try {
			FileInputStream fis = new FileInputStream(new File(filePath+fileName));
			int data = fis.read();
			while(data != -1){
				System.out.print((char) data);
				data = fis.read();
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}
}
