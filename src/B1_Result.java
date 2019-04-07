
public class B1_Result {
	int resA, resB;
	
	public synchronized String getResult() {
		try {
			if (resA == 0 | resB == 0) {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Der Sinn des Lebens ist entweder "+resA+" oder auch "+resB;
	}
	public synchronized void putResult(char t, int r) {
		switch (t) {
			case 'A': resA = r;
			break;
			case 'B': resB = r;
			break;
		}
		if (resA > 0 & resB >0) {
			notify();
		}
	} // end putResult
} // end class B1_Result
