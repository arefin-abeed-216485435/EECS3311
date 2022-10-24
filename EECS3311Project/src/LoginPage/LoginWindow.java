package LoginPage;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginWindow extends JFrame implements ActionListener{
	
	private static LoginWindow instance;
	private static JButton submit, register;
	private static JLabel log, pass, welc;
	private static JTextField name, cred;
	private static JPanel panel;
	private static String[] data;
	private static PopUpMessage pop = new PopUpMessage();

	public static LoginWindow getInstance() {
		if (instance == null)
			instance = new LoginWindow();

		return instance;
	}
	protected LoginWindow() {
		super("Login Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		submit = new JButton("Login");
		register = new JButton("Go to Registration Page");
		log = new JLabel("Username");
		pass = new JLabel("Password");
		name = new JTextField(21);
		cred = new JPasswordField(21);
		panel = new JPanel();
		welc = new JLabel("Welcome");
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();
		
		grid.gridx = 2;
		grid.gridy = 0;
		panel.add(welc, grid);
		
		grid.gridx = 1;
		grid.gridy = 1;
		panel.add(log,grid);
		
		grid.gridx = 2;
		grid.gridy = 1;
		panel.add(name,grid);
		
		grid.gridx = 1;
		grid.gridy = 2;		
		panel.add(pass, grid);
		
		grid.gridx = 2;
		grid.gridy = 2;
		panel.add(cred, grid);
		
		grid.gridx = 2;
		grid.gridy = 3;
		submit.setActionCommand("Login");
	    submit.addActionListener(this);;
		panel.add(submit,grid);
		
		grid.gridx = 2;
		grid.gridy = 4;
		register.setActionCommand("Register");
	    register.addActionListener(this);;
		panel.add(register, grid);
		
		this.add(panel);
		setSize(900, 600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("Login".equals(e.getActionCommand())) {
	        String[] data = {name.getText(), cred.getText()};
	        this.data = data;
	        ReadCSV read = new ReadCSV("Login", data);
	        if(read.checkDataExist()) {
	        	pop.infoBox("Success!", "Login Successful");
	        } else {
	        	pop.infoBox("There is an error with the provided credentials.", "Login Failed");
	        }
	    } else if ("Register".equals(e.getActionCommand())) {
	    	new RegisterWindow();
	    	dispose();
	    }
	}
}
