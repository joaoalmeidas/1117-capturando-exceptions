import java.io.IOException;

public class TesteException {

	public static void main(String[] args) {
		
		
		try {
			
			metodoExceptionB();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			metodoExceptionC();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			metodoExceptionNullPointerException();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			metodoIOException();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}


	}
	
	public static void metodoExceptionB() throws ExceptionB {
		
			
		throw new ExceptionB("ExceptionB");

		
	}
	
	public static void metodoExceptionC() throws ExceptionC {
		

		throw new ExceptionC("ExceptionC");

		
	}
	
	public static void metodoExceptionNullPointerException() throws NullPointerException {
		
		
		throw new NullPointerException("metodoExceptionNullPointerException");

		
	}
	
	public static void metodoIOException() throws IOException {
		
		
		throw new IOException("metodoIOException");

		
	}

}
