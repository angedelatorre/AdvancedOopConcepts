
public class UseGeometric {

	public static void main (String[]args) {
		double height,width,area;
		String figuret;
		
		GeometricFigure[] type = new GeometricFigure[3];
		type[0] = new Square(3,3, "==Square==");
		type[1] = new Triangle(4,5, "\n==Triangle==");
		type[2] = new Square(2,2, "\n==Square==");
		
		for(int i = 0; i <type.length; i++)
		{
			height = type[i].getHeight();
			width = type[i].getWidth();
			figuret = type[i].getType();
			area = type[i].Area(height, width);
			System.out.println( figuret + "\nHeight: " + height + "\nWidth: " + width + "\nArea: " + area);
			
		}
	}
}