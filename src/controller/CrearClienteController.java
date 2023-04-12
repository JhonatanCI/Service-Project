package controller;

import java.io.IOException;

import Applicacation.Main;
import Model.Cliente;
import Model.Empresa;
import Model.Estado;
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

public class CrearClienteController {

    @FXML
    private Button Return_Button;

    @FXML
    private Button Create_Button;

    @FXML
    private TextField Phone_Text;

    @FXML
    private TextField Adress_Text;

    @FXML
    private TextField State_Text;

    @FXML
    private DatePicker Date_Fact;

    @FXML
    private TextField CodContract_Text;

    @FXML
    private TextField Email_Text;

    @FXML
    private TextField Client_Code_Text;

    @FXML
    private TextField Name_Text;

    @FXML
    void Return_Service(ActionEvent event) throws IOException {
       back();
    }

    @FXML
    void Create_Info(ActionEvent event) {
        boolean missingInformation = false;
        boolean validStatte = false;
        Estado state=Estado.POTENCIAL;
        String stateWrited = State_Text.getText().toUpperCase();
        TextField[] nulls = {Phone_Text,Adress_Text,CodContract_Text,Email_Text,Client_Code_Text,Name_Text};
        
        for (int i=0;i<nulls.length;i++) {
            if(nulls[i].getText().equals("")) {
                missingInformation=true;
            }
        }
       
        if(!missingInformation){
            switch(stateWrited){
                case "POTENCIAL":
                state = Estado.POTENCIAL;
                validStatte = true;
                break;
                case "PAZ Y SALVO":
                state = Estado.PAZ_Y_SALVO;
                validStatte = true;
                break;
                case "DEUDA":
                state = Estado.DEUDA;
                validStatte = true;
                break;
                case "MOROSO":
                state = Estado.MOROSO;
                validStatte = true;
                break;
                case "RETIRADO":
                state = Estado.RETIRADO;
                validStatte = true;
                break;
                case "CARTERA CASTIGADA":
                state = Estado.CARTERA_CASTIGADA;
                validStatte = true;
                break;
            }
        }
        if(validStatte){

            Cliente newClient = new Cliente(Name_Text.getText(),Client_Code_Text.getText(),Date_Fact.getValue(),CodContract_Text.getText(),Adress_Text.getText(),
            Phone_Text.getText(),Email_Text.getText(),state);

            Empresa.clientes.add(newClient);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
		    alert.setHeaderText(null);
		    alert.setTitle("Cliente creado");
		    alert.setContentText("El cliente se ha creado exitosamente");
		    alert.showAndWait();

            try {
                back();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


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

    private void back() throws IOException{
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/StartMenu.fxml"));
		loader.setController(new StartMenuController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        close();
    }
}
