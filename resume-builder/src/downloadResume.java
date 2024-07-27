import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;

public class downloadResume implements ActionListener{

	public JFrame frame6;
	private JTextField fileNameText;
	private JLabel page6label, filenamelabel;
	private JPanel panel;
	private JButton exitButton6, dwldbutton6;
	String filename;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					downloadResume window = new downloadResume();
					window.frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public downloadResume() {
		initialize();
	}

	// Initialize the contents of the frame6.
	private void initialize() {
		frame6 = new JFrame();
		frame6.getContentPane().setBackground(new Color(79, 176, 198));
		frame6.setBounds(100, 100, 455, 246);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		
		page6label = new JLabel("DOWNLOAD");
		page6label.setForeground(Color.BLACK);
		page6label.setFont(new Font("Arial Black", Font.PLAIN, 30));
		page6label.setBackground(Color.BLACK);
		page6label.setBounds(122, 0, 214, 55);
		frame6.getContentPane().add(page6label);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(146, 207, 220));
		panel.setBounds(8, 55, 425, 139);
		frame6.getContentPane().add(panel);
		
		exitButton6 = new JButton("EXIT");
		exitButton6.setForeground(Color.BLACK);
		exitButton6.setFont(new Font("Arial", Font.PLAIN, 19));
		exitButton6.setBackground(new Color(215, 248, 254));
		exitButton6.setBounds(211, 87, 171, 38);
		panel.add(exitButton6);
		
		dwldbutton6 = new JButton("DOWNLOAD");
		dwldbutton6.setForeground(Color.BLACK);
		dwldbutton6.setFont(new Font("Arial", Font.PLAIN, 19));
		dwldbutton6.setBackground(new Color(215, 248, 254));
		dwldbutton6.setBounds(30, 87, 171, 38);
		panel.add(dwldbutton6);
		
		fileNameText = new JTextField();
		fileNameText.setBounds(10, 38, 399, 38);
		panel.add(fileNameText);
		fileNameText.setColumns(10);
		
		filenamelabel = new JLabel("File Name");
		filenamelabel.setForeground(Color.BLACK);
		filenamelabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		filenamelabel.setBackground(Color.BLACK);
		filenamelabel.setBounds(10, 10, 79, 31);
		panel.add(filenamelabel);
		
		// adding action listeners to the buttons for a click event
		dwldbutton6.addActionListener(this);
		exitButton6.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e6) {
		if (e6.getSource() == exitButton6) {
			System.exit(0);
		}
		else if (e6.getSource() == dwldbutton6) {
			// to download pdf
			filename = fileNameText.getText();
			pdfGenerator.DownloadInit(filename);
			try {
				@SuppressWarnings("unused")
				pdfGenerator ob = new pdfGenerator();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			// opening the PDF file with the default application
			String path = filename+".pdf";
			File file = new File(path);
			try {
			    Desktop.getDesktop().open(file);
			} catch (java.io.IOException e) {
			    e.printStackTrace();
			}
		}
	}
}
