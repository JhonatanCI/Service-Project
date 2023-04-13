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
    private TextField Phone_Client_Text;
    
    @FXML
    private TextField Id_Client_Text;

    @FXML
    private DatePicker Date_Client;

    @FXML
    private TextField Email_Client_Text;

    @FXML
    private TextField  Address_Text;
    
    @FXML
    private Button   Return_Button;

    public String name;
    public String id;
    public LocalDate date;
    public String email;
    public String phone;
    public String adress;

    



    public ClienteController() {
    }

    @FXML
    void delete_Client(ActionEvent event) {
    	id=Id_Client_Text.getText();
		Empresa.eliminarCliente(id);
    }

    @FXML
    void Update_Info(ActionEvent event) {
    	 String phone=Phone_Client_Text.getText();
         String id= Id_Client_Text.getText();
         LocalDate date= Date_Client.getValue();
         String email=Email_Client_Text.getText();
         
         
         Empresa.consultarCliente(id).setEmail(email);
         Empresa.consultarCliente(id).setFecha_Registro(date);
         Empresa.consultarCliente(id).setTel_Contacto(phone);         
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
            
      Phone_Client_Text.setText(phone);
      Id_Client_Text.setText(id);
      Date_Client.setValue(date);
      Email_Client_Text.setText(email);
      
    }
    
    private void close(){
        Stage stage = (Stage) Return_Button.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void back() throws IOException {
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
