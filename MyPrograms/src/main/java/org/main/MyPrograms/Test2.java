package org.main.MyPrograms;

import org.junit.Test;

public class Test2 {
public String toUpperCase(String str) {
	char[] a = new char[str.length()];
	a=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		if((int)a[i]>97 && (int)a[i]<122) {
		if(a[i]==' ') {
			a[i] = ' ';
		}else {
		a[i]=(char) ((int)a[i]-32);
		}
		}else {
			return "Please input only lower case letters";
		}
	}
	String res = String.valueOf(a);
	System.out.println(res);
	return res;
}
@Test
public void toUpperCasetest() {
	toUpperCase("hi how are you");	
}
}

