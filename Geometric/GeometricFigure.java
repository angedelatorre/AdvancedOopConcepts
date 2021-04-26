
public abstract class GeometricFigure {

		public double width, height;
		public String type;
		
		public GeometricFigure(String type, double width, double height) {
			// TODO Auto-generated constructor stub
			this.type = type;
			this.width = width;
			this.height = height;
			}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		public abstract double Area(double height, double width);
		
}
