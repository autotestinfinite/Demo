package demo_Jenkins_Java_Project;

import java.util.Random;

public class RandomDay {
	
	private int randomDay;
	public static void main(String[] args) {
			getRandomDay().justAnotherDay();
	}
	
	
	private static RandomDay getRandomDay() {
		return new RandomDay();
	}
	private void justAnotherDay() {

		randomDay=new Random().nextInt(7)+1;
		
		switch(randomDay){
		
		case 1:System.out.println(Day.Monday);
		break;
		case 2:System.out.println(Day.Tuesday);
		break;
		case 3:System.out.println(Day.Wednesday);
		break;
		case 4:System.out.println(Day.Thursday);
		break;
		case 5:System.out.println(Day.Friday);
		break;
		
		default: System.out.println("Not a Week Day!!! Enjoy");
		}
	}
}
