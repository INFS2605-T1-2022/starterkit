/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.infs2605.starterkit;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author malshika
 */
public class PrimaryController {
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
}

