package cite.library;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class View{
	JPanel panel = new JPanel();
		
	JFrame frame = new JFrame("Student");
	
	JLabel student,name,city,province;
	
	JButton clear,submit;
	
	TextField nameText,cityText,provinceText;
	
	
	
	public void Gui(){
		
		
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setLayout(null);
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

//-------------------------------------------------------------/
	
	student = new JLabel("Student");
	student.setBounds(10,20,50,10);
	frame.add(student);
	
//------------------------------------------------------------/	
	
	
	name = new JLabel("Name: ");
	name.setBounds(10,70,50,10);
	frame.add(name);
	
	nameText = new TextField();
	nameText.setBounds(60,67,130,20);
	frame.add(nameText);

//---------------------------------------------------------------/
	
	city = new JLabel("City: ");
	city.setBounds(10,100,50,15);
	frame.add(city);
	
	cityText = new TextField();
	cityText.setBounds(60,100,130,20);
	frame.add(cityText);
	
//----------------------------------------------------------------/

	province = new JLabel("Province: ");
	province.setBounds(10,135,60,15);
	frame.add(province);
	
	provinceText = new TextField();
	provinceText.setBounds(70,135,130,20);
	frame.add(provinceText);
	
//-----------------------------------------------------------------/

	clear = new JButton("Clear");
	clear.setBounds(90,180,70,15);
	frame.add(clear);
	
//-------------------------------------------------------------------/

	submit = new JButton("Submit");
	submit.setBounds(170,180,80,15);
	frame.add(submit);
	
	
	
	
	
//--------------------------------------------------------------------/	
	
	}
	}