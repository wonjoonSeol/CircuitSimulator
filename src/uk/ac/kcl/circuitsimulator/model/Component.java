package uk.ac.kcl.circuitsimulator.model;

import uk.ac.kcl.circuitsimulator.util.Location;

public abstract class Component {

	private Location location;
	
	public Component(Location location) {
		this.location = location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public abstract void update();
}
