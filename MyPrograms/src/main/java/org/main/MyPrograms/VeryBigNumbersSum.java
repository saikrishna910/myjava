package org.main.MyPrograms;

import java.math.BigInteger;

public class VeryBigNumbersSum {
public String sumOfBigNum(String str,String str1) {	
	char []a =  str.toCharArray();
	char []b = str1.toCharArray();
	int resLen = a.length;
	if( b.length > a.length ) {
		resLen = b.length;
	}
	resLen = resLen +1;
	char[] res = new char[resLen];
	int prevCarry = 0;
	for(int i=a.length-1, j=b.length-1, k = res.length - 1;i>=0 || j>=0; i--, j--, k--) {	
			int aDigit = 0; 
			if( i >=0) {
				aDigit = Character.digit(a[i], 10);
			}
			int bDigit =0;
			if( j >= 0) {
				bDigit = Character.digit(b[j], 10);
			}
			int resDigit = prevCarry + aDigit + bDigit;
			prevCarry = resDigit /10;
			resDigit = resDigit%10;
			res[k] = Character.forDigit(resDigit, 10);
	}
	if(prevCarry!=0) {
	res[0] = Character.forDigit(prevCarry, 10);
	}else {
		res[0]=' ';
	}
	return new String(res);
}
public static VeryBigNumbersSum build() {
	VeryBigNumbersSum sum = new VeryBigNumbersSum();
//	sum.sumOfBigNum("", "");
	return sum;
}
}
