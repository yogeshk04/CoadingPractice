package enumexample;

public class EnumExample {
	enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THIRSDAY, FRIDAY, SATURDAY}
	
	public static void main(String[] args) {
		for(Day d: Day.values())
		System.out.println(d);
		
		System.out.println(Day.MONDAY);
	}

}
