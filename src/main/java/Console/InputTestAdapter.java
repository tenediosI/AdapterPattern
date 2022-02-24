package Console;

public class InputTestAdapter implements Input {
	ConsoleInput consoleInput;
	String string;
	String userAction;
	String cardRaw;
	int integer;
	public InputTestAdapter(ConsoleInput consoleInput) {
		this.consoleInput = consoleInput;
	}

	@Override
	public String getString() {
		return string;
	}

	@Override
	public int getInteger() {
		return integer;
	}
	public void setString(String s) {
		this.string = s;
	}
	public void setInteger(int n) {
		this.integer = n;
	}
	public void setUserAction(String s) {
		this.userAction = s;
	}
	public String getUserAction() {
		return userAction;
	}
	public void setCardRaw(String s) {
		this.cardRaw = s;
	}

	public String getCardRaw() {
		return cardRaw;
	}


}
