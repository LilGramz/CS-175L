import java.util.Scanner;
public class HouseCode {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//these are the variables
		int length = 0;
		int width =0;
		int height =0;
		int numWindows=0;
		int lengthWindows=0;
		int heightWindows=0;
		int numDoors=0;
		int lengthDoors=0;
		int widthDoors=0;
		double CostPerSqFt =0;
		
		//these are the inputs
		System.out.println("Input length of house: ");
		length = in.nextInt();
		System.out.println("Input width of house: ");
		width = in.nextInt();
		System.out.println("Input height of house: ");
		height = in.nextInt();
		System.out.println("Input number of windows of house: ");
		numWindows = in.nextInt();
		System.out.println("Input length of windows: ");
		lengthWindows = in.nextInt();
		System.out.println("Input height of windows: ");
		heightWindows = in.nextInt();
		System.out.println("Input number of doors: ");
		numDoors = in.nextInt();
		System.out.println("Input length of doors: ");
		lengthDoors = in.nextInt();
		System.out.println("Input width of doors: ");
		widthDoors = in.nextInt();
		System.out.println("Input cost to paint square foot: ");
		CostPerSqFt = in.nextInt();
		
		//These are the computations
		int normalSideSqFt = length*width;
		double peakSideSqFt = (length*width) + 0.5*(length*(height-width));
		double NormalHalfSqFt = normalSideSqFt * 2;
		double PeakHalfSqFt = peakSideSqFt * 2;
		double WholeHouseSqFt = NormalHalfSqFt + PeakHalfSqFt;
		double PerimeterWindows = lengthWindows * heightWindows;
		double WindowsSqFt = PerimeterWindows * numWindows;
		double PerimeterDoor = lengthDoors * widthDoors;
		double DoorSqFt = PerimeterDoor * numDoors;
		double DoorWindowsSqFt = DoorSqFt + WindowsSqFt;
		double PaintableSurface = WholeHouseSqFt - DoorWindowsSqFt;
		double TotalCost = CostPerSqFt * PaintableSurface;
		System.out.println("Total Cost to paint the house: " + TotalCost);
		in.close();
	}

}
