package uk.ac.kcl.circuitsimulator.model;
import uk.ac.kcl.circuitsimulator.util.Location;

public class Gate extends Component implements Inputs, Outputs{

	private Connection[] outputs, inputs;
	
	public Gate(Location location, int noOfInputs, int noOfOutputs){
		super(location);
		inputs = new Connection[noOfInputs];
		outputs = new Connection[noOfOutputs];
	
	}
	
	@Override
	public void update(){
		
	}

	@Override
	public Connection[] getOutputs() {
		return outputs;
	}

	@Override
	public void setOutput(int i, Connection connection) {
		outputs[i] = connection;
	}

	@Override
	public Connection[] getInputs() {
		return inputs;
	}

	@Override
	public void setInput(int i, Connection connection) {
		inputs[i] = connection;
	}
}