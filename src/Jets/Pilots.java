package Jets;

public class Pilots {

	private static String pilot[] = new String[] { "Susanna Miller", "Arjay Sharana", "Corva Petroski", "Rain Smith",
			"Serena Jememez" };

	/*
	 * public static void assignPilots() { for (int i = 0; i < pilot.length; i++) {
	 * System.out.println(pilot[i]); } }
	 */
	public static String assignPilots() {
		String rand = pilot[(int) (Math.floor(Math.random() * pilot.length))];
		return rand;
	}

	
	public static String[] getPilot() {
		return pilot;
	}

	public static void setPilot(String[] pilot) {
		Pilots.pilot = pilot;
	}

	public Pilots() {
	}

}
