package Jets;

import java.util.Scanner;

public class JetsMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int menu;

		// below ASCII images
		System.out.println("                      .");
		System.out.println("                 ---./|\\.---");
		System.out.println("| \\              '._/ | \\_.'             /  |");
		System.out.println("=[_|H)--._____ _.-'_'.|.'_'-._ _____.--(H|_]=");
		System.out.println("=[+--,-------'  '-._.'|'._.-'  '-------,--+]=");
		System.out.println("[|_/\"\"           .' \\ | / '.          \"\"\\_|]");
		System.out.println("                 ---'\\|/'---");
		System.out.println("                      '");
		System.out.println("Welcome to the Colonial Spaceport.");

		do {
			System.out.println("Please select from one of the following options:");
			System.out.println("______________________________________________");
			System.out.println("|  1. List Fleet                             |");
			System.out.println("|  2. View Fastest Spacecraft                |");
			System.out.println("|  3. View Spacecraft with the Longest Range |");
			System.out.println("|  4. Add a Spacecraft to the Fleet          |");
			System.out.println("|  5. Assign a pilot to a Spacecraft         |");
			System.out.println("|  6. Quit                                   |");
			System.out.println("|____________________________________________|");
			/*
			 * User Story #1 There is a menu with 5 options: List fleet / View fastest jet /
			 * View jet with longest range / Add a jet to Fleet / Quit
			 */
			menu = keyboard.nextInt();

			if (menu == 1) {
				System.out.println("You have selected \"List Fleet\".");
				/*
				 * User Story #2 List fleet prints out the model, speed, range, and price of
				 * each jet. (There must be at least 5 jets stored when the program starts)
				 */
				SpaceCraft.listCraft();
				System.out.println();
				System.out.println("Press 1 to return to the main menu. Press 2 to exit.");
				int menu2;
				menu2 = keyboard.nextInt();
				if (menu2 == 1) {
					continue;
				} else if (menu2 == 2) {
					break;
				}				/*
				 * if (menu2 != 1 && menu2 != 2) {
				 * System.out.println("Please select either 1 or 2"); }
				 */

			} else if (menu == 2) {
				System.out.println("You have selected \"View Fastest Spacecraft\".");

				String name = SpaceCraft.fastestCraft().getModel(); // method chaining
				System.out.println(name);
				System.out.println();
				System.out.println("Press 1 to return to the main menu. Press 2 to exit.");
				int menu2;
				menu2 = keyboard.nextInt();
				if (menu2 == 1) {
					continue;
				} else if (menu2 == 2) {
					break;
				}
				/*
				 * User Story #3 The view fastest jet and longest range options both print out
				 * all of the information about their jets.
				 */
				// won't need a separate class for this, just an argument to calculate speed.
			} else if (menu == 3) {
				System.out.println("You have selected \"View Spacecraft with the Longest Range\".");

				String name = SpaceCraft.farthestCraft().getModel(); // method chaining
				System.out.println(name);
				System.out.println();
				System.out.println("Press 1 to return to the main menu. Press 2 to exit.");
				int menu2;
				menu2 = keyboard.nextInt();
				if (menu2 == 1) {
					continue;
				} else if (menu2 == 2) {
					break;
				}
				// won't need a separate class for this, just an argument to calculate range
			} else if (menu == 4) {
				System.out.println("You have selected \"Add a Spacecraft to the Fleet\".");

				System.out.println("What is the spacecraft's model?");
				String model = keyboard.next();
				System.out.println("What is the spacecraft's speed (MPH)?");
				int speed = keyboard.nextInt();
				System.out.println("What it the spacecraft's range?");
				int range = keyboard.nextInt();
				System.out.println("What it the spacecraft's price?");
				double price = keyboard.nextDouble();

				SpaceCraft s = new SpaceCraft(model, speed, range, (int) price);

				if (SpaceCraft.addSpaceCraft(s)) {
					System.out.println(s + "added to hangar");
				} else {
					System.out.println("Sorry, the hanger is full.");
				}
				System.out.println();
				System.out.println("Press 1 to return to the main menu. Press 2 to exit.");
				int menu2;
				menu2 = keyboard.nextInt();
				if (menu2 == 1) {
					continue;
				} else if (menu2 == 2) {
					break;
				}
				/*
				 * User Story #5 A user can add custom jets to the fleet.
				 */
				// this will interface with an already existing array of other spaceships
				// Have the user input the info and add it to the array
			}
			else if (menu ==5){
				System.out.println("You have selected \"Assign a pilot to a Spacecraft\".");
				SpaceCraft.doPilot(); 
				/*this works to assign a pilot to a ship, but since it's random, the same
				 * pilot can be used more than once. Not sure how to fix that yet.
				*/
				
			}
			
/*			else if (menu == 6) {
				System.out.println("You have selected \"Hire a pilot for your ship\"");
				System.out.println("Which ship would you like to hire a pilot for?");
				SpaceCraft.listCraftNumbers();
			}*/
			//see comments for listCraftNumbers in SpaceCraft

		} while (menu < 6);
		System.out.println("Have a good day.");
		/*
		 * * User Story #4 Quit exits the program.
		 */
		keyboard.close();
		
	}
	
}
/*
 * Space fleet! hangars = planets pilots + species
 */

/*
 * Jets
 * 
 * Application Overview
 * 
 * You are going to create a fleet of jets!..in code...your application will be
 * a menu to access information about your jets.
 * 
 * As you work through the user stories think about what classes you will need
 * (it's probably more than you think) before your start writing code.
 * 
 * Structure
 * 
 * Jets must have a model, speed, range, and price associated with them. The
 * speed should be taken in MPH but displayed to the user in Mach.
 * 
 * 
 * Stretch Goals
 * 
 * User Story #6
 * 
 * Each jet has a pilot
 * 
 * User Story #7
 * 
 * Assign a random pilot to each jet that is created
 * 
 * User Story #8
 * 
 * Users can hire pilots
 * 
 * User Story #9
 * 
 * Whenever a jet's information is displayed, that jet's pilot and his/her
 * information should also be displayed
 * 
 * Grading
 * 
 * This is a graded project. You are expected to have your project completed by
 * the start of class on Monday morning.
 * 
 * You will be given either a pass or fail based on whether your code works
 * given all of the following test conditions:
 * 
 * When menu option 1 is pressed all Jets in the fleet are displayed to the
 * user. When menu option 2 is selected, the fastest jet from the list of Jets
 * should be displayed to the user. When menu option 3 is selected, the jet with
 * the longest range should be displayed to the user. When option 4 is pressed
 * you should be prompted to enter the model, speed (in MPH), range, and price.
 * This Jet should be added to the list of Jets so that when the user again
 * selects menu option 1, that custom jet is included. Option 5 should exit the
 * program. If the project does work with all of the above test conditions, you
 * will be given a 1 for this week's project.
 * 
 * If the project does not work with the above test conditions, you will be
 * given a 0 for this week's project.
 * 
 * If you get a zero on the project, you can upgrade to a score of .5 if you
 * turn in a working project by the start of class on the following Monday
 * morning AND notify an instructor that you wish to get partial credit.
 * 
 * To turn in a project, you must push it to GitHub. You must include a
 * README.md that describes how to run your program.
 * 
 */
