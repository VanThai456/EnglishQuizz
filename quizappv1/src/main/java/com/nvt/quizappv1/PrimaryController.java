package com.nvt.quizappv1;

import com.nvt.utils.MyAlertSingleton;
import com.nvt.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
        
public class PrimaryController implements Initializable {

   @FXML private ComboBox<ThemeTypes> cbThemes;
  
   @Override    
     public void initialize(URL url, ResourceBundle rb){
       this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
   }
           
    public void manageQuestion (ActionEvent e){
        MyAlertSingleton.getInstamce().showMsg("Comming soon...");
    }
    
    public void practice (ActionEvent e){
        MyAlertSingleton.getInstamce().showMsg("Comming soon...");
    }
    
    public void exam (ActionEvent e){
        MyAlertSingleton.getInstamce().showMsg("Comming soon...");
    }
    
    public void changeTheme(ActionEvent e){
       switch(this.cbThemes.getSelectionModel().getSelectedItem()) {
           case DARK:
               this.cbThemes.getScene().getRoot().getStylesheets().clear();
               this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("Dark.css").toExternalForm());
               break;
            case LIGHT:
               this.cbThemes.getScene().getRoot().getStylesheets().clear();
               this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("Light.css").toExternalForm());
               break;
            case DEFAULT:
               this.cbThemes.getScene().getRoot().getStylesheets().clear();
               this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style.css").toExternalForm());
               break;
       }
    }   
}
