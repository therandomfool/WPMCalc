import java.util.Random;
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
		System.out.println(words[rand.nextInt(10)]);

	}

}
