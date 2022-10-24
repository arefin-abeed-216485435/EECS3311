package LoginPage;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterWindow extends JFrame implements ActionListener {
	
	private static JButton login, register;
	private static JLabel log, pass, regMes;
	private static JTextField name, cred;
	private static JPanel panel;
	private static String[] data;
	private static PopUpMessage pop = new PopUpMessage();
	
	private static RegisterWindow instance;
	
	public static RegisterWindow getInstance() {
		if (instance == null)
			instance = new RegisterWindow();

		return instance;
	}
	protected RegisterWindow() {
		super("Registration Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        login = new JButton("Go to Login Page");
		register = new JButton("Register");
		log = new JLabel("Username");
		pass = new JLabel("Password");
		name = new JTextField(21);
		cred = new JPasswordField(21);
		panel = new JPanel();
		regMes = new JLabel("Register");
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();
		
		grid.gridx = 2;
		grid.gridy = 0;
		panel.add(regMes, grid);
		
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
		register.setActionCommand("Register");
	    register.addActionListener(this);;
		panel.add(register,grid);
		
		grid.gridx = 2;
		grid.gridy = 4;
		login.setActionCommand("Login");
	    login.addActionListener(this);;
		panel.add(login, grid);
		
		this.add(panel);
		setSize(900, 600);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("Register".equals(e.getActionCommand())) {
	        String[] data = {name.getText(), cred.getText()};
	        this.data = data;
	        try {
				WriteCSV write = new WriteCSV(data, "Login");
				pop.infoBox("Success!", "Login Successful");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        
	    } else if ("Login".equals(e.getActionCommand())) {
	    	new LoginWindow();
	    	dispose();
	    }
	}
	
}
