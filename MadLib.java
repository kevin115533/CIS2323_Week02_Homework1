import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		
		int fNum;
		int sNum, tNum, foNum;
		String word1, word2, word3, word4, word5, word6;
		float float1, float2;
		
		
		Scanner Input1 = new Scanner (System.in);
		Scanner Input2 = new Scanner (System.in);
		
		System.out.println("Welcome to the Java Madlib.");
		System.out.print("Enter a number: ");
		fNum = Input1.nextInt();
		
		System.out.print("Enter a noun: ");
		word1 = Input2.nextLine();
		
		System.out.println("To get better at programming you must practice " + fNum + " hours a day.");
		System.out.println("To get better at programming you must practice " + word1 + " hours a day.");
	}
}

