import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NetworkAnalyzer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie die Sequenz von Graden an (z.B. 1 2 3 4 4): ");
		String sequenceInput = s.nextLine();
		String[] zahlenStrings = sequenceInput.trim().split("\\s+"); // \s+ bedeutet ein oder mehrere Leerzeichen
		ArrayList<Integer> seq = new ArrayList<Integer>();
		
		for(String str : zahlenStrings) {
			seq.add(Integer.parseInt(str));
		}
		
		
	}
	
	ArrayList<Integer> seq;
	
	public NetworkAnalyzer(ArrayList<Integer> seq) {
		Collections.sort(seq, Collections.reverseOrder());
		this.seq = seq;
	}
	
	public ArrayList<String> erdosInequality(){
		ArrayList<String> res = new ArrayList<String>();
		
		
		for(int i = 0; i < seq.size(); i++) {
			int rhs = 0;
			
			for (int j = 0; j < i+1; j++) {
				rhs += seq.get(j);
			}
			
			int lhs = 0; //Hier weitermachen

		}
		
		return null;
	}
}
