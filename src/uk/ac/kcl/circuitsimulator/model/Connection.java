package uk.ac.kcl.circuitsimulator.model;

public class Connection {
	private Outputs start;
	private Inputs end;
	private boolean state;

	public Connection(Outputs start, Inputs end) {
		this.start = start;
		this.end = end;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void breakConnection() {
		for (int i = 0; i < start.getOutputs().length; i++) {
			if (equals(start.getOutputs()[i])) {
				start.setOutput(i, null);
				break;
			}
		}
		if (end != null) {
			for (int i = 0; i < end.getInputs().length; i++) {
				if (equals(end.getInputs()[i])) {
					end.setInput(i, null);
					break;
				}
			}
		}
	}

	public Outputs getStart() {
		return start;
	}

	public Inputs getEnd() {
		return end;
	}

	public void setStart(Outputs start) {
		this.start = start;
	}

	public void setEnd(Inputs end) {
		this.end = end;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Connection) {
			Connection conn = (Connection) o;
			return conn.getState() == state && conn.getStart() == getStart() && conn.getEnd() == getEnd();
		}
		return false;
	}
}