
package smediaplayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

public class FXMLDocumentController implements Initializable {
    
    private MediaPlayer  mediaPlayer;
    
    @FXML
    private MediaView mediaView;
    
    private String filePath;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       FileChooser fileChooser = new FileChooser();
       FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a File(*.mp4)","*.mp4");
       fileChooser.getExtensionFilters().add(filter);
       File file = fileChooser.showOpenDialog(null);
       filePath  = file.toURI().toString();
       
       if(filePath != null){
       Media media = new Media (filePath);
       mediaPlayer =new MediaPlayer(media);
       
       mediaView.setMediaPlayer(mediaPlayer);
       mediaPlayer.play();
       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    
    
}
