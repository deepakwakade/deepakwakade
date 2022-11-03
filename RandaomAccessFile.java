package iostream.com;
import java.io.IOException;

public class RandomAccessFile {
	

		public RandomAccessFile(String filePath, String string) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			try {
				// file content is "ABCDEFGH"
				String filePath = "D:/Users/sushil/Downloads/demo.txt"; 
				
				System.out.println(new String(readCharsFromFile(filePath, 1, 10)));

				writeData(filePath, "Data", 10);
				//now file content is "ABCDEData"
				
				appendData(filePath, "pankaj");
				//now file content is "ABCDEDsuhsilhi"
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private static void appendData(String filePath, String data) throws IOException {
			RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
			raFile.seek(raFile.length());
			System.out.println("current pointer = "+raFile.getFilePointer());
			raFile.write(data.getBytes());
			raFile.close();
			
		}

		private int length() {
			return 0;
		}

		private String getFilePointer() {
			return null;
		}

		private static void writeData(String filePath, String data, int seek) throws IOException {
			RandomAccessFile file = new RandomAccessFile(filePath, "rw");
			file.seek(seek);
			file.write(data.getBytes());
			file.close();
		}

		private void close() {
			
		}

		private void write(byte[] bytes) {
			
		}

		private void seek(int seek) {
			
		}

		private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
			RandomAccessFile file = new RandomAccessFile(filePath, "r");
			file.seek(seek);
			byte[] bytes = new byte[chars];
			file.read(bytes);
			file.close();
			return bytes;
		}

		private void read(byte[] bytes) {
			// TODO Auto-generated method stub
			
		}

	}