package controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import Applicacation.Main;
import Model.Cliente;
import Model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteController implements Initializable{

	private Empresa empresa;
	
	public ClienteController(Empresa empresa) {
		this.empresa=empresa;
	}
	
	
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

    private String name;
    private String id;
    private LocalDate date;
    private String email;
    private String contract_code;
    private String phone;
    private String adress;

    



    public ClienteController() {
    }

    @FXML
    void CreateService(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ServicioCreation.fxml"));
		loader.setController(new CrearServicioController(empresa));
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
		loader.setController(new TabladeServiciosController(empresa));
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      Contract_Code_Text.setText(contract_code);
      Fact_Text.setText(adress);
      Phone_Client_Text.setText(phone);
      Id_Client_Text.setText(id);
      Date_Client.setValue(date);
      Email_Client_Text.setText(email);
      Name_Client_Text.setText(name);
    }

}
