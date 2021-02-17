package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SampleController implements Initializable{

    @FXML
    private DatePicker dte;

    @FXML
    private TextField txtDate;
    
    @FXML
    private RadioButton rdoNon;

    @FXML
    private CheckBox chkOui;

    @FXML
    private CheckBox chkSampleText;

    @FXML
    private Label lblRadio;

    @FXML
    private ComboBox<?> cboChoix;

    @FXML
    private CheckBox chkNon;

    @FXML
    private ToggleGroup choix;

    @FXML
    private TextField txtChoix;

    @FXML
    private Label lblCheck;

    @FXML
    private TextField txtNom;
    
    @FXML
    private TextField premierNombre;
    
    @FXML
    private TextField deuxiemeNombre;

    @FXML
    private Button addition;
    
    @FXML
    private Button soustraction;
    
    @FXML
    private Label reponse;
    
    @FXML
    private Button btnValider;
    
    public ObservableList<String> list = FXCollections.observableArrayList("Rouge", "Bleu", "Vert", "Jaune");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//cboChoix.setItems(list);
	}
	
	@FXML
	void ajoute() {
		try {
			int somme = Integer.parseInt(premierNombre.getText()) + 
					Integer.parseInt(deuxiemeNombre.getText());
			reponse.setText("" + somme);
		}catch(Exception e){
			Alerte();
		}
	}
	
	@FXML
	void soustrais() {
		try {
			int somme = Integer.parseInt(premierNombre.getText()) - 
					Integer.parseInt(deuxiemeNombre.getText());
			reponse.setText("" + somme);
		}catch(Exception e){
			Alerte();
		}
	}
	
	void Alerte() {
		Alert a = new Alert(AlertType.ERROR);
		a.setHeaderText("Attention - Erreur");
		a.setTitle("Erreur");
		a.setContentText("Tu dois écrire un nombre");
		a.show();
		reponse.requestFocus();
	}
	

}
