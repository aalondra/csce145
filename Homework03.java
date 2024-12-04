//Alondra Arredondo
import java.util.Random;
import java.util.Scanner;

public class Homework03 {
	
	public static final int MAX = 3;
	public static void main(String[] args) {
		
	
			//creating scanner object
			Scanner key = new Scanner(System.in);
			
			//creating random object
			Random r = new Random();
	//play Again
	while(true)
	{
				//stating initial 
				int PlayerScore = 0;
				int ComputerScore = 0;
				
				//identifying the choices
				String rock = "r"; 
				String paper= "p";
				String scissors = "s";
				
				//computer choices
				int computer = r.nextInt(MAX); //0, 1, 2
				
				String handSign = "";
				switch(computer)
				{
				case 0:
					handSign = "rock";
					break;
				case 1:
					handSign = "paper";
					break;
				case 2:
					handSign = "scissors";
					break;
				
				}

						//first line
						System.out.println("Rock, Paper, Scissors! Best out of 3 wins!");
						//first round
						while(true)
							{
							
								//allowing for user input (first round)
										System.out.println("Round 1: Please enter your move (\"r\", \"p\", or \"s\"):");
										String playerMove1 = key.next();
					
										if(playerMove1.equalsIgnoreCase("r")||playerMove1.equalsIgnoreCase("p")||playerMove1.equalsIgnoreCase("s"))
										{
											System.out.println("The computer chose "+ handSign + ".");
						//assigning score 
											//if player and computer have the same move 
											if(playerMove1.equalsIgnoreCase("r")&& handSign.equals("rock")||playerMove1.equalsIgnoreCase("p")&&handSign.equals("paper")|| playerMove1.equalsIgnoreCase("s")&& handSign.equals("scissors") )
											{
												System.out.println("Round is a tie! No points earned");
											}
											
											//if player wins 
											if(playerMove1.equalsIgnoreCase("r")&& handSign.equals("scissors"))
												{
													System.out.println("Rock beats Scissors! Player wins round 1. Player earns 1 point!"); 
													PlayerScore++;
												
												}
											else if (playerMove1.equalsIgnoreCase("p")&& handSign.equals("rock"))
											{
												System.out.println("Paper beats Rock! Player wins round 1. Player earns 1 point!"); 
												PlayerScore++;

											}
											else if (playerMove1.equalsIgnoreCase("s")&& handSign.equals("paper"))
											{
												System.out.println("Scissors beats Paper! Player wins round 1. Player earns 1 point!"); 
												PlayerScore++;
											}
											
											//if computer wins
											if(handSign.equals("rock")&& playerMove1.equalsIgnoreCase("s"))
											{
												System.out.println("Rock beats Scissors! Computer wins round 1. Computer earns 1 point!"); 
												ComputerScore++;
											
											}
										else if (handSign.equals("paper")&& playerMove1.equalsIgnoreCase("r"))
										{
											System.out.println("Paper beats Rock! Computer wins round 1. Computer earns 1 point!"); 
											ComputerScore++;

										}
										else if (handSign.equals("scissors")&& playerMove1.equalsIgnoreCase("p"))
										{
											System.out.println("Scissors beats Paper! Computer wins round 1. Computer earns 1 point!"); 
											ComputerScore++;
										}

											break;//move on to round 2

										}
										else {
									System.out.println("Invalid Input! Please try again");
										}
							}			
	
	//second round
		//round 2 computer
		int computer2 = r.nextInt(MAX); //0, 1, 2
		
		String handSign2 = "";
		switch(computer2)
		{
		case 0:
			handSign2 = "rock";
			break;
		case 1:
			handSign2 ="paper";
			break;
		case 2:
			handSign2 = "scissors";
			break;
		
		}

			while(true)
			{
						//allowing for user input (second round)
						System.out.println("Round 2: Please enter your move (\"r\", \"p\", or \"s\"):");
						String playerMove2 = key.next();
	
						if(playerMove2.equalsIgnoreCase("r")||playerMove2.equalsIgnoreCase("p")||playerMove2.equalsIgnoreCase("s"))
						{
							System.out.println("The computer chose "+ handSign2 + ".");
		//assigning score 
							//if player and computer have the same move 
							if(playerMove2.equalsIgnoreCase("r")&& handSign2.equals("rock")||playerMove2.equalsIgnoreCase("p")&&handSign2.equals("paper")|| playerMove2.equalsIgnoreCase("s")&& handSign2.equals("scissors") )
							{
								System.out.println("Round is a tie! No points earned");
							}
							
							//if player wins 
							if(playerMove2.equalsIgnoreCase("r")&& handSign2.equals("scissors"))
								{
									System.out.println("Rock beats Scissors! Player wins round 2. Player earns 1 point!"); 
									
									PlayerScore++;
								
								}
							else if (playerMove2.equalsIgnoreCase("p")&& handSign2.equals("rock"))
							{
								System.out.println("Paper beats Rock! Player wins round 2. Player earns 1 point!"); 
								PlayerScore++;

							}
							else if (playerMove2.equalsIgnoreCase("s")&& handSign2.equals("paper"))
							{
								System.out.println("Scissors beats Paper! Player wins round 2. Player earns 1 point!"); 
								PlayerScore++;
							}
							
							//if computer wins
							if(handSign2.equals("rock")&& playerMove2.equalsIgnoreCase("s"))
							{
								System.out.println("Scissors beats Rock! Computer wins round 2. Computer earns 1 point!"); 
								ComputerScore++;
							
							}
						else if (handSign2.equals("paper")&& playerMove2.equalsIgnoreCase("r"))
						{
							System.out.println("Paper beats Rock! Computer wins round 2. Computer earns 1 point!"); 
							ComputerScore ++;

						}
						else if (handSign2.equals("scissors")&& playerMove2.equalsIgnoreCase("p"))
						{
							System.out.println("Scissors beats Paper! Computer wins round 2. Computer earns 1 point!"); 
							ComputerScore ++;
						}

							break;//move on to round 3

						}
						else {
							System.out.println("Invalid Input! Please try again");
						}
			}			
			
			//round 3 computer computer choices
			int computer3 = r.nextInt(MAX); //0, 1, 2
			
			String handSign3 = "";
			switch(computer3)
			{
			case 0:
				handSign3 = "rock";
				break;
			case 1:
				handSign3 ="paper";
				break;
			case 2:
				handSign3 = "scissors";
				break;
			
			}

		//third round
			while(true)
			{
						//allowing for user input (third round)
						System.out.println("Round 3: Please enter your move (\"r\", \"p\", or \"s\"):");
						String playerMove3 = key.next();
						if(playerMove3.equalsIgnoreCase("r")||playerMove3.equalsIgnoreCase("p")||playerMove3.equalsIgnoreCase("s"))
						{
							
							if(playerMove3.equalsIgnoreCase("r")||playerMove3.equalsIgnoreCase("p")||playerMove3.equalsIgnoreCase("s"))
							{
								System.out.println("The computer chose "+ handSign3 + ".");
						//assigning score 
								//if player and computer have the same move 
								if(playerMove3.equalsIgnoreCase("r")&& handSign3.equals("rock")||playerMove3.equalsIgnoreCase("p")&&handSign3.equals("paper")|| playerMove3.equalsIgnoreCase("s")&& handSign3.equals("scissors") )
								{
									System.out.println("Round is a tie! No points earned");
								}
								
								//if player wins 
								if(playerMove3.equalsIgnoreCase("r")&& handSign3.equals("scissors"))
									{
										System.out.println("Rock beats Scissors! Player wins round 3. Player earns 1 point!"); 
										
										PlayerScore++;
									
									}
								else if (playerMove3.equalsIgnoreCase("p")&& handSign3.equals("rock"))
								{
									System.out.println("Paper beats Rock! Player wins round 3. Player earns 1 point!"); 
									PlayerScore++;

								}
								else if (playerMove3.equalsIgnoreCase("s")&& handSign3.equals("paper"))
								{
									System.out.println("Scissors beats Paper! Player wins round 3. Player earns 1 point!"); 
									PlayerScore++;
								}
								
								//if computer wins
								if(handSign3.equals("rock")&& playerMove3.equalsIgnoreCase("s"))
								{
									System.out.println("Rock beats Scissors! Computer wins round 3. Computer earns 1 point!"); 
									ComputerScore++;
								
								}
							else if (handSign3.equals("paper")&& playerMove3.equalsIgnoreCase("r"))
							{
								System.out.println("Paper beats Rock! Computer wins round 3. Computer earns 1 point!"); 
								ComputerScore++;

							}
							else if (handSign3.equals("scissors")&& playerMove3.equalsIgnoreCase("p"))
							{
								System.out.println("Scissors beats Paper! Computer wins round 3. Computer earns 1 point!"); 
								ComputerScore++;
							}

								break;//move on to final points

							}
							else {
								System.out.println("Invalid Input! Please try again");
							}
				}			
								
			}
					//tie(in points)
					if (PlayerScore == ComputerScore)
					{
						System.out.println("Game ends in a tie!");
					}
					//player win
					else if (PlayerScore > 1)
							{
						System.out.println("Player wins Game!");
							}
					//computer
					else if (ComputerScore > 1)
					{
						System.out.println("Computer wins Game!");
					}
		
			//asking if user wants to play again
			System.out.println("Would you like to play again? Enter \"yes\" or \"no\"");
			String playAgain = key.next();
			
			//end of program
			if(playAgain.equalsIgnoreCase("no"))
					{
				System.out.println("End of Program!");
				System.exit(0);
					}
			}
	}		
}

