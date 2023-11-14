 package cite.library;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 
 
 class Soon extends View{
	
	
	
	public void function(){
		Gui();
		
		
		submit.addActionListener(new ActionListener(){
			@Override
			
		public void actionPerformed(ActionEvent e){	
			String provinceT = provinceText.getText();
			String nameT = nameText.getText();
			String cityT = cityText.getText();
			
			
			 JOptionPane.showMessageDialog(frame,"Hi " + nameT + "!" + "\n" + "You're From " + cityT +", " + provinceT);
			 
			 
			 
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			
		}
			
		});
		
		
		clear.addActionListener(new ActionListener(){
			@Override
			
		public void actionPerformed(ActionEvent e){	
				
			 nameText.setText(" ");
			 cityText.setText(" ");
			 provinceText.setText(" ");
			 
			 
			 
			
			 
			
		}
			
		});
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}