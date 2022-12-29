package org.main.MyPrograms;

import java.util.Scanner;

public class MyPrograms {
	public int ChangeSign(int n) {
		return n * -1;
	}

	public void PrintAscii(char c) {
		for (int i = 0; i < 255; i++) {
			System.out.println(+i + " is the ascii value of " + (char) i);
		}
	}

	public void MenuForArithmeticOperations() {
		int i = 1, a, b, s;
		Scanner sc = new Scanner(System.in);
		while (i == 1) {
			System.out.println("1 : To check to the sum the of two numbers");
			System.out.println("2 : To check to the difference the of two numbers");
			System.out.println("3 : To check to the Product the of two numbers");
			System.out.println("4 : To Perform division for two numbers");
			System.out.println("5 : To Exit");
			s = sc.nextInt();
			switch (s) {
			case 1:
				System.out.println("Enter the first number");
				a = sc.nextInt();
				System.out.println("Enter the second number");
				b = sc.nextInt();
				System.out.println("The Sum of the given numbers is " + (a + b));
				break;
			case 2:
				System.out.println("Enter the first number");
				a = sc.nextInt();
				System.out.println("Enter the second number");
				b = sc.nextInt();
				System.out.println("The Sum of the given numbers is " + (a - b));
				break;
			case 3:
				System.out.println("Enter the first number");
				a = sc.nextInt();
				System.out.println("Enter the second number");
				b = sc.nextInt();
				System.out.println("The Sum of the given numbers is " + (a * b));
				break;
			case 4:
				System.out.println("Enter the first number");
				a = sc.nextInt();
				System.out.println("Enter the second number");
				b = sc.nextInt();
				System.out.println("The Sum of the given numbers is " + (a / b));
				break;
			case 5:
				i = 0;
				System.out.println("Exited");
				break;
			}
		}
	}

	public Boolean IsPrimeOrNot(int n) {
		Boolean isprime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return isprime = false;
			}
		}
		return isprime;
	}

	public boolean isArmstrong(int n) {

		int sum=0;
		int n1=n;
		while(n!=0) {
				int temp = n%10;
				sum = sum + temp*temp*temp;
				n=n/10;
		}
			
		if(sum!=n1) {
			return false;
		}
		return true;
	}
	
	
	
	public Boolean isPerfect(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0 && n!=i) {
				sum = sum+i;
			}
		}
		if(sum!=n) {
			return false;
		}
		return true;
	}

	public Boolean isStirng(String str) {
		
		try {
		double i = Double.parseDouble(str);
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	
	public Boolean isPalendrome(int n) {
		int rev=0,temp,sum=0;
		temp=n;
		while(temp!=0) {
			rev=temp%10;
			sum = (sum*10) + rev;
			temp=temp/10;
		}
			if(sum!=n) {		
			return false;
		}
		return true;
	}
	
	
	public int Factorial(int n) {
		int fact = 1;
		for(int i=n;i>0;i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	public int Reverse(int n) {
		int rev=0,sum=0,temp;
		temp=n;
		while(temp!=0) {
			rev=temp%10;
			sum = (sum*10) + rev;
			temp = temp/10;			
		}
		return sum;
	}
	
/****** Different way
	public String Strreverse(String str) {
		String revstr="";
		char ch;
		for(int i=str.length()-1;i>=0;i--) {
			ch = str.charAt(i);
			revstr += ch;
			revstr = revstr + ch;
		}
		return revstr;
	}
 *******/
	public String Strreverse(String str) {
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			revstr =  ch + revstr;
		}
		return revstr;
	}
	
	public int duplicatevalue(int a[]) {
		int flag=0;
		int repeated=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					repeated=a[j];
					return repeated;
				}
			}
		}
		return 0;
	}
	
	public int commonValue(int a[],int b[]) {
		int flag=0;
		int repeated=0;
		for(int i=0;i<a.length;i++) {			
			for(int j=0;j<a.length;j++) {		
				if(a[i]==b[j]) {
					repeated=b[j];
					return repeated;
				}
			}
		}
		return 0;
	}
	

	public int AverageValue(int a[]) {
		int sum=0;
		int repeated=0;
		for(int i=0;i<a.length;i++) {			
				sum = sum + a[i];
				}
		int avg = sum/a.length;
		return avg;
	}

	
	public String concat(String str,String str1) {
		String concat="";
		concat = str.concat(str1);
		return concat;
	}
	
	public String ToUpperCase(String str) {
		String UpperCase="";
		UpperCase = str.toUpperCase();
		return UpperCase;
	}
	
	public String ToLowerCase(String str) {
		String LowerCase="";
		LowerCase = str.toLowerCase();
		return LowerCase;
	}
	
	public int SumOfDigits(int n) {
		int sum=0;
		while(n!=0) {
			int temp=n%10;
			sum = sum + temp;
			n=n/10;
		}
		return sum;
	}
	
	public int[] asscendingOrder(int a[]) {
		int temp=0;
		int length = a.length;
		int m = length/2;
		int c[] = new int[length];
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}		
		return a;
	}
	
	public int[] descendingOrder(int a[]) {
		int temp=0;
		int length = a.length;
		int m = length/2;
		int c[] = new int[length];
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	
	public void trianglePattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	

	
	public void reverseRighttrianglePattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" *");
			}			
			System.out.println();
		}
	}
	
	
	public void reverseRighttrianglePatternWithnumbers(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" "+j);
			}			
			System.out.println();
		}
	}
	
	
	public void UseOfForeachLoop(int a[]) {
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	


	
	public int[] UseOfForeachLoopFor2D(int a[][]) {		
		for (int[] i : a) {
			System.out.println();
			for (int j : i) {
				System.out.print(j+",");
			}
		}
		System.out.println();
		return null;
	}
	
	
	
	public void BoxPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	
	public void rightTrianglePattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	
	public void reversetrianglePattern(int n) {		
		for(int i=0;i<n;i++) {
			for(int j=n+i;j>n;j--) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public void DiamondPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}		
		for(int i=0;i<n;i++) {
			for(int j=n+i+1;j>n;j--) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	
	public void ParallelgramPattern(int n) {
		for(int i=1;i<n;i++) {
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n+1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	

	public void anotherParallegramPattern(int n) {	//Don't be lazy run and check which type of parallelgrom
		for(int i=n;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n+1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}



	
	public int[] SortOfAnArray(int a[]) {		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}		
		return a;
	}
	
		

	
	public int[][] SortOfAn2DArray(int a[][]) {		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0,k=i+1;j<a.length || k<a.length;j++,k++)
			if(a[i][j]>a[i][j]) {
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}

		return a;
	}
	

	
	public int isBigNumber(int a,int b) {		
		return (a > b)? a : b;
	}
	

	
	public int isSmallNumber(int a,int b) {		
		return (a < b)? a : b;
	}
	

	
	public int isBigNumberFor3Numbers(int a,int b,int c) {		
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}
		return c;
	}
	

	
	public int isSmallNumberFor3Numbers(int a,int b,int c) {
		if(a<b && a<c) {
			return a;
		}else if(b<a && b<c) {
			return b;
		}
		return c;
	}
	


	public int isBigNumberFornNumbers(int []a) {
		int big=a[0];
		int twoBig=a[0];
		for(int i=1;i<a.length;i++) {		
				if(a[i]>big) {
					big=a[i];				
				}
		}
		return big;
	}
				
			
	public int isSecondBiggestNumberFornNumbers(int []a) {
		int big=a[0];
		int secondBiggest=a[0];
		for(int i=1;i<a.length;i++) {
				if(a[i]>big) {
					big=a[i];				
				}
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]!=big) {
				if(a[j]>secondBiggest) {
					secondBiggest=a[j];
				}
			}
		}
		return secondBiggest;
	}
				

	
	public int isSecondSmallestNumberFornNumbers(int []a) {
		int small=a[0];
		int secondSmallest=a[0];
		for(int i=1;i<a.length;i++) {
				if(a[i]<small) {
					small=a[i];				
				}
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]!=small) {
				if(a[j]<secondSmallest) {
					secondSmallest=a[j];
				}
			}
		}
		return secondSmallest;
	}
	
	public int NthBiggestNumberOfnNumbers(int []a, int n) {
		int temp;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}
			}
		}
		return a[a.length-n];
	}
	
	
	public int FifthBiggestNumberOfnNumbers(int []a) {
		int temp;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-5];
	}
	
	
	public int FifththsmallestNumberOfnNumbers(int []a) {
		int temp;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-5];
	}
	

	public int isSmallNumberFornNumbers(int []a) {
		int small=a[0];		
		for(int i=1;i<a.length; i++) {
				if(a[i]<small) {
					small = a[i];
				}
		}
		return small;
	}
	
	public int NthsmallestNumberOfnNumbers(int []a,int n) {
		int temp;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
		return a[a.length-n];
}
	
		
	
	public int FifthsmallestNumberOfnNumbers(int []a) {
		int temp;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
		return a[a.length-5];
}
	
	
	public String isPositiveOrNegative(int n) {
		return (n>0) ? "Positive" : "Negative";
	}
	
	

	public Boolean isDivisibleBy5And11(int n) {	
		return (n % 5 == 0 && n % 11 == 0) ? true : false;
	}
	
	

	public String isDivisibleBy5Or11(int n) {

		if (n % 5 == 0 && n % 11 == 0) {
			return "Divisible By Both 5 And 11";
		}
		else if (n % 5 == 0) {
			return "Divisible By 5";
		} else if (n % 11 == 0) {
			return "Divisible By 11";
		}
		return "Not Divisible By Both 5 And 11";
	}
	
	public Boolean isLeapYear(int year) {	
		return (year % 4 == 0) ? true : false;
	}
		

	public Boolean isAlphabet(String str) {	
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		int counter=0;
		char[] alpha = s1.toCharArray();
		char[] in = str.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(alpha[i] == in[i]) {
					counter++;
				}
			}
		}
		return false;
	}
		

	public Boolean isAlphabetWithOneCharAnotherWay(char input) {	
		String s1 = "abcdefghijklmnopqrstuvwxyABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alpha = s1.toCharArray();		
		for(int i=0;i<s1.length();i++) {
				if(input == alpha[i]) {
					return true;
				}
			}
		return false;
	}
		

	public Boolean isAlphabetWithOneChar(char input) {
//			if((int) input>=65 || (int) input<=90 || (int) input>=97 || (int) input<=122 ) {
//				return true;
//			} //Another Way
//			return false;
		return ((int) input>=65 && (int) input<=90 || (int) input>=97 && (int) input<=122 ) ? true : false ;
	}
	

	public Boolean isVowel(char input) {
		return ((input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')) ? true : false ;
	}
	
	public Boolean isVowelAnotherMethod(char input) {
		if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
			return true;
		}
		return false;
	}

	public Boolean isConsonent(char input) {
		return ((input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')) ? false : true ;
	}
	

	public Boolean isDigit(String input) {
			try {
				Integer.parseInt(input);
				return true;
			}catch(NumberFormatException ne) {
				return false;
			}
	}

	public Boolean isSpecialChar(String input) {
			char[] a= input.toCharArray();
			for(int i=0;i<a.length;i++) {
				if((int) a[i]>=65 && (int) a[i]<=90 || (int) a[i]>=97 && (int) a[i]<=122 || (int) a[i] >=48 && (int) a[i] <= 57) {
						return false;
				}
			}
		return true;
	}

	public Boolean PasswordStrengthChecker(String input) {		
		int alphaCount=0,specialChar=0,digitCount=0,lenCount=0,lowerAlphaCount=0;
		if(input.length()>8) {
			lenCount++;
		char[] a= input.toCharArray();
		for(int i=0;i<a.length;i++) {
			if((int) a[i]>=65 && (int) a[i]<=90 ) {
				alphaCount++;
			}else if ((int) a[i] >=48 && (int) a[i]<=57){
				digitCount++;				
			}else if((int) a[i] >= 97 && (int) a[i] <=122) {
				lowerAlphaCount++;
		}else {
			specialChar++;
		}
		}
		if(alphaCount>0 && specialChar>0 && digitCount>0) {
			return true;
		}
		}
	return false;
}

	
	public void PrintASCIIchar() {
		for(int i=0;i<300;i++) {
			System.out.println((char)i+"For this character ascii code is "+i);
		}
	}
	
	public String printWeekDay(int no) {
		if(no==0) {
//			System.out.println("Sunday");
			return "Sunday";
		}else if(no==1) {
//			System.out.println("Monday");
			return "Monday";
		}
		else if(no==2) {
//			System.out.println("Tuesday");
			return "Tuesday";
		}
		else if(no==3) {
//			System.out.println("Wednesday");
			return "Wednesday";
		}
		else if(no==4) {
//			System.out.println("Thursday");
			return "Thursday";
		}
		else if(no==5) {
//			System.out.println("Friday");
			return "Friday";
		}
		else if(no==6) {
//			System.out.println("Saturday");
			return "Saturday";
		}else {
//			System.out.println("Invalid Number");			
		}
	return "Invalid Number";
}
	public String printWeekDayDifferentMethod(int no) {
		switch(no) {
		case 0:
			System.out.println("Sunday");
			return "Sunday";
		case 1:
			System.out.println("Monday");
			return "Monday";
			 
		case 2:
			System.out.println("Tuesday");
			return "Tuesday";
			 
		case 3:
			System.out.println("Wednesday");
			return "Wednesday";
			 
		case 4:
			System.out.println("Thursday");
			return "Thursday";
			 
		case 5:
			System.out.println("Friday");
			return "Friday";
		 
		case 6:
			System.out.println("Saturday");
			return "Saturday";
		default:
			System.out.println("Invalid Number");
		}
	return "Invalid Number";
}

	

	public int[] CalculateAmountOfNotes(int amount) {
		int notes[] = {500,200,100,50,20,10,5,1};
		int count[] = {0,0,0,0,0,0,0,0,0};
		for(int i=0;i<notes.length;i++) {			
			if(amount >= notes[i]){
				count[i] = amount/notes[i];
				amount = amount % notes[i];
			}
		}
		return count;
	}
	
	public Boolean isValidTriangleOrNot(int side1,int side2,int side3) {	
		return ((side1+side2)>side3) ? true : false;
	}

	public Boolean isValidTriangleWithAngles(int angle1,int angle2,int angle3) {	
		return ((angle1+angle2+angle3)==180) ? true : false;
	}

	public String TriangeCharascterzstics(int side1,int side2,int side3) {	
		if(side1==side2 && side1==side3) {
			return "Equalateral Triangle";
		}else if(side1==side2){
			return "Isosceles Triangle";
		}else {
			return "Scalene Triangle";
		}
	}
	

	public String rootsOfQuadraticEquation(int a,int b,int c) {	
		Double Root1;
		Double Root2;
		String roots = "";
		double Determenent = (b*b)-4*a*c;
		if(Determenent > 0) {
		Root1 = (-b+((Math.sqrt(Determenent))))/(2*a);	
		Root2 = (-b-(Math.sqrt(Determenent)))/(2*a);
		roots = "In this equation the Roots are real Root1 "+Root1+" "+"Root2 " +Root2;
		}else if(Determenent==0){
			Root1 = Root2 =  (-b+((Math.sqrt(Determenent))))/(2*a);
			roots = "In this equation the Roots are Equal Root1 "+Root1+" "+"Root2 " +Root2;

		}else if(Determenent < 0) {
			Root1 = (double)-b / (2 * a);
			Root2 = Math.sqrt(-Determenent) / (2 * a);
			roots = "In this equation the Roots are Imaginary Root1 "+Root1+" "+"Root2 " +Root2;
		}else {
			return "Something Went Wrong";
		}
		
		return roots;
	}
	

	public String ProfitOrLoss(int cp,int sp) {	
		if(sp>cp) {
			return "Profit";
		}else if(cp>sp){
			return "Loss";
		}else {
			return "Niether Profit Nor Loss";	
		}
		
	}
	
	public String CalculatePercentage(int Science,int Maths,int English) {	
		int Total = 300;
		int MarkTotal = Science+Maths+English/Total;
		int percentage = MarkTotal * 100;   
		if(Science<35 || Maths<35 || English<35) {
			return "F";
		}
		else if(percentage>90) {
			return "A";
		}else if(percentage>80) {
			return "B";
		}else if(percentage>70) {
			return "C";
		}else if(percentage>60) {
			return "D";
		}else if(percentage>40) {
			return "E";
		}else {
			return "Something went wrong";
		}
	}


	public int CalculateElectricityBill(int units) throws Exception {	
			int Amount=0;
			if(units>7500) {
				Amount = units/50;
				return Amount;
			}else {
				throw new Exception("The minimum charge is atleast 150 ruppes");
			}
	}
	
	
	public double calcualteGrossSalary(int basicSalary) {
		double GrossSalary=0,Hrent,DailyAllowance,percentage;
		if(basicSalary<10000) {
			percentage = (double)20/100; // Home Rent is 20% of 10000
			Hrent = percentage*basicSalary; 
			percentage = (double)8/100; //Daily Allowance is 8% of 10000
			DailyAllowance=percentage * basicSalary;
			GrossSalary = basicSalary + Hrent + DailyAllowance;
			return GrossSalary;
		}else if(basicSalary<20000){
			percentage = (double)25/100; // Home Rent is 25% of 40000
			Hrent = (double) percentage * basicSalary; 
			percentage = (double)9/100; //Daily Allowance is 9% of 40000
			DailyAllowance = percentage*basicSalary;
			GrossSalary = basicSalary + Hrent + DailyAllowance;
			return GrossSalary;
		}else if(basicSalary>20000) {
			percentage = (double)30/100; //Daily Allowance is 30% of 40000
			Hrent = (double)percentage * basicSalary;
			percentage = 9.5/100; //Daily Allowance is 9.5% of 40000
			DailyAllowance = (double)percentage*basicSalary;
			GrossSalary = basicSalary + Hrent + DailyAllowance;
			return GrossSalary;
		}
		else {
			throw new RuntimeException("Something went Wrong");
		}	
	}
	

	public String SecretMessage(String code,int key){
		String a[] = new String [code.length()/2];
		String res;
		int b[] = new int [code.length()/2];
		char a1[] = new char[code.length()/2];
		int k=0;
		if(key==9740 && code.length()%2==0) {
		for(int i=0,j=2;i<code.length()/2 || j<code.length()/2-1;i++,j=j+2)
		{
				k=j-2;
				a[i] = code.substring(k, j);
				try {					
					b[i]= Integer.parseInt(a[i]);
			}catch(NumberFormatException e) {
				throw new RuntimeException("Please don't include String in code");
			}
		}
		for(int i=0;i<code.length()/2;i++){
			if(b[i]<91 && b[i]>64) {
				a1[i]=(char) b[i];
			}
			else if(b[i]==11) {
				a1[i]=' ';
			}else{
				
			}
		}
		}
		res=String.valueOf(a1);
//		System.out.println(res);
			return res;
	}
	
	public char PrintAsciiForGivenValue(int n) {
			return (char)n;
	}
	
	public int[] swappingTwoVariables(int a,int b) {		
		a=a+b;
		b=a-b;
		a=a-b;
		int [] res= new int[2];
		res[0]=a;
		res[1]=b;
		return res;
	}
	
	public String toUpperCase(String str) {
		char[] a = new char[str.length()];
		a=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if((int)a[i]>97 && (int)a[i]<122) {			
			a[i]=(char) ((int)a[i]-32);
			}else {
				return "Please input only lower case letters";
			}
		}
		String res = String.valueOf(a);
		return res;
	}

	
	public String toLowerCase(String str) {
		char[] a = new char[str.length()];
		a=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if((int)a[i]>64 && (int)a[i]<91) {			
			a[i]=(char) ((int)a[i]+32);			
			}else {
				return "Please input only Upper case letters";
			}
		}
		String res = String.valueOf(a);
		return res;
	}


	
	public String toInvertCase(String str) {
		char[] a = new char[str.length()];
		a=str.toCharArray();
		for(int i=0;i<str.length();i++) {			
			if((int)a[i]>64 && (int)a[i]<91) {
				a[i]=(char) ((int)a[i]+32);			
			}else if((int)a[i]>96 && (int)a[i]<122){
				a[i]=(char) ((int)a[i]-32);
			}
		}
		String res = String.valueOf(a);
		return res;
	}
	
	public double celsiusToFaherhite(int celsius) {
		return ((celsius*(double)1.8))+32;
	}

	public double FaherhiteTocelsius(int Faherhite) {
		return ((Faherhite-32)*(double)5/9);
	}
		
	public static MyPrograms build() {
		MyPrograms result = new MyPrograms();
		return result;
	}
}


