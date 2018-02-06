import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JButton;
public class BrowserClass {
	
	public static void main(String[] args) {
	JEditorPane browserPane = new JEditorPane();
	browserPane.setEditable(false);
	
	
	JEditorPane Editorpane1 = new JEditorPane();
	Editorpane1.setEditable(false);
	
	JTabbedPane tabbedPane = new JTabbedPane();
	browserPane.setEditable(false);
	JTextField textArea = new JTextField();
	JButton button = new JButton("Previous");

	JEditorPane Editorpane2 = new JEditorPane();
	Editorpane2.setEditable(false);
	
	JButton button2 = new JButton("Previous");
	Editorpane2.add(button);
	browserPane.add(button2);
	
	
	
	JButton exeButton = new JButton("Go to page (tab2)");
	JButton exeButton2 = new JButton("Go to page (tab3)");
	Editorpane1.add(exeButton);
	
	
	
	textArea.setBounds(400,200,400,50);
	textArea.setText("http://graceland.brightspace.com");
	
	textArea.setVisible(true);
	button.setSize(100,40);
	button.setLocation(1050,0);
	button2.setSize(100,40);
	button2.setLocation(1050,0);
	
	exeButton.setSize(200,100);
	exeButton.setLocation(300,400);
	
	exeButton2.setSize(200,100);
	exeButton2.setLocation(600,400);
	Editorpane1.add(exeButton2);
	
	String PreviousPage1;
	String PreviousPage2;
	PreviousPage1 = textArea.getText();
	PreviousPage2 = textArea.getText();
	
	
		exeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {  
					  Editorpane2.setPage(textArea.getText());
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
			}
		});
		
		exeButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  browserPane.setPage(textArea.getText());
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
			}
		});
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					  Editorpane2.setPage(PreviousPage1);
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  browserPane.setPage(PreviousPage2);
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
			}
		});
	
	
	
	
	
	
	
	JFrame browserWindow = new JFrame("<Nick's> Web Browser");

	try {
	  browserPane.setPage("http://graceland.brightspace.com");
	  Editorpane2.setPage("http://graceland.brightspace.com");
	}catch (IOException e) {
		System.out.println("error loading page");
	} 
	

	
	tabbedPane.addTab("Tab1", null,Editorpane1);
	tabbedPane.addTab("Tab2", null, Editorpane2);
	tabbedPane.addTab("Tab3", null,browserPane);
	Editorpane1.add(textArea);
	browserWindow.add(tabbedPane);
	browserWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	browserWindow.setSize(1200,900);
	browserWindow.setVisible(true);}
	
	

	
	
	
}


