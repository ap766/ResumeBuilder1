import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LanguagesInfo implements ActionListener{

	public JFrame frame4;
	private JTextField lang1text, lang2text, lang3text, lang4text, lang5text;
	private JLabel page5extra, page5label, lang1, lang2, lang3, lang4, lang5;
	private JPanel panel4;
	private JButton exitButton4, nextButton4, backButton4, addButton4;
	public String lang1String="", lang2String="", lang3String="", lang4String="", lang5String="";
	public int counter = 0, var;

	public int ClickCounter(int count){
			return ++counter;
	}

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LanguagesInfo window = new LanguagesInfo();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public LanguagesInfo() {
		initialize();
	}

	// Initialize the contents of the frame4.
	private void initialize() {
		frame4 = new JFrame();
		frame4.getContentPane().setBackground(new Color(79, 176, 198));
		frame4.getContentPane().setForeground(new Color(79, 176, 198));
		frame4.setBounds(100, 100, 901, 550);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		page5extra = new JLabel("Add the languages that you know.");
		page5extra.setForeground(Color.WHITE);
		page5extra.setFont(new Font("Arial", Font.PLAIN, 19));
		page5extra.setBounds(295, 46, 316, 42);
		frame4.getContentPane().add(page5extra);
		
		page5label = new JLabel("LANGUAGES");
		page5label.setForeground(Color.BLACK);
		page5label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page5label.setBackground(Color.BLACK);
		page5label.setBounds(327, 10, 214, 55);
		frame4.getContentPane().add(page5label);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(new Color(146, 207, 220));
		panel4.setBounds(16, 90, 856, 409);
		frame4.getContentPane().add(panel4);
		
		lang1 = new JLabel("Language");
		lang1.setForeground(Color.BLACK);
		lang1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang1.setBackground(Color.BLACK);
		lang1.setBounds(25, 10, 79, 31);
		panel4.add(lang1);
		
		lang1text = new JTextField();
		lang1text.setColumns(10);
		lang1text.setBounds(25, 41, 620, 38);
		lang1text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    lang1text.setText(" ");
                }
            }
		});
		panel4.add(lang1text);
		
		lang2 = new JLabel("Language");
		lang2.setForeground(Color.BLACK);
		lang2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang2.setBackground(Color.BLACK);
		lang2.setBounds(25, 80, 79, 31);
		panel4.add(lang2);
		
		lang2text = new JTextField();
		lang2text.setColumns(10);
		lang2text.setBounds(25, 110, 620, 38);
		lang2text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    lang2text.setText(" ");
                }
            }
		});
		panel4.add(lang2text);
		
		lang3 = new JLabel("Language");
		lang3.setForeground(Color.BLACK);
		lang3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang3.setBackground(Color.BLACK);
		lang3.setBounds(25, 161, 79, 31);
		panel4.add(lang3);
		
		lang3text = new JTextField();
		lang3text.setColumns(10);
		lang3text.setBounds(25, 192, 620, 38);
		lang3text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    lang3text.setText(" ");
                }
            }
		});
		panel4.add(lang3text);
		
		lang4 = new JLabel("Language");
		lang4.setForeground(Color.BLACK);
		lang4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang4.setBackground(Color.BLACK);
		lang4.setBounds(25, 240, 79, 31);
		panel4.add(lang4);
		
		lang4text = new JTextField();
		lang4text.setColumns(10);
		lang4text.setBounds(25, 271, 620, 38);
		lang4text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    lang4text.setText(" ");
                }
            }
		});
		panel4.add(lang4text);
		
		lang5 = new JLabel("Language");
		lang5.setForeground(Color.BLACK);
		lang5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lang5.setBackground(Color.BLACK);
		lang5.setBounds(25, 318, 79, 31);
		panel4.add(lang5);
		
		lang5text = new JTextField();
		lang5text.setColumns(10);
		lang5text.setBounds(25, 349, 620, 38);
		lang5text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    lang5text.setText(" ");
                }


            }
		});
		panel4.add(lang5text);
		
		exitButton4 = new JButton("EXIT");
		exitButton4.setForeground(Color.BLACK);
		exitButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton4.setBackground(new Color(215, 248, 254));
		exitButton4.setBounds(663, 349, 171, 38);
		panel4.add(exitButton4);
		
		nextButton4 = new JButton("NEXT");
		nextButton4.setForeground(Color.BLACK);
		nextButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton4.setBackground(new Color(215, 248, 254));
		nextButton4.setBounds(663, 295, 171, 38);
		panel4.add(nextButton4);
		
		backButton4 = new JButton("BACK");
		backButton4.setForeground(Color.BLACK);
		backButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton4.setBackground(new Color(215, 248, 254));
		backButton4.setBounds(663, 242, 171, 38);
		panel4.add(backButton4);
		
		addButton4 = new JButton("ADD");
		addButton4.setForeground(Color.BLACK);
		addButton4.setFont(new Font("Arial", Font.PLAIN, 19));
		addButton4.setBackground(new Color(215, 248, 254));
		addButton4.setBounds(663, 189, 171, 38);
		panel4.add(addButton4);
		
		lang2text.setEditable(false);
		lang3text.setEditable(false);
		lang4text.setEditable(false);
		lang5text.setEditable(false);
		
		// adding action listeners to the buttons for a click event
		addButton4.addActionListener(this);
		backButton4.addActionListener(this);
		exitButton4.addActionListener(this);
		nextButton4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e4) {
		if (e4.getSource() == exitButton4) {
			System.exit(0);
		}
		else if (e4.getSource() == nextButton4) {
			lang1String=lang1text.getText();
			lang2String=lang2text.getText();
			lang3String=lang3text.getText();
			lang4String=lang4text.getText();
			lang5String=lang5text.getText();
			if ((lang1String.isEmpty())) {
				JOptionPane.showMessageDialog(null, "Please enter at least one Language!", "Message", JOptionPane.INFORMATION_MESSAGE);
				lang1text.setEditable(true);
				counter=1;
				}
				else {
					pdfGenerator.LanguagesInit(lang1String, lang2String, lang3String, lang4String, lang5String);
					SkillsInfo si = new SkillsInfo();
					si.frame5.setVisible(true);
					frame4.dispose();
			}
		}
		else if (e4.getSource()== backButton4) {
			WorkInfo wi = new WorkInfo();
			wi.frame3.setVisible(true);
			frame4.dispose();
		}
		else if (e4.getSource() == addButton4) {
			var = ClickCounter(counter);
			switch (var) {
			case 1: 
					lang1String=lang1text.getText();
					if (lang1String=="") {
						JOptionPane.showMessageDialog(addButton4, "Tell us a language you know!", "Alert", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						lang1text.setEditable(false);
						lang2text.setEditable(true);
						lang2text.requestFocus();
					}
					break;
			case 2: 
					lang2String=lang2text.getText();
					lang2text.setEditable(false);
					lang3text.setEditable(true);
					lang3text.requestFocus();
					break;
			case 3: 
					lang3String=lang3text.getText();
					lang3text.setEditable(false);
					lang4text.setEditable(true);
					lang4text.requestFocus();
					break;
			case 4: 
					lang4String=lang4text.getText();
					lang4text.setEditable(false);
					lang5text.setEditable(true);
					lang5text.requestFocus();
					break;
			case 5: 
					lang5String=lang5text.getText();
					lang5text.setEditable(false);
					break;
			default : JOptionPane.showMessageDialog(addButton4, "Thank you for your details!", "Message", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
