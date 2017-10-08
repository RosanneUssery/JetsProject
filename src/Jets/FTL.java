package Jets;

public class FTL extends SpaceCraft {
	private boolean fTL;



	public FTL(String model, int speed, int range, int price, boolean fTL) {
		super(model, speed, range, price);
		this.fTL = fTL;
	}

	public boolean isfTL() {
		return fTL;
	}

	public void setfTL(boolean fTL) {
		this.fTL = fTL;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("( FTL=");
		builder.append(fTL);
		builder.append(") ");
		return builder.toString();
	} 
	
	
}


// explorer, fighter, scout, medical, transport