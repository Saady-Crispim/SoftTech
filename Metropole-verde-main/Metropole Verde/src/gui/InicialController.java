	package gui;
	
	import java.io.IOException;
	
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.stage.Stage;
	
	public class InicialController {
	
	    @FXML
	    private Button View2;
	    @FXML
	    private Button regras;
	    @FXML
	    private Button apostila;
	    @FXML
	    private Button apostila2;
	    @FXML
	    private Button apostila3;
	    @FXML
	    private Button btnVoltar;
	
	    @FXML
	    public void onRegrasAction(ActionEvent event) {
	        Stage stage = (Stage) regras.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("regras.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    @FXML
	    public void onApostilaAction(ActionEvent event) {
	        Stage stage = (Stage) apostila.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("Apostila.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    public void onApostila2Action(ActionEvent event) {
	        Stage stage = (Stage) apostila2.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("Apostila2.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    @FXML
	    public void onApostila3Action(ActionEvent event) {
	        Stage stage = (Stage) apostila3.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("Apostila3.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	    @FXML
	    public void onVoltarAction(ActionEvent event) {
	        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("GuiInicial.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
