package controller;

import java.io.IOException;

import Applicacation.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteController {

    @FXML
    private TextField Contract_Code_Text;

    @FXML
    private Button Create_Button;

    @FXML
    private TextField Fact_Text;

    @FXML
    private TextField Phone_Client_Text;

    @FXML
    private TextField Id_Client_Text;

    @FXML
    private Button Update_Bytton;

    @FXML
    private DatePicker Date_Client;

    @FXML
    private TextField Email_Client_Text;

    @FXML
    private Button Consult_Button;

    @FXML
    private TextField Name_Client_Text;

    @FXML
    void CreateService(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ServicioCreation.fxml"));
		loader.setController(new CrearServicioController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    close();
    }

    @FXML
    void Consult_Service(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/TabladeServicios.fxml"));
		loader.setController(new TabladeServiciosController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    close();
    }

    @FXML
    void Update_Info(ActionEvent event) {

    }

    private void close(){
      Stage stage = (Stage) Consult_Button.getScene().getWindow();
      stage.close();
  }

}
