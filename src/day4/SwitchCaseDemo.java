package day4;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		int weekno=6;
		switch(weekno) 
		{
		case 1:System.out.println("Sunday");break;
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("Tuesday");break;
		case 4:System.out.println("Wednesday");break;
		case 5:System.out.println("Thurday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Saterday");break;
		default: System.out.println("Invalid Week Number");
		}
	}
}
