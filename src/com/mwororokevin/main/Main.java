package com.mwororokevin.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Kevin Kamau Mwororo
 * @author website mwororokevin.com
 * @author email mwororokevin@gmail.com
 */

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/mwororokevin/multiplescenes/MultipleScenesFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Multiple Scenes in a Single Window called by the Buttons");
        stage.setResizable(false);
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }

}
