package nopCom.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class DataContext {

	private Map<String, Object> dataContext;

	public DataContext() {
		dataContext = new HashMap<>();
	}

	public void setContext(Context key, Object value) {
		dataContext.put(key.toString(), value);
	}

	public String getContext(Context key) {
		return (String) dataContext.get(key.toString());
	}

}

/**
 Luu y cho viec su dung TestContext:
 TextContext chi co the ap dung de share dataContext trong cung 1 scenario thoi.
 Khong the share dataContext giua cac scenario khac nhau (==>Doc tai lieu trong phan Parallel testing and Share data test) 
 Neu muon share data giua cac scenario khac nhau thì best practice o hien tai la chuyen nguoc lai dung Static variables.
 **/