package application;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField txt1;

    @FXML
    private Label lbl1;

    @FXML
    private Button btn1;
    
    int a = 0;

    @FXML
    void calculer() {
    	try {
        	a = Integer.parseInt(txt1.getText());
        	lbl1.setText("Nombre = " + a);
    	}
    	catch(NumberFormatException e){
    		lbl1.setText("Tu dois mettre un nombre dans le texte");
    	}
    	
    }

}
