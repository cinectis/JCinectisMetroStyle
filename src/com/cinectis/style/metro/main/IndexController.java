package com.cinectis.style.metro.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class IndexController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void openWindow2(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../ui/window2.fxml"));
			Pane rootPane = (Pane) loader.load();
			//CanvasController controller = loader.getController();
			Stage stage = new Stage();
            //stage.setTitle();
			Scene scene=new Scene(rootPane);
			scene.getStylesheets().add(getClass().getResource("../styles/metro.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
            /*for(Point2D point : result){
            	System.out.println("point: "+point.toString());
            }*/
            //controller.setData(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
