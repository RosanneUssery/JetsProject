package Jets;

public class SpaceCraft {
	private String model;
	private int speed;
	private int range;
	private double price;
	private static SpaceCraft[] crafts;

	public SpaceCraft(String model, int speed, int range, double price) {
		this.model = model;
		this.price = price;
		this.range = range;
		this.speed = speed;
	}

	static { // initializes craft once for the class
		crafts = new SpaceCraft[10];
		crafts[0] = new SpaceCraft("Explorer", 100, 500, 4500.0);
		crafts[1] = new SpaceCraft("Scout", 200, 100, 3300.00);
		crafts[2] = new FTL("Fighter", 300, 200, 5500.00, true);
		crafts[3] = new FTL("Medical", 400, 200, 6000.00, true);
		crafts[4] = new FTL("Transport", 500, 300, 7500.00, true);
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

	public void setPrice(double price) {
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
		builder.append("SpaceCraft [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
