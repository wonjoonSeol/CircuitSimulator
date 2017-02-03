package uk.ac.kcl.circuitsimulator.model;

import uk.ac.kcl.circuitsimulator.util.Location;

public abstract class Output extends Component implements Inputs {

	private Connection[] inputs;
	
	public Output(Location location, int numOfInputs) {
		super(location);
		inputs = new Connection[numOfInputs];
	}

	@Override
	public Connection[] getInputs() {
		return inputs.clone();
	}

	@Override
	public void setInput(int i, Connection connection) {
		inputs[i] = connection;
	}
}
