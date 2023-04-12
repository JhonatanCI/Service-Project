package controller;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import Applicacation.Main;
import Model.Cliente;
import Model.Servicio;
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

public class TabladeServiciosController {

    @FXML
    private TableColumn<Servicio, String> Code_Column;

    @FXML
    private TableColumn<Servicio, Date> Date_Install_Colimn;

    @FXML
    private TableColumn<Servicio, Boolean> State_Coluimn;
    @FXML
    private TableView<Servicio> Services_Table;

    @FXML
    private Button Return_Button;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
    	Code_Column.setCellValueFactory(new PropertyValueFactory<>("cost"));
    	Date_Install_Colimn.setCellValueFactory(new PropertyValueFactory<>("type"));
    	State_Coluimn.setCellValueFactory(new PropertyValueFactory<>("desc"));
		
		Services_Table.setItems(Cliente.servicio);
		
		Services_Table.setOnMouseClicked(event->{Object stClicked = Services_Table.getSelectionModel().getSelectedItem();
            
			try {
                showServiceInfo(stClicked);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
    @FXML
    void Return(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ClientUI.fxml"));
		loader.setController(new ClienteController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
        close();
    }

    public void showServiceInfo(Object ob) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ServicioUI.fxml"));
		loader.setController(new ServicioController(ob));
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

