package telas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaPedidos extends Application {

	private static Stage stage;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override 
	public void start(Stage stage) throws Exception {
	        Parent rood = FXMLLoader.load(getClass().getResource("/view/TelaPedidos.fxml"));
	        Scene scene = new Scene(rood);
	        stage.setTitle("Administrar Pedidos");
	        stage.setScene(scene);
	        stage.show();
	        setStage(stage);
	    }

	    public static Stage getStage() {
	        return stage;
	    }

	    public static void setStage(Stage stage) {
	        TelaPedidos.stage = stage;
	    }
}
