package com.example.javafinal;
import com.example.javafinal.Utility.DownloadButton;
import com.example.javafinal.View.Panel;
import com.example.javafinal.Utility.UploadButton;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


public class ImageConverterApp extends Application {

    private final List<File> selectedFiles = new ArrayList<>();
    private final List<ImageView> imageViews = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Panel panel = new Panel(primaryStage,"Image Converter");
        //Create Element
        //title
        Text scenetitle = new Text("Image Converter");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
        scenetitle.setFill(Color.gray(0.6,1));
        panel.getRoot().add(scenetitle, 1, 0, 10, 4);
        //element
        UploadButton uploadButton = new UploadButton("Upload Images");
        DownloadButton downloadButton = new DownloadButton("Download");
        Label sizeLabel = new Label("Thumbnail size:");
        //Create ImageView Logo
        ImageView imageViewLogo = new ImageView();
        FileInputStream file1 = new FileInputStream("src/main/java/images/icon.png");
        Image imageLogo = new Image(file1);
        imageViewLogo.setImage(imageLogo);

        //Upload Button
        uploadButton.setOnAction(event -> {
            selectedFiles.add(uploadButton.getFileChooser().showOpenDialog(primaryStage));
            uploadButton.executiveImage(selectedFiles,imageViews,panel.getRoot());
        });

        //Convert Button
        downloadButton.setOnAction(event -> {
            downloadButton.convert(selectedFiles,primaryStage);
        });

        //Add Element
        //line-1 logo
        panel.getRoot().add(imageViewLogo, 0, 4, 7, 8);
        //line-2 upload
        panel.getRoot().add(uploadButton, 0, 13);
        //line-3 size
        panel.getRoot().add(sizeLabel, 0, 15);
        //line-4 format button
        panel.getRoot().add(downloadButton, 2, 16);
        //Application Load
        panel.getPrimaryStage().show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
