package uk.ac.kcl.circuitsimulator.model;

import uk.ac.kcl.circuitsimulator.util.Location;

public abstract class Input extends Component implements Outputs {

	private Connection[] outputs;
	
	public Input(Location location, int numOfOutputs) {
		super(location);
		outputs = new Connection[numOfOutputs];
	}

	@Override
	public Connection[] getOutputs() {
		return outputs.clone();
	}

	@Override
	public void setOutput(int i, Connection connection) {
		outputs[i] = connection;
	}

	@Override
	public void update() {
		
	}
	
	public abstract void handleInput();
}
