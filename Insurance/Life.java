import javax.swing.JOptionPane;
public class Life extends Insurance {

	public Life(String type, double price) {
		super("Life", price);
		setCost();
	}

	void setCost() {
		price = 36;
		
	}
	void display() {
		JOptionPane.showMessageDialog(null, "Type of Insurance is " + getTypeLife());
		JOptionPane.showMessageDialog(null, "Fee per Month is: " + getPriceLife() + "$");
	}

}
