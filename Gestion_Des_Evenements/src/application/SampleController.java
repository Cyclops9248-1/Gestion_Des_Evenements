package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SampleController {

	@FXML
    private Button btnD;

    @FXML
    private TextField input2;

    @FXML
    private TextField input1;

    @FXML
    private Button btnS;

    @FXML
    private Label lblReponse;

    @FXML
    private Button btnA;

    @FXML
    private Button btnM;
    
    double nombre1 = 0;
    double nombre2 = 0;

    @FXML
    void addition() {
    	if(verifieTexte()) {
    		lblReponse.setText("R�ponse: " + (nombre1 + nombre2));
    	}
    }

    @FXML
    void multiplication() {
    	if(verifieTexte()) {
    		lblReponse.setText("R�ponse: " + (nombre1 * nombre2));
    	}
    }

    @FXML
    void division() {
    	if(verifieTexte()) {
    		lblReponse.setText("R�ponse: " + (nombre1 / nombre2));
    	}
    }

    @FXML
    void soustraction() {
    	if(verifieTexte()) {
    		lblReponse.setText("R�ponse: " + (nombre1 - nombre2));
    	}
    }
    
    boolean verifieTexte() {
    	try {
    		nombre1 = Integer.parseInt(input1.getText());
    		nombre2 = Integer.parseInt(input2.getText());
    		return true;
    	}
    	catch(Exception e){
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setHeaderText("Attention-Erreur");
    		alert.setTitle("Erreur");
    		alert.setContentText("Tu dois �crire un nombre");
    		alert.show();
    		input1.requestFocus();
    		return false;
    	}

    	
    }

}