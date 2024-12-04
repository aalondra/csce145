import java.util.Scanner;

public class DecisionsGame {

	public static void main(String[] args) {

		//scanner
		Scanner key =new Scanner(System.in);

		//stating initial
		String Contestant1Prize = "nothing";
		String Contestant2Prize = "nothing";
		
		
		String MarkerPrize = "a red marker";
		String DeskPrize= "a black pen";
		String BagPrize= "a kitkat";
		
		System.out.println("Contestant 1 I will give you this marker, would you like to keep it or trade it with what\'s in my desk or what\'s in my bag. Enter \"keep\", \"desk\", or \"bag\": ");
		
		String response = key.next();
		
		//Contestant 1 option of choosing desk 
		if (response.equalsIgnoreCase("desk"))
		{
			Contestant1Prize = DeskPrize; 
			
		//asking contestant 2 after contestant 1 chose desk prize
			System.out.println("Contestant 2 would you like to keep the marker or trade it with what\'s in my bag. \"keep\" or \"bag\": ");
			
			response = key.next();
			
			//contestant2 choice
			if(response.equalsIgnoreCase("keep"))
			{		
			Contestant2Prize = MarkerPrize;
			}
			else if (response.equalsIgnoreCase("bag"))
			{
			Contestant2Prize = BagPrize;
			}
					
			else
				System.out.println("You got nothing.");
		
			//end of first if statement
		}
		
		
		
		//if contestant 1 chooses bag
		else if (response.equalsIgnoreCase("bag"))
		{
			Contestant1Prize = BagPrize;
			
			//asking contestant 2
		System.out.println("Contestant 2 Would you like to keep the marker or trade it with what\'s on my desk. Enter \"keep\" or \"desk\": ");
		response= key.next();
		if(response.equalsIgnoreCase("keep"))
		{
		Contestant2Prize = MarkerPrize;
		}
		else if(response.equalsIgnoreCase("desk"))
		{
		Contestant2Prize= DeskPrize;	
		}
		else
		{
		System.out.println("You got nothing");
		}
			
			//end of 2nd option	
		}
		
		
		
		
		//contestant 1 third choice
		else if (response.equalsIgnoreCase("keep"))
		{
			Contestant1Prize= MarkerPrize;	
			
		//Contestant 2 choices after contestant one chose to keep marker
		System.out.println("Contestant 2 Would you like to keep what's on my desk or what's in my bag. Enter \"desk\" or \"bag\": ");
		response= key.next();
		
		if(response.equalsIgnoreCase("desk"))
		{
			Contestant2Prize = DeskPrize;
		}
		else if(response.equalsIgnoreCase("bag")) 
		{
			Contestant2Prize= BagPrize;
		}
		else 
		{
			System.out.println("You got nothing");
		}
		//end of 3rd choice
			
		
		} 
		else
		{
			System.out.println("You got nothing.");
		}
		
		
		//after choices are made
		
		System.out.println("Contestant 1 gets " + Contestant1Prize );
		System.out.println("Contestant 2 gets "+ Contestant2Prize);
		
		
		
		
		
		
		
		
		}
	}
