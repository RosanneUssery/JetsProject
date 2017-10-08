package Jets;

public class SpaceCraft implements Pilot{
	private String model;
	private int speed;
	private int range;
	private int price;
	private static SpaceCraft[] crafts;

	public SpaceCraft(String model, int speed, int range, int price) {
		this.model = model;
		this.price = price;
		this.range = range;
		this.speed = speed / (int)(767.269);
	}

	static { // initializes craft once for the class
		crafts = new SpaceCraft[10];
		crafts[0] = new SpaceCraft("Explorer", 80_000, 500, 4500);
		crafts[1] = new SpaceCraft("Scout", 5_000, 50, 500);
		crafts[2] = new FTL("Fighter", 90_000, 200, 5500, true);
		crafts[3] = new FTL("Medical", 60_000, 200, 6000, true);
		crafts[4] = new FTL("Transport", 70_000, 300, 7500, true);
	}

	public static void listCraft() {
		System.out.println("*** SpaceCraft in this Hangar ***");
		for (SpaceCraft craft : crafts) {
			if (craft != null) {
				System.out.println(craft);
			}
		}
	}

	public static SpaceCraft fastestCraft() {
		SpaceCraft fastest = crafts[0];
		for (SpaceCraft spaceCraft : crafts) {
			if (spaceCraft != null) { // iterate over spaceship array.
				if (spaceCraft.speed > fastest.speed) {
					fastest = spaceCraft; // find fastest spaceship to return
				}
			}
		}
		return fastest;
	}

	public static SpaceCraft farthestCraft() {
		SpaceCraft farthest = crafts[0];
		for (SpaceCraft spaceCraft : crafts) {
			if (spaceCraft != null) { // iterate over spaceship array.
				if (spaceCraft.range > farthest.range) {
					farthest = spaceCraft; // find farthest spaceship to return
				}
			}
		}
		return farthest;
	}

	public String getModel() {
		return model;
	}

	public int getSpeed() {
		return speed;
	}

	public int getRange() {
		return range;
	}

	public double getPrice() {
		return price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/*
	 * * User Story #2
	 * 
	 * List fleet prints out the model, speed, range, and price of each jet. (There
	 * must be at least 5 jets stored when the program starts).
	 */

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SpaceCraft ");
		builder.append(model);
		builder.append(" (speed (% Mach1 ");
		builder.append(speed);
		builder.append(") (range ");
		builder.append(range);
		builder.append(" au) (price ");
		builder.append(price);
		builder.append("\u03BC) ");
		return builder.toString();
	}

	public static boolean addSpaceCraft(SpaceCraft s) {
		boolean added = false;
		for (int i = 0; i < crafts.length; i++) {
			if (crafts[i] == null) {
				crafts[i] = s;
				added = true;
				break;
			}
		
		}
		return added;
		
	}

}
