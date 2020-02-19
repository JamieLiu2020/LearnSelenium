package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void demo() throws Exception {
		
			System.out.println("Hello");
			
			int i =1/0;
			
			System.out.println("Finished");				
		
	}

}
