public class Application {
	public static void main(String[] args) {
		
		// Some useful conditions:
		System.out.println(5 == 5);
		System.out.println(10 != 11);
		System.out.println(3 < 6);
		System.out.println(10 > 100);
		
		// Using loops with "break": 
		int loop = 0;
		
		while(true) {
			System.out.println("Looping: " + loop);
			
			if(loop == 3) {
				break;
			}
			
			loop++;
		
			System.out.println("Running");
		}
	}
}