package Console;

import java.util.List;

public class OutputTestAdapter implements output{
	ConsoleOutput consoleOutput;
	public OutputTestAdapter(ConsoleOutput consoleOutput) {
		this.consoleOutput = consoleOutput;
	}
	public void output(String message) {
		consoleOutput.output(message);
	}
	public List<String> getStoreOutput(){
        return consoleOutput.storeOutput;
	}

}
