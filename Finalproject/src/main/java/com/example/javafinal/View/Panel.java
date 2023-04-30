package com.example.javafinal.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Panel {
    private Stage primaryStage;
    private String title;
    private GridPane root;

    public Panel(Stage primaryStage, String title){
        this.primaryStage=primaryStage;
        this.title = title;
        this.primaryStage.setTitle(this.title);
        this.root = new GridPane();
        this.root.setAlignment(Pos.CENTER);
        this.root.setHgap(10);
        this.root.setVgap(10);
        this.root.setPadding(new Insets(25, 25, 25, 25));
        this.root.setStyle("-fx-background-color: #FFFFFF;");
        Scene scene = new Scene(root, 1200, 800);
        this.primaryStage.setScene(scene);
    }


    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GridPane getRoot() {
        return root;
    }

    public void setRoot(GridPane root) {
        this.root = root;
    }
}
