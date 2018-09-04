import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		
		int fNum;
		int sNum, tNum, foNum;
		String word1, word2, word3, word4, word5, word6;
		float float1, float2;
		
		
		Scanner Input1 = new Scanner (System.in);
		Scanner Input2 = new Scanner (System.in);
		Scanner Input3 = new Scanner (System.in);
		Scanner Input4 = new Scanner (System.in);
		Scanner Input5 = new Scanner (System.in);
		Scanner Input6 = new Scanner (System.in);
		Scanner Input7 = new Scanner (System.in);
		Scanner Input8 = new Scanner (System.in);
		Scanner Input9 = new Scanner (System.in);
		
		System.out.println("Java Madlib.");
		
		System.out.print("Your first name: ");
		word2 = Input3.nextLine();
		
		System.out.print("Number: ");
		fNum = Input1.nextInt();
		
		System.out.print("Number: ");
		sNum = Input5.nextInt();
		
		System.out.print("Adjective: ");
		word1 = Input2.nextLine();
		
		System.out.print("Welcome to the intro Java course " + word2 + ". ");
		System.out.print("To become better at programming, you must practice " + fNum + " hours a day. ");
		System.out.print("After all this practicing, you might become a " + word1 + " programmer. ");
		System.out.print("No matter the type of programmer you are, you will still know more about Java than " + sNum + "% of people. ");
	}
}

