import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		
		// declaring variables
		final double NUM1 = 35.74 , NUM2 = .6215 , NUM3 = 35.75 , NUM4 = .4275 ,  NUM5 = 0.16;
		double tempInFar, speedInMPH, windChill ;
		
		System.out.println("Windchill Calculator!!\n");
		
		Scanner input = new Scanner(System.in);
		
		//asking for temperature and assigning it to variable
		System.out.println("Enter the temperature in Far within -45 dF and 40 dF: ");
		tempInFar = input.nextDouble();
		
		// asking for wind speed and assigning to variable
		System.out.println("Enter the wind speed in MPH within 5 MPH and 60 MPH: ");
		speedInMPH = input.nextDouble();
		
		input.close();
		
		//checking if temperature is within bounds
		if ((tempInFar > 40) || (tempInFar < -45))
		{
			System.out.println("Temperature is not within bounds!");
		}
		
		//checking if wind speed is within bounds
		else
		{	
			if ((speedInMPH > 60) || (speedInMPH < 5)) 
			{
			System.out.println("Wind speed is not within bounds!");
			}
			
			else
			{
				//calculates and prints out wind chill
				windChill = NUM1 + (NUM2 * tempInFar) - (NUM3 * Math.pow(speedInMPH,NUM5)) + (NUM4 * tempInFar * Math.pow(speedInMPH,NUM5));
				System.out.print("The wind chill is " + windChill);
				System.out.println(" dF");
			}
		}
		
		System.out.println("Programmer: Quazi Karim");
		
	
		
	}

}
