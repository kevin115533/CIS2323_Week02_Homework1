import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		
		int fNum, tNum;
		String word1, word2, word3, word4, word5, word6, word7,word8,word9,word10,word11,word12,word13;
		float sNum;
		
		
		Scanner Input1 = new Scanner (System.in);
		Scanner Input2 = new Scanner (System.in);
		Scanner Input3 = new Scanner (System.in);
		Scanner Input4 = new Scanner (System.in);
		Scanner Input5 = new Scanner (System.in);
		Scanner Input6 = new Scanner (System.in);
		Scanner Input7 = new Scanner (System.in);
		Scanner Input8 = new Scanner (System.in);
		Scanner Input9 = new Scanner (System.in);
		Scanner Input10 = new Scanner (System.in);
		Scanner Input11 = new Scanner (System.in);
		Scanner Input12 = new Scanner (System.in);
		Scanner Input13 = new Scanner (System.in);
		Scanner Input14 = new Scanner (System.in);
		Scanner Input15 = new Scanner (System.in);
		Scanner Input16 = new Scanner (System.in);
		
		System.out.println("Restaurant Madlib.");
		
		System.out.print("Adjective: ");
		word1 = Input1.nextLine();
		
		System.out.print("Adjective: ");
		word2 = Input2.nextLine();
		
		System.out.print("Noun: ");
		word3 = Input3.nextLine();
		
		System.out.print("Noun: ");
		word4 = Input4.nextLine();
		
		System.out.print("A spoken language: ");
		word5 = Input5.nextLine();
		
		System.out.print("Noun: ");
		word6 = Input6.nextLine();
		
		System.out.print("Noun: ");
		word7 = Input7.nextLine();
		
		System.out.print("Noun: ");
		word8 = Input8.nextLine();
		
		System.out.print("Verb: ");
		word9 = Input9.nextLine();
		
		System.out.print("Adjective: ");
		word10 = Input10.nextLine();
		
		System.out.print("Adjective: ");
		word11 = Input11.nextLine();
		
		System.out.print("Adjective: ");
		word12 = Input12.nextLine();
		
		System.out.print("Type of alcohol: ");
		word13 = Input13.nextLine();
		
		
		
		System.out.print("Number: ");
		fNum = Input14.nextInt();
		
		System.out.print("Number: ");
		sNum = Input15.nextFloat();
		
		System.out.print("Number: ");
		tNum = Input16.nextInt();
		
		
		System.out.print("Working in a restaurant can be a " + word1 + " time. ");
		System.out.print(fNum + "0% of the customers can be bad but the others  are typically nice. ");
		System.out.print("The coworkers that you meet can be " + word2 +". ");
		System.out.print("The worst part about the job is dealing with the " + word3 +". ");
		System.out.print("And the best part about the job is the " + word4 +". ");
		System.out.print("Its stereotypical but the front house staff usually speaks english and the back of the house staff typically speaks " + word5 + ". ");
		System.out.print("Even through the language barriers the communication still works with the use of restaurant slang. Words like hands, " + word6 +", or " + word7 + " can have a different meaning. ");
		System.out.print("Customers can have odd request like asking for a " + word8 + "on a plate and you will have no idea what they mean. ");
		System.out.print("There are often cliche jokes, you just learn to " + word9 + " and fake laugh. ");
		System.out.print("Good money can be made depending on your tips, sometimes it will be $" + sNum + " or it can be triple that amount. ");
		System.out.print("Depending on who you ask, the restaurant business can be " + word10 + ", I personally dont think its too bad. ");
		System.out.print("But in the end, the customers are " + word11 + " and the coworkers are " + word12 +". ");
		System.out.print("You just have to take your " + tNum +"shots of " + word13 + " and do your job." );
		
	}
}

