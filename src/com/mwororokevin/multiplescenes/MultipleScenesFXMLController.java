package com.mwororokevin.multiplescenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * @author Kevin Kamau Mwororo
 * @author website mwororokevin.com
 * @author email mwororokevin@gmail.com
 */

public class MultipleScenesFXMLController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;

    @FXML
    void loadFirstScene(ActionEvent event) throws IOException {
        AnchorPane firstScene = FXMLLoader.load(getClass().getResource("/com/mwororokevin/firstscene/FirstSceneFXML.fxml"));
        
        anchorPane.getChildren().setAll(firstScene);
    }
    
    @FXML
    void loadSecondScene(ActionEvent event) throws IOException {
        AnchorPane secondScene = FXMLLoader.load(getClass().getResource("/com/mwororokevin/secondscene/SecondSceneFXML.fxml"));
        
        anchorPane.getChildren().setAll(secondScene);
    }

    @FXML
    void loadThirdScene(ActionEvent event) throws IOException {
        AnchorPane thirdScene = FXMLLoader.load(getClass().getResource("/com/mwororokevin/thirdscene/ThirdSceneFXML.fxml"));
        
        anchorPane.getChildren().setAll(thirdScene);
    }

    @FXML
    void loadFourthScene(ActionEvent event) throws IOException {
        AnchorPane fourthScene = FXMLLoader.load(getClass().getResource("/com/mwororokevin/fourthscene/FourthSceneFXML.fxml"));
        
        anchorPane.getChildren().setAll(fourthScene);
    }
    
    @FXML
    void loadFifthScene(ActionEvent event) throws IOException {
        AnchorPane fifthScene = FXMLLoader.load(getClass().getResource("/com/mwororokevin/fifthScene/FifthSceneFXML.fxml"));
        
        anchorPane.getChildren().setAll(fifthScene);
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
