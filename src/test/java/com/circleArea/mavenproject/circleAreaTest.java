package com.circleArea.mavenproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;

//import org.junit.Test;
public class circleAreaTest {
	circleArea ca = new circleArea();

	@Test
	public void test() {
		// fail("Not yet implemented");
		// assertEquals(4,circleArea.area(4));
		
		Assertions.assertEquals(50.26548245743669, ca.area(4));

		// System.out.println("Circumfearance is:",ca);
	}

}
