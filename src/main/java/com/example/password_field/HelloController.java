package com.example.password_field;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import jdk.jfr.Event;

public class HelloController {
    int caretPosition = 0;
    @FXML
    private PasswordField key;
    @FXML
    private Button submit;
    @FXML
    private Label texto;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSubmitClick() {
        welcomeText.setText("SU CLAVE NUEVA SERÁ: " + key.getText());
    }

    @FXML
    public void keyTyped() {
        if(key.getText().length()>12) {
            caretPosition = key.getCaretPosition();
            key.setText(key.getText().substring(0, 12));
            key.positionCaret(caretPosition);
        }

    }
}