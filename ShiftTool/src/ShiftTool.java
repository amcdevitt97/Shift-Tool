import java.util.Scanner;
import java.util.ArrayList;

public class ShiftTool {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> shiftValues = new ArrayList<Integer>();
		
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a string: ");
		String string = reader.nextLine();
		System.out.println("How many shifts?: ");
		int shifts = reader.nextInt();
		
		
		for(int i=0; i<shifts; i++){
			System.out.println("Shift level?: ");
			int shiftValue = reader.nextInt();
			shiftValues.add(shiftValue);	
		}

		System.out.println("Shift of 0 : "+string);
		for(int i=0; i<shifts; i++){
			// for each shift value, shift each letter in string
			shiftValues.get(i);
			// make for loop cycling through each char in string
			String newString = "";
			for(int j=0; j<string.length(); j++){
				char current = string.charAt(j);
				
				char shifted;
				if(current-shiftValues.get(i)<65 && current != 32){
					shifted = (char) (current+26 - shiftValues.get(i));
				}
				// space handling
				else if(current == 32){
					shifted = (char)32;
				}else{
					shifted = (char) (current - shiftValues.get(i));
				}
				newString = newString + shifted;
			}
			System.out.println("Shift of "+shiftValues.get(i)+" : "+ newString);

		}
		reader.close();
	}
}
