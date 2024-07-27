import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.util.regex.*;

public class InfoPage implements ActionListener {

	public JFrame frame;
	private JTextField fnameText,lnameText,profText,cityText,stateText,zipcodeText,phoneText,emailText;
	private JLabel page1Head,page1Extra,lnameLabel,professionLabel,phoneLabel,emailLabel;
	private JPanel panel1;
	private JButton exitButton1,nextButton1;
	public String fnameString, lnameString, profString, cityString, stateString,emailString;
	public String zipCode, phoneNumber;
	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPage window = new InfoPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public InfoPage() {
		initialize();
	}

	// Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(79, 176, 198));
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frame.setBounds(100, 100, 901, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		page1Head = new JLabel("PERSONAL INFORMATION");
		page1Head.setBackground(new Color(0, 0, 0));
		page1Head.setForeground(new Color(0, 0, 0));
		page1Head.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page1Head.setBounds(224, 0, 439, 91);
		frame.getContentPane().add(page1Head);
		
		page1Extra = new JLabel("What is the best way for employers to contact you?");
		page1Extra.setForeground(new Color(255, 255, 255));
		page1Extra.setFont(new Font("Arial", Font.PLAIN, 19));
		page1Extra.setBounds(224, 64, 439, 42);
		frame.getContentPane().add(page1Extra);
		
		panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(215, 248, 254)));
		panel1.setBackground(new Color(146, 207, 220));
		panel1.setBounds(21, 116, 843, 374);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel fnameLabel = new JLabel("First Name");
		fnameLabel.setBackground(new Color(0, 0, 0));
		fnameLabel.setForeground(new Color(0, 0, 0));
		fnameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		fnameLabel.setBounds(20, 21, 82, 31);
		panel1.add(fnameLabel);
		
		fnameText = new JTextField();
		fnameText.setColumns(10);
		fnameText.setBounds(20, 48, 373, 31);
		fnameText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isAlphabetic(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    fnameText.setText(" ");
                }
            }
		});
		panel1.add(fnameText);
		
		lnameLabel = new JLabel("Last Name");
		lnameLabel.setBackground(new Color(0, 0, 0));
		lnameLabel.setForeground(new Color(0, 0, 0));
		lnameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lnameLabel.setBounds(403, 21, 82, 31);
		panel1.add(lnameLabel);
		
		lnameText = new JTextField();
		lnameText.setColumns(10);
		lnameText.setBounds(403, 48, 415, 31);
		
		lnameText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    lnameText.setText(" ");
                }
            }
		});
		panel1.add(lnameText);
		
		professionLabel = new JLabel("Profession");
		professionLabel.setBackground(new Color(0, 0, 0));
		professionLabel.setForeground(new Color(0, 0, 0));
		professionLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		professionLabel.setBounds(20, 89, 92, 31);
		panel1.add(professionLabel);
		
		profText = new JTextField();
		profText.setColumns(10);
		profText.setBounds(20, 118, 798, 31);
		
		profText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='-'|| Character.isAlphabetic(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()||Character.getType(ch) == Character.OTHER_PUNCTUATION || Character.getType(ch) == Character.MATH_SYMBOL){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    profText.setText(" ");
                }
            }
});
		panel1.add(profText);
		
		JLabel cityLabel = new JLabel("City/Town/District");
		cityLabel.setBackground(new Color(0, 0, 0));
		cityLabel.setForeground(new Color(0, 0, 0));
		cityLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		cityLabel.setBounds(20, 159, 164, 31);
		panel1.add(cityLabel);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setBackground(new Color(0, 0, 0));
		stateLabel.setForeground(new Color(0, 0, 0));
		stateLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		stateLabel.setBounds(277, 159, 92, 31);
		panel1.add(stateLabel);
		
		JLabel zipcodeLabel = new JLabel("Zip Code");
		zipcodeLabel.setBackground(new Color(0, 0, 0));
		zipcodeLabel.setForeground(new Color(0, 0, 0));
		zipcodeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		zipcodeLabel.setBounds(542, 159, 92, 31);
		panel1.add(zipcodeLabel);
		
		cityText = new JTextField();
		cityText.setColumns(10);
		cityText.setBounds(20, 187, 247, 31);
		
		cityText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isAlphabetic(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    cityText.setText(" ");
                }
            }
});
		panel1.add(cityText);
		
		stateText = new JTextField();
		stateText.setColumns(10);
		stateText.setBounds(277, 187, 255, 31);
		//To allow only number inputs
		stateText.addKeyListener(new KeyAdapter(){
		            public void keyPressed(KeyEvent e){

		                char ch = e.getKeyChar();
		                if(Character.isAlphabetic(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()){
		                }
		                else{
		                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
		                    stateText.setText(" ");
		                }
		            }
		});
				
		panel1.add(stateText);
		
		zipcodeText = new JTextField();
		zipcodeText.setColumns(10);
		zipcodeText.setBounds(542, 187, 276, 31);
		//To allow only number inputs
		zipcodeText.addKeyListener(new KeyAdapter(){
		            public void keyPressed(KeyEvent e){

		                char ch = e.getKeyChar();
		                if(Character.isDigit(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE ||e.isShiftDown()){
		                }
		                else{
		                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
		                    zipcodeText.setText(" ");
		                }
		            }
		});
		panel1.add(zipcodeText);

		phoneText = new JTextField();
		phoneText.setColumns(10);
		phoneText.setBounds(20, 254, 374, 31);
		//To allow only number inputs
		phoneText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE ||e.isShiftDown()){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    phoneText.setText(" ");
                }
            }
		});
		
		panel1.add(phoneText);
		
		phoneLabel = new JLabel("Phone");
		phoneLabel.setBackground(new Color(0, 0, 0));
		phoneLabel.setForeground(new Color(0, 0, 0));
		phoneLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		phoneLabel.setBounds(21, 228, 82, 31);
		panel1.add(phoneLabel);
		
		emailLabel = new JLabel("Email address");
		emailLabel.setBackground(new Color(0, 0, 0));
		emailLabel.setForeground(new Color(0, 0, 0));
		emailLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		emailLabel.setBounds(404, 228, 145, 31);
		panel1.add(emailLabel);
		
		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(404, 254, 415, 31);
		panel1.add(emailText);
		
		exitButton1 = new JButton("EXIT");
		exitButton1.setForeground(new Color(0, 0, 0));
		exitButton1.setBackground(new Color(215, 248, 254));
		exitButton1.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton1.setBounds(222, 314, 171, 38);
		panel1.add(exitButton1);
		
		nextButton1 = new JButton("NEXT");
		nextButton1.setBackground(new Color(215, 248, 254));
		nextButton1.setForeground(new Color(0, 0, 0));
		nextButton1.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton1.setBounds(403, 314, 171, 38);
		panel1.add(nextButton1);
		
		// adding action listeners to the buttons for a click event
		exitButton1.addActionListener(this);
		nextButton1.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exitButton1) {
			System.exit(0);
		}
		else if (e.getSource() == nextButton1) {
			
		//storing the inputs to required variables
		fnameString = fnameText.getText();
		fnameText.setText(fnameString);
		lnameString = lnameText.getText();
		profString = profText.getText();
		cityString = cityText.getText();
		stateString = stateText.getText();
		zipCode =  zipcodeText.getText();
		phoneNumber = phoneText.getText();
		emailString = emailText.getText();
		
		if ((fnameString.isEmpty()) || (lnameString.isEmpty()) || (profString.isEmpty()) || (cityString.isEmpty()) ||(zipCode.isEmpty()) || (phoneNumber.isEmpty())||(stateString.isEmpty()) || (emailString.isEmpty())) {
			JOptionPane.showMessageDialog(nextButton1, "Please fill in all the details!", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (!isValidZipcode(zipCode)) {
			JOptionPane.showMessageDialog(null, "Invalid Zip Code", "Error", JOptionPane.ERROR_MESSAGE);
            zipcodeText.setText("");
		}
		else if (!isValidPhoneNumber(phoneNumber)) {
			JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            phoneText.setText("");
		}
		else if (!isValidEmail(emailString)) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
            emailText.setText("");
		}
		else {
			pdfGenerator.InformationInit(fnameString, lnameString, profString, cityString, stateString, zipCode, phoneNumber, emailString);
			EducationDetails ed = new EducationDetails();
			ed.frame2.setVisible(true);
			frame.dispose();
		}
		
	}
	}
	
	// function for email Validation
	public boolean isValidEmail(String email) {
        // Regular expression to validate email format
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        // check if email matches the regular expression
        System.out.println(email.matches(regex));
        return email.matches(regex);
    }
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
	    // regular expression to match 10-digit phone number
	    String regex = "\\d{10}";

	    // compile the regular expression into a pattern
	    Pattern pattern = Pattern.compile(regex);

	    // match the pattern against the input phone number
	    Matcher matcher = pattern.matcher(phoneNumber);
	    // return true if the phone number matches the pattern, false otherwise
	    return matcher.matches();
	}
	
	public static boolean isValidZipcode(String zipcode) {
	    // regular expression to match 10-digit phone number
	    String regex = "\\d{6}";

	    // compile the regular expression into a pattern
	    Pattern pattern = Pattern.compile(regex);

	    // match the pattern against the input phone number
	    Matcher matcher = pattern.matcher(zipcode);

	    // return true if the phone number matches the pattern, false otherwise
	    return matcher.matches();
	}

}