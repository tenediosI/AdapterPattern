package Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadTestAdapter implements Config{
	LoadConfig loadConfig;
	List<String> names = new ArrayList<String>();
	public LoadTestAdapter(LoadConfig loadConfig) {
		this.loadConfig = loadConfig;
	}

	@Override
	public void setPropertyReader(Scanner propertyReader) {
		loadConfig.setPropertyReader(propertyReader);
		
	}

	@Override
	public List<String> getConfig() {
		if (names.size() != 0 ) {
			return names;
		}
		return loadConfig.getConfig();
	}
	public void setNames(List<String> namesList) {
		for (int i = 0;i < namesList.size();i++) {
			names.add(namesList.get(i));
		}
	}

}
