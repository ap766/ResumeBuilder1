import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkillsInfo implements ActionListener{

	public JFrame frame5;
	private JTextField skill1text, skill2text, skill3text, skill4text, skill5text;
	private JLabel page4ExtraLabel, page4Label, skillsLabel, lblSkill, lblSkill_1, lblSkill_3, lblSkill_2;
	private JPanel panel;
	private JButton exitButton5, addButton5, nextButton5, backButton5;
	public String skill1String="", skill2String="", skill3String="", skill4String="", skill5String="";
	public int counter = 0, var;

	public int ClickCounter(int count){
			return ++counter;
	}
	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkillsInfo window = new SkillsInfo();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public SkillsInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame5.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.getContentPane().setBackground(new Color(79, 176, 198));
		frame5.getContentPane().setForeground(new Color(79, 176, 198));
		frame5.setBounds(100, 100, 901, 550);
		frame5.getContentPane().setLayout(null);
		
		page4ExtraLabel = new JLabel("What skills do you want to highlight?");
		page4ExtraLabel.setForeground(Color.WHITE);
		page4ExtraLabel.setFont(new Font("Arial", Font.PLAIN, 19));
		page4ExtraLabel.setBounds(287, 37, 316, 42);
		frame5.getContentPane().add(page4ExtraLabel);
		
		page4Label = new JLabel("SKILLS");
		page4Label.setForeground(Color.BLACK);
		page4Label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page4Label.setBackground(Color.BLACK);
		page4Label.setBounds(371, 1, 131, 55);
		frame5.getContentPane().add(page4Label);
		
		panel = new JPanel();
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(15, 89, 856, 409);
		frame5.getContentPane().add(panel);
		panel.setLayout(null);
		
		skillsLabel = new JLabel("Skill");
		skillsLabel.setForeground(Color.BLACK);
		skillsLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		skillsLabel.setBackground(Color.BLACK);
		skillsLabel.setBounds(25, 10, 79, 31);
		panel.add(skillsLabel);
		
		skill1text = new JTextField();
		skill1text.setColumns(10);
		skill1text.setBounds(25, 41, 620, 38);
		skill1text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    skill1text.setText(" ");
                }


            }
		});
		panel.add(skill1text);
		
		lblSkill = new JLabel("Skill");
		lblSkill.setForeground(Color.BLACK);
		lblSkill.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill.setBackground(Color.BLACK);
		lblSkill.setBounds(25, 80, 79, 31);
		panel.add(lblSkill);
		
		skill2text = new JTextField();
		skill2text.setColumns(10);
		skill2text.setBounds(25, 110, 620, 38);
		skill2text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    skill2text.setText(" ");
                }


            }
		});
		panel.add(skill2text);
		
		lblSkill_1 = new JLabel("Skill");
		lblSkill_1.setForeground(Color.BLACK);
		lblSkill_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill_1.setBackground(Color.BLACK);
		lblSkill_1.setBounds(25, 161, 79, 31);
		panel.add(lblSkill_1);
		
		skill3text = new JTextField();
		skill3text.setColumns(10);
		skill3text.setBounds(25, 192, 620, 38);
		skill3text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    skill3text.setText(" ");
                }


            }
		});
		panel.add(skill3text);
		
		lblSkill_2 = new JLabel("Skill");
		lblSkill_2.setForeground(Color.BLACK);
		lblSkill_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill_2.setBackground(Color.BLACK);
		lblSkill_2.setBounds(25, 240, 79, 31);
		panel.add(lblSkill_2);
		
		skill4text = new JTextField();
		skill4text.setColumns(10);
		skill4text.setBounds(25, 271, 620, 38);
		skill4text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    skill4text.setText(" ");
                }


            }
		});
		panel.add(skill4text);
		
		lblSkill_3 = new JLabel("Skill");
		lblSkill_3.setForeground(Color.BLACK);
		lblSkill_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblSkill_3.setBackground(Color.BLACK);
		lblSkill_3.setBounds(25, 318, 79, 31);
		panel.add(lblSkill_3);
		
		skill5text = new JTextField();
		skill5text.setColumns(10);
		skill5text.setBounds(25, 349, 620, 38);
		skill5text.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_CAPS_LOCK || e.isShiftDown()) {
                    // Do nothing
                } else {
                    JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    skill5text.setText(" ");
                }


            }
		});
		panel.add(skill5text);
		
		exitButton5 = new JButton("EXIT");
		exitButton5.setForeground(Color.BLACK);
		exitButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton5.setBackground(new Color(215, 248, 254));
		exitButton5.setBounds(663, 349, 171, 38);
		panel.add(exitButton5);
		
		nextButton5 = new JButton("NEXT");
		nextButton5.setForeground(Color.BLACK);
		nextButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		nextButton5.setBackground(new Color(215, 248, 254));
		nextButton5.setBounds(663, 295, 171, 38);
		panel.add(nextButton5);
		
		backButton5 = new JButton("BACK");
		backButton5.setForeground(Color.BLACK);
		backButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		backButton5.setBackground(new Color(215, 248, 254));
		backButton5.setBounds(663, 242, 171, 38);
		panel.add(backButton5);
		
		addButton5 = new JButton("ADD");
		addButton5.setForeground(Color.BLACK);
		addButton5.setFont(new Font("Arial", Font.PLAIN, 19));
		addButton5.setBackground(new Color(215, 248, 254));
		addButton5.setBounds(663, 189, 171, 38);
		panel.add(addButton5);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// adding action listeners to the buttons for a click event
		addButton5.addActionListener(this);
		backButton5.addActionListener(this);
		exitButton5.addActionListener(this);
		nextButton5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e5) {
		if (e5.getSource() == exitButton5) {
			System.exit(0);
		}
		else if (e5.getSource() == nextButton5) {
			skill1String = skill1text.getText();
			skill2String = skill2text.getText();
			skill3String = skill3text.getText();
			skill4String = skill4text.getText();
			skill5String = skill5text.getText();
			if ((skill1String.isEmpty())) {
				JOptionPane.showMessageDialog(null, "Please enter at least one Skill!", "Message", JOptionPane.INFORMATION_MESSAGE);
				skill1text.setEditable(true);
				counter = 1;
			}
			else if ((skill2String.isEmpty()))
			{
				JOptionPane.showMessageDialog(null, "Please enter Another Skill!", "Message", JOptionPane.INFORMATION_MESSAGE);
				skill2text.setEditable(true);
				counter = 2;
			}
			else {	
			pdfGenerator.SkillsInit(skill1String, skill2String, skill3String, skill4String, skill5String);
			downloadResume dr = new downloadResume();
			dr.frame6.setVisible(true);
			frame5.dispose();
			}
		}
		else if (e5.getSource() == backButton5) {
			LanguagesInfo li = new LanguagesInfo();
			li.frame4.setVisible(true);
			frame5.dispose();
		}
		else if (e5.getSource() == addButton5) {
			var = ClickCounter(counter);
			switch (var) {
			case 1:
					skill1String=skill1text.getText();
					if (skill1String=="") {
						JOptionPane.showMessageDialog(addButton5, "Tell us a skill you know!", "Alert", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						skill1text.setEditable(false);
						skill2text.setEditable(true);
						skill2text.requestFocus();
					}
					break;
			case 2: 
					skill2String=skill2text.getText();
					skill2text.setEditable(false);
					skill3text.setEditable(true);
					skill3text.requestFocus();
					break;
			case 3:
					skill3String=skill3text.getText();
					skill3text.setEditable(false);
					skill4text.setEditable(true);
					skill4text.requestFocus();
					break;
			case 4: 
					skill4String=skill4text.getText();
					skill4text.setEditable(false);
					skill5text.setEditable(true);
					skill5text.requestFocus();
					break;
			case 5: 
					skill5String=skill5text.getText();
					skill5text.setEditable(false);
					break;
			default : JOptionPane.showMessageDialog(addButton5, "Thank you for your details!", "Message", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
