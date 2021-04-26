import javax.swing.JOptionPane;

public class Health extends Insurance {

	public Health(String type, double price) {
		super("Health", price);
		setCost();
	}
	@Override
	void setCost() {
		price = 196;
		
	}
	@Override
	void display() {
		JOptionPane.showMessageDialog(null, "Type of Insurance is " + getTypeHealth());
		JOptionPane.showMessageDialog(null, "Fee per Month is: " + getPriceHealth() + "$");
	}
}
