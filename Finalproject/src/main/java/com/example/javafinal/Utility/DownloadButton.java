package com.example.javafinal.Utility;

import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class DownloadButton extends Button {
    private FileChooser fileChooser = new FileChooser();

    public DownloadButton(String btnName){
        super(btnName);
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PNG Files", "*.png"),
                new FileChooser.ExtensionFilter("JPEG Files", "*.jpeg"),
                new FileChooser.ExtensionFilter("JPG Files", "*.jpg")
        );
    }

    public void convert(List<File> selectedFiles, Stage primaryStage){
        for(File file : selectedFiles){
            File fileCopy = fileChooser.showSaveDialog(primaryStage);
            try {
                Files.copy(file.toPath(),fileCopy.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public FileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(FileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }
}
