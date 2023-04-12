package controller;

import java.io.IOException;

import Applicacation.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CrearServicioController {

    @FXML
    private TextField Service_Adress_Text;

    @FXML
    private TextField Value_ActMonth_Text;

    @FXML
    private Button Return_Button;

    @FXML
    private Button Create_Button;

    @FXML
    private DatePicker Date_Installation;

    @FXML
    private TextField Service_State_Text;

    @FXML
    private TextField Value_LastMoth_Text;

    @FXML
    private TextField Service_Code_Text;

    @FXML
    private TextField Measurer_Text;

    @FXML
    private DatePicker Date_Fact;

    @FXML
    void Return_Service(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ClientUI.fxml"));
		loader.setController(new ClienteController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        close();
    }

    @FXML
    void Create_Info(ActionEvent event) {
        boolean missingInformation = false;
        TextField[] nulls = {Service_Adress_Text,Value_ActMonth_Text,Service_State_Text,Service_Code_Text};
    		for (int i=0;i<nulls.length;i++) {
				if(nulls[i].getText().equals("")) {
					missingInformation=true;
				}
            }
        if(!missingInformation){

        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
		    alert.setHeaderText(null);
		    alert.setTitle("Advertencia");
		    alert.setContentText("No pueden haber espacios en blanco");
		    alert.showAndWait();
         }    
    }

    private void close(){
        Stage stage = (Stage) Return_Button.getScene().getWindow();
        stage.close();
    }

}
