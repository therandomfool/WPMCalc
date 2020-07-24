import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
	
	static String[] words = {"envelope", "cantelope", "the", "bargin", "pleased", "dichotomy", "knees", "sweet tea", "funny", "went", "trampoline" };

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(int i = 0; i< 10; i++) {
			
			System.out.print(words[rand.nextInt(10)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime/ 1000000000.0;
		int numChars = typedWords.length();
		int wpm = (int) ((((double) numChars /5 )/seconds) *60);
		
		System.out.println("Your words per minute is " + wpm + "!");
		
//		System.out.println(elapsedTime);
//		
//		System.out.println(typedWords);

	}
	
//	public static int stringCompare(String str1, String str2) 
//    { 
//  
//        int l1 = str1.length(); 
//        int l2 = str2.length(); 
//        int lmin = Math.min(l1, l2); 
//  
//        for (int i = 0; i < lmin; i++) { 
//            int str1_ch = (int)str1.charAt(i); 
//            int str2_ch = (int)str2.charAt(i); 
//  
//            if (str1_ch != str2_ch) { 
//                return str1_ch - str2_ch; 
//            } 
//        } 
//  
//        // Edge case for strings like 
//        // String 1="Geeks" and String 2="Geeksforgeeks" 
//        if (l1 != l2) { 
//            return l1 - l2; 
//        } 
//  
//        // If none of the above conditions is true, 
//        // it implies both the strings are equal 
//        else { 
//            return 0; 
//        } 
//    } 
//  
//    // Driver function to test the above program 
//    public static void main(String args[]) 
//    { 
//        String string1 = new String("Geeksforgeeks"); 
//        String string2 = new String("Practice"); 
//        String string3 = new String("Geeks"); 
//        String string4 = new String("Geeks"); 
//  
//        // Comparing for String 1 < String 2 
//        System.out.println("Comparing " + string1 + " and " + string2 
//                           + " : " + stringCompare(string1, string2)); 
//  
//        // Comparing for String 3 = String 4 
//        System.out.println("Comparing " + string3 + " and " + string4 
//                           + " : " + stringCompare(string3, string4)); 
//  
//        // Comparing for String 1 > String 4 
//        System.out.println("Comparing " + string1 + " and " + string4 
//                           + " : " + stringCompare(string1, string4)); 
//    } 

}
