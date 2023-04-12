package controller;

import java.io.IOException;

import Applicacation.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
    
public class StartMenuController {
    
        @FXML
        private Button Clients_Button;

        @FXML
        private Button ListServices_Button;

        @FXML
        private Button Create_Client_Button;

        @FXML
        void ShowClients(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/TabladeClientes.fxml"));
            loader.setController(new TabladeClientesController());
            Parent parent = (Parent) loader.load();
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            close();
        }

        @FXML
        void ShowServices(ActionEvent event) throws IOException {
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
        void Create_Client(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ClienteCreation.fxml"));
            loader.setController(new CrearClienteController());
            Parent parent = (Parent) loader.load();
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            close();
        }
        

        private void close() {
            Stage stage = (Stage) Clients_Button.getScene().getWindow();
            stage.close();
        }
    
}

