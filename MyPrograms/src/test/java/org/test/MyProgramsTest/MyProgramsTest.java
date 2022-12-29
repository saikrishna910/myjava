package org.test.MyProgramsTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.main.MyPrograms.MyPrograms;
import org.main.MyPrograms.VeryBigNumbersSum;

public class MyProgramsTest {

	
	@Test
	public void veryBigNumbersTest() {
		VeryBigNumbersSum sum = VeryBigNumbersSum.build();
		String res = sum.sumOfBigNum("92345678912", "912345678919");
		assertEquals("1004691357831",res);
	}
	
	
	@Test
	public void ChagingSignWithPositiveTest() {
		MyPrograms chngsign = MyPrograms.build();
		int c = chngsign.ChangeSign(9);
		assertEquals(-9,c);
	}
	
	
	@Test
	public void ToCheckPrimeOrNotWithSimpleValues() {
		MyPrograms check = MyPrograms.build();
		Boolean result = check.IsPrimeOrNot(5);
		assertEquals(true,result);
	}
	
	
	@Test
	public void ToCheckPrimeOrNotWithNonPrimeValues() {
		MyPrograms check = MyPrograms.build();
		Boolean result = check.IsPrimeOrNot(4);
		assertEquals(false,result);
	}
	
	@Test
	public void ChangingSignWithNegativeTest() {
		MyPrograms chngsign = MyPrograms.build();
		int c = chngsign.ChangeSign(-9);
		assertEquals(9,c);
	}
	
	

	@Test
	public void IsArmsotrongWithCorrectValuesTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isArmstrong(153);
		assertEquals(true,c);
	}
	
	
	@Test
	public void IsArmsotrongWithWrongValuesTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isArmstrong(183);
		assertEquals(false,c);
	}

	
	@Test
	public void IsPerfectWithValidValuesTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isPerfect(28);
		assertEquals(true,c);
	}
	

	@Test
	public void IsPerfectWithWrongValuesTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isPerfect(4);
		assertEquals(false,c);
	}
	
	@Test
	public void IsNumberOrNotWithNumberTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isStirng("9");
		assertEquals(true,c);
	}
	
	

	@Test
	public void IsNumberOrNotWithStringTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isStirng("hi");
		assertEquals(false,c);
	}


	@Test
	public void IsPalendromeOrNotWithNormalValuesTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isPalendrome(131);
		assertEquals(true,c);
	}
	

	@Test
	public void IsPalendromeWithNonPalindromeValueTest() {
		MyPrograms check = MyPrograms.build();
		Boolean c = check.isPalendrome(122);
		assertEquals(false,c);
	}
	

	@Test
	public void factorialTest() {
		MyPrograms calculate = MyPrograms.build();
		int c = calculate.Factorial(4);
		assertEquals(24,c);
	}
	

	@Test
	public void ReverseTest() {
		MyPrograms calculate = MyPrograms.build();
		int c = calculate.Reverse(743);
		assertEquals(347,c);
	}
	

	@Test
	public void ReverseStringTest() {
		MyPrograms calculate = MyPrograms.build();
		String c = calculate.Strreverse("uoy era woh");
		assertEquals("how are you",c);
	}
	
	@Test
	public void ReverseStringWithSmallValueTest() {
		MyPrograms calculate = MyPrograms.build();
		String c = calculate.Strreverse("hi");
		assertEquals("ih",c);
	}
	
	
	@Test
	public void DuplicateValueInAnArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {4,3,43,4};
		int c = check.duplicatevalue(a);
		assertEquals(4,c);
	}
	
	
	
	@Test
	public void commonValueInAnArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {40,31,42,12};
		int b[] = {12,3,41,43};
		int c = check.commonValue(a, b);
		assertEquals(12,c);
	}
	
	

	@Test
	public void AverageOfAnArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {1,2,3,4,5};
		int c = check.AverageValue(a);
		assertEquals(3,c);
	}
	
	
	
	@Test
	public void ConcatinateTest() {
		MyPrograms perform = MyPrograms.build();
		String c = perform.concat("hi", " how are you");
		assertEquals("hi how are you",c);
	}
	

	
	@Test
	public void ToUpperCaseTest() {
		MyPrograms perform = MyPrograms.build();
		String c = perform.ToUpperCase("hi");
		assertEquals("HI",c);
	}
	

	
	@Test
	public void ToLowerCaseTest() {
		MyPrograms perform = MyPrograms.build();
		String c = perform.ToLowerCase("HELLO");
		assertEquals("hello",c);
	}
	
	
	
	@Test
	public void SumOfDigitsTest() {
		MyPrograms perform = MyPrograms.build();
		int c = perform.SumOfDigits(428);
		assertEquals(14,c);
	}
		
	

	
	@Test
	public void DescendingOrderTest() {
		int a[] = {2,3,1,5};
		int c[] = new int[a.length];
		MyPrograms perform = MyPrograms.build();		
		c = perform.descendingOrder(a);
		int res[] = {5,3,2,1};				
		assertArrayEquals(res,c);
	}
	
	

	
	@Test
	public void AsscendingOrderTest() {
		int a[] = {2,3,1,5};
		int c[] = new int[a.length];
		MyPrograms perform = MyPrograms.build();		
		c = perform.asscendingOrder(a);
		int res[] = {1,2,3,5};				
		assertArrayEquals(res,c);
	}
	
	
	
	@Test
	public void PatternTest() {
		MyPrograms Draw = MyPrograms.build();
//		Draw.trianglePattern(4);
//		Draw.reverseRighttrianglePattern(4);
//		Draw.reverseRighttrianglePatternWithnumbers(4);
//		Draw.BoxPattern(4);
//		Draw.ParallelgramPattern(4);
//		Draw.anotherParallegramPattern(4);
//		Draw.rightTrianglePattern(4);
//		Draw.reversetrianglePattern(4);
//		Draw.DiamondPattern(4);
	}
		
	


	@Test
	public void UseOfforeachloopForSingleDimensionalArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[]= {21,23,2,1};
//		check.UseOfForeachLoop(a);
	}
	
	


	@Test
	public void UseOfforeachloopFor2DArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[][]= {{21,23,2,1},{12,43,4},{32,3,4,7,9}};
//		check.UseOfForeachLoopFor2D(a);		
	}
	
	
	@Test
	public void SortOfAnArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[]= {21,23,2,1};
		int c[] = check.SortOfAnArray(a);
		assertArrayEquals(new int[] {1,2,21,23},c);
	}
		
	

	
	@Test
	public void SortOfAn2DArrayTest() {
		MyPrograms check = MyPrograms.build();
		int a[][]= {{21,23,2,1},{1,3,53,5}};
//		int[][] c = check.SortOfAn2DArray(a);
//		assertArrayEquals(new int[] {1,2,21,23},c);
	}
		
	
	
	@Test
	public void CheckBigNumberTest() {
		MyPrograms check = MyPrograms.build();
		int c = check.isBigNumber(43,76);		
		assertEquals(76,c);
	}
		
	

	
	
	@Test
	public void CheckSmallNumberTest() {
		MyPrograms check = MyPrograms.build();
		int c = check.isSmallNumber(89,43);	
		assertEquals(43,c);
	}
		
	
	@Test
	public void CheckBigOf3NumberTest() {
		MyPrograms check = MyPrograms.build();
		int c = check.isBigNumberFor3Numbers(12, 32, 31);
		assertEquals(32,c);
	}
		
	
	
	
	@Test
	public void CheckSmallOf3NumberTest() {
		MyPrograms check = MyPrograms.build();
		int c = check.isSmallNumberFor3Numbers(12, 32, 31);
		assertEquals(12,c);
	}
		

	
	@Test
	public void CheckBigOf5NumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {7,4,3,85,48};
		int c = check.isBigNumberFornNumbers(a);
		assertEquals(85,c);
	}
		

	
	@Test
	public void CheckSmallOf5NumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {7,4,3,85,1};
		int c = check.isSmallNumberFornNumbers(a);		
		assertEquals(1,c);
	}

	
	
	@Test
	public void CheckSecondBiggestOfnNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {7,4,3,85,48};
		int c = check.isSecondBiggestNumberFornNumbers(a);
		assertEquals(48,c);
	}
		
	
	@Test
	public void CheckSecondSmallestOfnNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {7,4,3,85,48};
		int c = check.isSecondSmallestNumberFornNumbers(a);		
		assertEquals(4,c);
	}
		



	
	@Test
	public void CheckBigOfnNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {7,4,3,85,48,54,64,2};
		int c = check.isBigNumberFornNumbers(a);
		assertEquals(85,c);
	}
		

	
	@Test
	public void CheckSmallOfnNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[] = {7,4,54,32,6,7,4};
		int c = check.isSmallNumberFornNumbers(a);		
		assertEquals(4,c);
	}

	

	
	@Test
	public void CheckNumberIsPositiveOrNegativeWithPositiveValueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Positive",check.isPositiveOrNegative(6));
	}

	
	@Test
	public void CheckNumberIsPositiveOrNegativeWithNegativeValueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Negative",check.isPositiveOrNegative(-4));
	}

	
	@Test
	public void CheckTheNthBiggestNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[]= {1,34,4,7,4};
		assertEquals(4,check.NthBiggestNumberOfnNumbers(a,3));
	}
	
		
	@Test
	public void CheckThe5thBiggestNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[]= {1,34,4,7,5,3,2};
		assertEquals(3,check.FifthBiggestNumberOfnNumbers(a));
	}
	
	@Test
	public void CheckTheNthSmallestNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[]= {1,34,8,4,3,7};
		assertEquals(4,check.NthsmallestNumberOfnNumbers(a,3));
	}

	
	@Test
	public void CheckThe5thSmallestNumberTest() {
		MyPrograms check = MyPrograms.build();
		int a[]= {1,34,8,4,3,7};
		assertEquals(8,check.FifthsmallestNumberOfnNumbers(a));
	}
	
	

	@Test
	public void isTheNumberDivisibleBy5And11OrNotWithValidvalueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isDivisibleBy5And11(55));
	}
	
	

	@Test
	public void isTheNumberDivisibleBy5And11OrNotWithInvalidvalueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isDivisibleBy5And11(22));
	}
	
	


	@Test
	public void isTheNumberDivisibleBy5And11OrNotWithDivisbleBy5valueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Divisible By 5",check.isDivisibleBy5Or11(25));
	}
	
	@Test
	public void isTheNumberDivisibleBy5And11OrNotWithDivisbleBy11valueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Divisible By 11",check.isDivisibleBy5Or11(33));
	}
	

	@Test
	public void isTheNumberDivisibleBy5And11OrNotWithDivisbleBy5And11valueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Divisible By Both 5 And 11",check.isDivisibleBy5Or11(55));
	}
	


	@Test
	public void isTheNumberDivisibleBy5And11OrNotWithNotDivisbleBy5And11valueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Not Divisible By Both 5 And 11",check.isDivisibleBy5Or11(21));
	}
	

	@Test
	public void isLeapYearOrNotWithValidValuesTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isLeapYear(2012));
	}
	

	@Test
	public void isLeapYearOrWithInvalidValuesNotTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isLeapYear(2022));
	}
	

	@Test
	public void isAlphabetOrNotWithAplphabets() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isAlphabetWithOneChar('A'));
	}

	@Test
	public void isAlphabetOrNotWithNumber() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isAlphabetWithOneChar('7'));
	}
	

	@Test
	public void isAlphabetOrNotWithSpecialCharacter() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isAlphabetWithOneChar('@'));
	}
	

	@Test
	public void isVowelTestWithInvalidValue() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isVowel('d'));
	}
	


	@Test
	public void isVowelTestWithvalidValue() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isVowel('e'));
	}
	


	@Test
	public void isVowelTestWithDifferentMethod() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isVowelAnotherMethod('a'));
	}
	
	@Test
	public void isVowelTestWithDifferentMethodWithInvalidValid() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isVowelAnotherMethod('d'));
	}
	
	@Test
	public void isConsonentTestWithValidValue() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isConsonent('h'));
	}
	
	@Test
	public void isConsonentTestWithInvalidValue() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isConsonent('u'));
	}
	
	@Test
	public void isDigitTestWithValid() {
		MyPrograms check = MyPrograms.build();		
		assertEquals(true,check.isDigit("8"));
	}

	@Test
	public void isDigitTestWithInvalidValue() {
		MyPrograms check = MyPrograms.build();		
		assertEquals(false,check.isDigit("hi"));
	}
	

	@Test
	public void isSpecialChar() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isSpecialChar("#"));
	}
	
	@Test
	public void Password() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.PasswordStrengthChecker("Hellohowareyou123@"));
	}
	

	@Test
	public void NotesTest() {
		MyPrograms check = MyPrograms.build();	
		assertArrayEquals(new int[] {1,0,1,0,0,0,0,0,0},check.CalculateAmountOfNotes(600));
	}
	
	
	@Test
	public void WeekDay() {
		MyPrograms check = MyPrograms.build();
//		check.printWeekDayDifferentMethod(6);
//		assertEquals("Tuesday",check.printWeekDayDifferentMethod(2));
		assertEquals("Tuesday",check.printWeekDay(2));
		
	}
	
	
	
	@Test
	public void PrintASCIITest() {
		MyPrograms check = MyPrograms.build();
//		check.PrintASCIIchar();
	}

	@Test
	public void IsValidTriangleTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isValidTriangleOrNot(2, 4, 5));
	}
	

	@Test
	public void IsValidTriangleTestWithInvalidValues() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isValidTriangleOrNot(2, 4,9));
	}


	@Test
	public void IsValidTriangleWithAnglesTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(true,check.isValidTriangleWithAngles(90, 60, 30));
	}

	@Test
	public void CheckTriangleCharacterSticsTestWithIsoscelesValues() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Isosceles Triangle",check.TriangeCharascterzstics(2, 2, 3));
	}

	@Test
	public void CheckTriangleCharacterSticsTestWithEqualatralValues() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Equalateral Triangle",check.TriangeCharascterzstics(5, 5, 5));
	}


	@Test
	public void CheckTriangleCharacterSticsTestWithScaleneValues() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Scalene Triangle",check.TriangeCharascterzstics(2, 8, 3));
	}


	@Test
	public void SolveQuadraticEquationForRealRootsTest() {
		MyPrograms check = MyPrograms.build();		
		assertEquals("In this equation the Roots are real Root1 -0.3819660112501051 Root2 -2.618033988749895",check.rootsOfQuadraticEquation(2, 6, 2));
	}


	@Test
	public void SolveQuadraticEquationForImaginaryRootsTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("In this equation the Roots are Imaginary Root1 -0.25 Root2 0.5204164998665332",check.rootsOfQuadraticEquation(6, 3, 2));
	}


	@Test
	public void IsValidTriangleWithAnglesTestWithInvalidValues() {
		MyPrograms check = MyPrograms.build();
		assertEquals(false,check.isValidTriangleWithAngles(110, 70, 30));
	}


	@Test
	public void CalculateProfitOrLossTest() {
		MyPrograms check = MyPrograms.build();		
		assertEquals("Profit",check.ProfitOrLoss(200, 250));
	}

	@Test
	public void CalculateProfitOrLossWithLossTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("Loss",check.ProfitOrLoss(200, 190));
	}

	@Test
	public void CalculatePercentageTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("A",check.CalculatePercentage(80, 70, 70));
	}
	
	@Test
	public void CalculatePercentageWithFailingPercentageTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("F",check.CalculatePercentage(80, 34, 70));
	}

	@Test
	public void CalculateElectricityBillTest() {
		MyPrograms check = MyPrograms.build();
		try {
			assertEquals(152,check.CalculateElectricityBill(7600));
		}catch(Exception e) {
			
		}
		
	}

	@Test
	public void CalculateGrossSalaryTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals(29295.0,check.calcualteGrossSalary(21000),0.0);
	}


	@Test
	public void SecretMessageTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals("HI HOW ARE YOU",check.SecretMessage("7273117279871165826911897985",9740));
	}


	@Test
	public void AsciiGivenValueTest() {
		MyPrograms check = MyPrograms.build();
		assertEquals('8',check.PrintAsciiForGivenValue(56));
	}

	@Test
	public void SwappingVariablesTest() {
		MyPrograms check = MyPrograms.build();		
		assertArrayEquals(new int[] {23,62},check.swappingTwoVariables(62, 23));
	}
	
	
		@Test
	public void toUpperCaseTest() {
		MyPrograms check = MyPrograms.build();		
		assertEquals("HI",check.toUpperCase("hi"));
	}
		
		@Test
		public void toUpperCaseWithUppercaseLettersTest() {
			MyPrograms check = MyPrograms.build();		
			assertEquals("Please input only lower case letters",check.toUpperCase("Hi"));
		}
	

		@Test
	public void toLowerCaseTest() {
		MyPrograms check = MyPrograms.build();		
		assertEquals("hello",check.toLowerCase("HELLO"));
	}
		
		@Test
		public void toLowerCaseWithUppercaseLettersTest() {
			MyPrograms check = MyPrograms.build();
			assertEquals("Please input only Upper case letters",check.toLowerCase("hi"));
		}
		
		@Test
		public void toInvertCasesTest() {
			MyPrograms check = MyPrograms.build();
			assertEquals("hI HOW ARE YOU.",check.toInvertCase("Hi how are you."));
		}
		

		@Test
		public void celsiustoFarenhiteTest() {
			MyPrograms check = MyPrograms.build();
			assertEquals(73.4,check.celsiusToFaherhite(23),0);
		}
		
		@Test
		public void FarenhitetocelsiusTest() {
			MyPrograms check = MyPrograms.build();
			assertEquals(104.44444444444444,check.FaherhiteTocelsius(220),0);
		}
				
	
//	@Test
//	public void AsciiTest() {
//		MyPrograms Ascii = MyPrograms.build();
//		Ascii.PrintAscii('a');
//	}
//	
//	@Test
//	public void UsingMenuTest() {	
//		MyPrograms Menu = MyPrograms.build();
//		Menu.MenuForArithmeticOperations();
//	}
	
}
