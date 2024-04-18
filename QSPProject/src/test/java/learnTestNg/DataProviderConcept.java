package learnTestNg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	
	@Test(dataProvider = "data")
	public void orgDetails(String orgName, String loc) {
		System.out.println(orgName+"---->"+loc);
	}

	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[2][2];
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("QSP", "Testing");
		map.put("JSP", "JAVA");
		int i=0;
		for(Entry<String, String>entry:map.entrySet()) {
			obj[i][0]=entry.getKey();
			obj[i][1]=entry.getValue();
			i++;
		}
		
		
		return obj;
	}

}
