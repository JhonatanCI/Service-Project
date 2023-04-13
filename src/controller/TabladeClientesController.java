package controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import Applicacation.Main;
import Model.Cliente;
import Model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TabladeClientesController implements Initializable{
   
	private Empresa empresa;
	
	public TabladeClientesController(Empresa empresa) {
		this.empresa=empresa;
	}
	

	@FXML
    private TableColumn<Cliente, String> Code_Column;

    @FXML
    private Button Return_Button;

    @FXML
    private TableColumn<Cliente, String> Name_Colimn;

    @FXML
    private TableView<Cliente> Client_Table;

    @FXML
    private TableColumn<Cliente, String> Email_Coluimn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
    	Code_Column.setCellValueFactory(new PropertyValueFactory<>("id"));
    	Name_Colimn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    	Email_Coluimn.setCellValueFactory(new PropertyValueFactory<>("email"));
		
		Client_Table.setItems(Empresa.clientes);
		
		Client_Table.setOnMouseClicked(event->{Cliente stClicked = Client_Table.getSelectionModel().getSelectedItem();
			try {
				if(stClicked!=null){
					System.out.println(stClicked.getNombre());
				
                showClientInfo(stClicked);}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
    @FXML
    void Return(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/StartMenu.fxml"));
		loader.setController(new StartMenuController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        close();
    }

    public void showClientInfo(Cliente ob) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ClientUI.fxml"));
		loader.setController(new CrearClienteController(empresa));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        close();
    }

    private void close(){
        Stage stage = (Stage) Return_Button.getScene().getWindow();
        stage.close();
    }
}

