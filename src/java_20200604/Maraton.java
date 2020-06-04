package java_20200604;import java.util.ArrayList;
import java.util.Arrays;

public class Maraton {
	
	public static String[] test(String[] participant, String[] completion) {
		
		ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(participant));
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(completion));

		ArrayList<String> arrayList3 = new ArrayList();
		
		arrayList3.add("sadA");
		
		int S= 0;
		for(int i=0;i<participant.length;i++) {
			int count=0;
			for(int j=0;j<completion.length;j++) {
				if(participant[i].equals(completion[j])) {
					count++;
				}
			if(count==0) {
				
				S++;
			}
				
			}
			
			
		}
		
	
		return fin;
	}
	
	public static void main(String[] args) {
		
		ArrayList A = new ArrayList();
		ArrayList B = new ArrayList();
		
		A.add("leo");
		A.add("kiki");
		
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};

		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(participant));

			

		System.out.println(arrayList);


		
		
	}

}
