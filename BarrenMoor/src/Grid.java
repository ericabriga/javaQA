import java.util.Scanner;

public class Grid {

	public static void main(String[] args) {

		// initializing scanner
		Scanner move = new Scanner(System.in);

		// initializing grid
		String grid[][] = new String[10][10];

		int playerPositionX = 7;
		int playerPositionY = 2;
		int treasurePositionX = 3;
		int treasurePositionY = 4;

		// player's position
		grid[playerPositionX][playerPositionY] = "•";

		// treasure's position
		grid[treasurePositionX][treasurePositionY] = "$";
		
		// printing grid
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = "_";
				
				
				System.out.print("|_" + grid[i][j] + "_|");
			} System.out.println("");
		}

		System.out.println(Math.hypot(treasurePositionX - playerPositionX, treasurePositionY - playerPositionY));

		// player directions
		
		while (playerPositionX != treasurePositionX || playerPositionY != treasurePositionY) {

			System.out.println("Please press 1=north; 2=east; 3=south 4=west");
			
			int direction = move.nextInt();
			
			switch (direction) {
			
			case 1:
				playerPositionX = playerPositionX - 1;
				break;
			case 2:
				playerPositionY = playerPositionY + 1;
				break;
			case 3:
				playerPositionX = playerPositionX + 1;
				break;
			case 4:
				playerPositionY = playerPositionY - 1;
				break;
			}
			
			grid [playerPositionX][playerPositionY] = "•";
			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid.length; j++) {

					System.out.print("|_" + grid[i][j] + "_|");
				}

				System.out.println();
			}

			System.out.println(Math.hypot(treasurePositionX - playerPositionX, treasurePositionY - playerPositionY));

		}
move.close();
System.out.println("Well done!");
	}
	

}
