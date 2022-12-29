package org.main.MyPrograms;

public class Test1 {
public void test(int n) {
	int sum=0;
	while(n!=0) {
	int temp=n%10;
	sum = sum+temp;
	n=n/10;
	System.out.println(sum);
	}
}

public void sumOfBigNum(String a,String b) {	
	
	a = "3999988889999999995555558888999444333333333222229998877666555444888888";
    b = "56867865876989679765465456412332199";
    int loop1 = 0;
    int loop2 = 0;
    StringBuilder sum = new StringBuilder("");
    int carry = 0;
    for (loop1 = a.length() - 1, loop2 = b.length() - 1; loop1 >= 0 || loop2 >= 0; loop1--, loop2--) {
        int indiv1 = 0;
        if (loop1 >= 0)
            indiv1 = Integer.parseInt("" + a.charAt(loop1));
        int indiv2 = 0;
        if (loop2 >= 0)
            indiv2 = Integer.parseInt("" + b.charAt(loop2));
        int summation = indiv1 + indiv2 + carry;
        double d = Math.floor(summation / 10);
        carry = (int) d;
        int sum2 = summation % 10;
        sum.append(sum2);
    }
    System.out.println(sum.reverse());	
}
public static VeryBigNumbersSum build() {
	VeryBigNumbersSum sum = new VeryBigNumbersSum();
//	sum.sumOfBigNum("", "");
	return sum;
}
}