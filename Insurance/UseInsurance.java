
import javax.swing.JOptionPane;
public class UseInsurance {

	public UseInsurance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input_select;
		
		input_select = JOptionPane.showInputDialog(null,"Select the type of Insurance:" + "\n A: Life" + "\n B: Health");
		switch (input_select){
		case "A":
			Life LifeInsurance = new Life(null, 0);
			LifeInsurance.display();
			break;
		case "B":
			Health HealthInsurance = new Health(null, 0);
			HealthInsurance.display();
			break;
		}
		
			 
			 
			 
		
	}
	

}
