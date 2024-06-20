package TestCases;

import org.testng.annotations.Test;

public class demo {
	String id= " | 6652d57fae2afd4c0be5a36a | ";

	@Test
	public void demoTest() {
		id =id.split(" ")[2];
		System.out.println(id);
	}
}
