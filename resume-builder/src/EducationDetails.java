import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;

public class EducationDetails implements ActionListener {

	public JFrame frame2;
	private JTextField schoolnametText,schoollocText,degreeText,fostudyText;
	private JLabel page2Head, page2Extra, schoolNameLabel, SchoolLocationLabel, degreeLabel, fieldOfStudyLabel, gdstartDate, graduationEndDateLabel;
	private JButton backButton2, nextButton2, exitButton2;
	public String schoolnameString, schoollocString, degreeString, fosString, gstartString, gendString;
	private JPanel panel2;
	private JDateChooser gstartText, gendText;
	private Date selectedDate1, selectedDate2;
	private Calendar minDate1,minDate2,maxDate1,maxDate2;
	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationDetails window = new EducationDetails();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public EducationDetails() {
		initialize();
	}

	// Initialize the contents of the frame.
	private void initialize() {
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(new Color(79, 176, 198));
		frame2.getContentPane().setForeground(new Color(79, 176, 198));
		frame2.setBounds(100, 100, 901, 550);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		page2Head = new JLabel("EDUCATION INFO");
		page2Head.setBounds(305, 0, 298, 91);
		page2Head.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page2Head.setBackground(new Color(0, 0, 0));
		page2Head.setForeground(new Color(0, 0, 0));
		frame2.getContentPane().add(page2Head);
		
		page2Extra = new JLabel("Tell us about your education.");
		page2Extra.setForeground(new Color(255, 255, 255));
		page2Extra.setFont(new Font("Arial", Font.PLAIN, 19));
		page2Extra.setBounds(326, 61, 250, 42);
		frame2.getContentPane().add(page2Extra);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new LineBorder(new Color(215, 248, 254)));
		panel2.setBackground(new Color(146, 207, 220));
		panel2.setBounds(21, 113, 843, 374);
		frame2.getContentPane().add(panel2);
		
		schoolNameLabel = new JLabel("School Name");
		schoolNameLabel.setForeground(Color.BLACK);
		schoolNameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		schoolNameLabel.setBackground(Color.BLACK);
		schoolNameLabel.setBounds(20, 21, 136, 31);
		panel2.add(schoolNameLabel);
		
		schoolnametText = new JTextField();
		schoolnametText.setColumns(10);
		schoolnametText.setBounds(20, 48, 373, 31);
		panel2.add(schoolnametText);
		
		SchoolLocationLabel = new JLabel("School Location");
		SchoolLocationLabel.setForeground(Color.BLACK);
		SchoolLocationLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		SchoolLocationLabel.setBackground(Color.BLACK);
		SchoolLocationLabel.setBounds(403, 21, 136, 31);
		schoolnametText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE|| e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown() ) {
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    schoolnametText.setText(" ");
                }
            }
		});
		panel2.add(SchoolLocationLabel);
		
		schoollocText = new JTextField();
		schoollocText.setColumns(10);
		schoollocText.setBounds(403, 48, 415, 31);
		schoollocText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='-'||Character.isAlphabetic(ch) ||Character.isDigit(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    schoollocText.setText(" ");
                }
            }
		});
		panel2.add(schoollocText);
		
		degreeLabel = new JLabel("Degree\r\n");
		degreeLabel.setForeground(Color.BLACK);
		degreeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		degreeLabel.setBackground(Color.BLACK);
		degreeLabel.setBounds(20, 89, 92, 31);
		panel2.add(degreeLabel);
		
		degreeText = new JTextField();
		degreeText.setColumns(10);
		degreeText.setBounds(20, 118, 798, 31);
		degreeText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='-'|| Character.isAlphabetic(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()||Character.getType(ch) == Character.OTHER_PUNCTUATION || Character.getType(ch) == Character.MATH_SYMBOL) {
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    degreeText.setText(" ");
                }
            }
		});
		panel2.add(degreeText);
		
		fieldOfStudyLabel = new JLabel("Field of Study");
		fieldOfStudyLabel.setForeground(Color.BLACK);
		fieldOfStudyLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		fieldOfStudyLabel.setBackground(Color.BLACK);
		fieldOfStudyLabel.setBounds(20, 159, 164, 31);
		panel2.add(fieldOfStudyLabel);
		
		fostudyText = new JTextField();
		fostudyText.setColumns(10);
		fostudyText.setBounds(20, 187, 798, 31);
		fostudyText.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='-'|| Character.isAlphabetic(ch) || Character.isWhitespace(ch)|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||e.isShiftDown()||Character.getType(ch) == Character.OTHER_PUNCTUATION || Character.getType(ch) == Character.MATH_SYMBOL) {
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    fostudyText.setText(" ");
                }
            }
		});
		panel2.add(fostudyText);
		
		gdstartDate = new JLabel("Graduation Start Date");
		gdstartDate.setForeground(Color.BLACK);
		gdstartDate.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		gdstartDate.setBackground(Color.BLACK);
		gdstartDate.setBounds(21, 228, 209, 31);
		panel2.add(gdstartDate);
		
		graduationEndDateLabel = new JLabel("Graduation End Date");
		graduationEndDateLabel.setForeground(Color.BLACK);
		graduationEndDateLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		graduationEndDateLabel.setBackground(Color.BLACK);
		graduationEndDateLabel.setBounds(404, 228, 170, 31);
		panel2.add(graduationEndDateLabel);
		
		backButton2 = new JButton("BACK");
		backButton2.setForeground(Color.BLACK);
		backButton2.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton2.setBackground(new Color(215, 248, 254));
		backButton2.setBounds(149, 314, 171, 38);
		panel2.add(backButton2);
		
		nextButton2 = new JButton("NEXT");
		nextButton2.setForeground(Color.BLACK);
		nextButton2.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton2.setBackground(new Color(215, 248, 254));
		nextButton2.setBounds(511, 314, 171, 38);
		panel2.add(nextButton2);
		
		exitButton2 = new JButton("EXIT");
		exitButton2.setForeground(Color.BLACK);
		exitButton2.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton2.setBackground(new Color(215, 248, 254));
		exitButton2.setBounds(330, 314, 171, 38);
		panel2.add(exitButton2);
		
		gstartText = new JDateChooser();
		minDate1 = Calendar.getInstance();
		minDate1.set(1970, Calendar.JANUARY, 1); // set minimum date to Jan 1, 1970
		maxDate1 = Calendar.getInstance();
		maxDate1.set(2023, Calendar.DECEMBER, 31); // set maximum date to Dec 31, 2023
		gstartText.setSelectableDateRange(minDate1.getTime(), maxDate1.getTime());
		gstartText.setBounds(20, 254, 373, 38);
		panel2.add(gstartText);
		
		gendText = new JDateChooser();
		minDate2 = Calendar.getInstance();
		minDate2.set(1973, Calendar.JANUARY, 1); // set minimum date to Jan 1, 1973
		maxDate2 = Calendar.getInstance();
		maxDate2.set(2023, Calendar.DECEMBER, 31); // set maximum date to Dec 31, 2023
		gstartText.setSelectableDateRange(minDate2.getTime(), maxDate2.getTime());
		gendText.setBounds(403, 254, 415, 38);
		panel2.add(gendText);
		
		// adding action listeners to the buttons for a click event
		backButton2.addActionListener(this);
		exitButton2.addActionListener(this);
		nextButton2.addActionListener(this);

	}
	
	@Override
	public void actionPerformed(ActionEvent e2) {
		if (e2.getSource() == exitButton2) {
			System.exit(0);
		}
		else if (e2.getSource() == nextButton2) {	
			
			// storing the inputs to required variables
			schoolnameString = schoolnametText.getText();
			schoollocString = schoollocText.getText();
			degreeString = degreeText.getText();
			fosString = fostudyText.getText();
			selectedDate1 = gstartText.getDate();
			selectedDate2 = gendText.getDate();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			gstartString = dateFormat.format(selectedDate1);
			gendString = dateFormat.format(selectedDate2);
			
			if (schoolnameString.isEmpty() || schoollocString.isEmpty() || degreeString.isEmpty() || fosString.isEmpty() || gstartString.isEmpty() || gendString.isEmpty()) {
			    JOptionPane.showMessageDialog(null, "Please fill in all the details!", "Message", JOptionPane.INFORMATION_MESSAGE);
			}

			else {
				pdfGenerator.EducationInit(schoolnameString, schoollocString, degreeString, fosString, gstartString, gendString);
				WorkInfo wi = new WorkInfo();
				wi.frame3.setVisible(true);
				frame2.dispose();

			}
		}
		else if (e2.getSource()==backButton2) {
			InfoPage ip = new InfoPage();
			ip.frame.setVisible(true);
			frame2.dispose();
		}
	}
}
