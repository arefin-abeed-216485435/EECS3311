package LoginPage;
import javax.swing.JOptionPane;

public class PopUpMessage {
	public PopUpMessage(){
		
	}
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
