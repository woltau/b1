
public class B1_Tester {

	public static void main(String[] args) throws Exception {
		System.out.println("Threads mit Rückgabewerten");
		B1_Result result = new B1_Result();
		B1_Berechne b1 = new B1_Berechne(result, 'A');
		B1_Berechne b2 = new B1_Berechne(result, 'B');
		b1.start();
		b2.start();
		// zur Demonstration von wait()/notify()-Problemen
		Thread.sleep(2000);
		System.out.println(result.getResult());
	}
} //end class B1_Tester
