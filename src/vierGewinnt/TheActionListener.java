package vierGewinnt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheActionListener implements ActionListener {
	public void actionPerformed(ActionEvent Click){
		Object Source = Click.getSource();
		if(Source == UI.restart){
			Utility.restart();
		}
		for(int i=0; i<7; i++){
			if(Source == UI.selectors[i]){
				Utility.playerTurn(i);
				Utility.computerTurn(Utility.level);
			}
		}
	}
}
