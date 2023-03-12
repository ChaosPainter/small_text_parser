package com.example.small_text_parser;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class HelloController {

    public int char_count=0;
    public int word_count=0;
    @FXML
    private TextField text_field;

    @FXML
    private Label characters;

    @FXML
    private Label words;
    @FXML
    protected void onHelloButtonClick()
    {
        word_count=0;
        char_count=0;
        String text = text_field.getText();
        String temp_text = text.replace(" ","");
        char_count = temp_text.length();
        Scanner scin = new Scanner(text);
        while (scin.hasNext())
        {
            temp_text = scin.next();
            word_count++;

        }
        characters.setText(String.valueOf(char_count));
        words.setText(String.valueOf(word_count));

    }
}