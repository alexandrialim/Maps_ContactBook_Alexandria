import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Contact_AlexandriaLim {

	public static void main(String[] args) {
		
		Map<String, Double> contactBook = new HashMap<String, Double>();
		
		
		Scanner scn = new Scanner(System.in);
	    System.out.println("Input A Contact Name:");
	    String name = scn.next();
	    System.out.println("Input A Phone Number:");
	    Double Pnum = scn.nextDouble();
	    contactBook.put(name, Pnum);
	    int i = 0;
	    
	    while(contactBook.size() > 0 && i == 0){
	    	System.out.print("Want to add another contact? Y / N ");
			String choice = scn.next();
			if(choice.equals("Y")){
			System.out.println("Input A Contact Name:");
		    name = scn.next();
		    System.out.println("Input A Phone Number:");
		    Pnum = scn.nextDouble();
		    contactBook.put(name, Pnum);
			}
			else if(choice.equals("N")) {
				System.out.println("");
				System.out.println("Done!");
				scn.close();
				i++;
			}
	    }
	    
	    contactBook.forEach((names, num) -> System.out.println(names + "'s Phone Number is " + num.intValue()));
	}

}
