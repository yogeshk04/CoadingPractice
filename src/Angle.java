// Program to calculate angle between hour and minute hand

public class Angle {

	static int calculateAngle(double h, double m)
	{
		// validate input
		if (h<0 || h>12 || m<0 || m>60)
		{
			System.out.println("Wrong input");
			System.exit(0);
			
		}		
		if(h == 12)
			h=0;
		if(m==60)
			m=0;
		h+=1;
		if(h>12)
			h=h-12;
		
		int hour_angle = (int)(0.5 * (h*60 + m));
		int minute_angle = (int)(6*m);
		
		int angle = Math.abs(hour_angle - minute_angle);
		angle = Math.min(360 - angle, angle);
		
		return angle;
	}

	public static void main(String[] args) {
		System.out.println(calculateAngle(3, 270));
	}
}
