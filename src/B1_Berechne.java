
public class B1_Berechne extends Thread {
	B1_Result _r;
	char _t;
	B1_Berechne(B1_Result r, char t) {
		_r = r;
		_t = t;
	}
	
	public void run() {
		switch (_t) {
			case 'A': _r.putResult('A', 42)  ;
			break;
			case 'B': _r.putResult('B', 23)  ;
			break;
		}
	} //end run
} // end class B1_Berechne
