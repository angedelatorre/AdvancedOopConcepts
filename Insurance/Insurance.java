
public abstract class Insurance {
	public String type;
	public double price;
	

	public Insurance(String type, double price) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.price = price;
	}
	public String getTypeLife()
	{
		return type;
	}
	public String getTypeHealth() {
		return type;
	}
	public double getPriceLife()
	{
		return price;
	}
	public double getPriceHealth()
	{
		return price;
	}
	abstract void setCost();
	abstract void display();
	

}