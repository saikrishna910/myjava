package org.test.MyProgramsTest;

import org.junit.Test;

public class ASCIIPrinter {
	public void asciiPrinter() {
	for(int j=97;j<=122;j++) {
		System.out.println("for "+j+" "+(char)j);
	}
	}
	
	public void asciiCapitalPrinter() {
		System.out.println();
		for(int j=0;j<=160;j++) {
			System.out.println("for "+j+" "+(char)j);
		}
		}
	@Test
	public void asciitest() {
		asciiPrinter();
		asciiCapitalPrinter();
	}
}
