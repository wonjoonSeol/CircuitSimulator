package uk.ac.kcl.circuitsimulator.util;

public class Location {

	private int x;
	private int y;
	
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void move(int relativex, int relativey){
		x += relativex;
		y += relativey;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public Location clone(){
		return new Location(x, y);
	}
	
}
