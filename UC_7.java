package snake;

public class UC_7 {

public static void main (String[] args) {
		
		//Initialize the position of Player
		int position = 0;
		int countA =0;
		int countB = 0;
		while(position!=100) {
		
			//Get the number on Dice and Upgradation
			int dice = (int) Math.floor(Math.random()*6 +1);
			
			int temp = position;
			

			//Checking for option
			int option = (int) Math.floor(Math.random()*10)%3;
	
			switch(option) {
			case 1: position = position + dice;
			break;
			case 2: position = position - dice;
			break;
			default :
			position = position;
		
			}	
			//Checking for 100 and zero
			if(position>100)
				position = temp;
			else if (position<0)
				position = 0;
			
			countA++;
			}
		
		position = 0;
		
		//
		while(position!=100) {
			
			//Get the number on Dice and Upgradation
			int dice = (int) Math.floor(Math.random()*6 +1);
			
			int temp = position;
			
	
			//Checking for option
			int option = (int) Math.floor(Math.random()*10)%3;
	
			switch(option) {
			case 1: position = position + dice;
			break;
			case 2: position = position - dice;
			break;
			default :
			position = position;
		
			}	
			//Checking for 100 and zero
			if(position>100)
				position = temp;
			else if (position<0)
				position = 0;
			
			countB++;
			}
			
		
		
			// Find the Winner
			if(countA>countB)
			System.out.println("Player B is the Winner in moves "+countB);
			else if(countA<countB)
			System.out.println("Player A is the Winner in moves "+countA);
			else 
				System.out.println("The game is Draw");
		}
}

		
		