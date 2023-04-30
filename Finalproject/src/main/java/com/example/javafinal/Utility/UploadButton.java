package com.example.javafinal.Utility;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class UploadButton extends Button {

    private FileChooser fileChooser = new FileChooser();

    public UploadButton(String btnName){
        super(btnName);
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Images", "*.png", "*.jpg", "*.jpeg", "*.gif", "*.bmp","*.heic")
        );
    }

    public void executiveImage(List<File> selectedFiles, List<ImageView> imageViews, GridPane root){
        for (File file : selectedFiles) {
            Image image = new Image(file.toURI().toString(), 100, 0, true, true);
            ImageView imageView = new ImageView(image);
            imageViews.add(imageView);
            //图片的大小数据Size
            Label sizeValueLabel = new Label(String.format("%dx%d", (int)image.getWidth(), (int)image.getHeight()));
            root.add(sizeValueLabel, 1, 15);
            try {
                // 读取图像文件Read Image
                BufferedImage imageFile = ImageIO.read(file);
                // 创建Metadata对象Create Metadata Object
                Metadata metadata = ImageMetadataReader.readMetadata(file);
                // 提取图像属性Image Property
                int width = imageFile.getWidth();
                int height = imageFile.getHeight();
                String camera = "";
                String location = "";
                for (Directory directory : metadata.getDirectories()) {
                    for (Tag tag : directory.getTags()) {
                        if (tag.getTagName().equals("Model")) {
                            camera = tag.getDescription();
                        } else if (tag.getTagName().equals("GPS Latitude")) {
                            location = tag.getDescription();
                        }
                    }
                }
                // 显示图像属性Show Image Property
                Label widthLabel = new Label("Width: " + width);
                Label heightLabel = new Label("Height: " + height);
                Label cameraLabel = new Label("Camera: " + camera);
                Label locationLabel = new Label("Location: " + location);
                root.add(widthLabel, 1, 17);
                root.add(heightLabel, 1, 18);
                root.add(cameraLabel, 1, 19);
                root.add(locationLabel, 1, 20);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ImageProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        for (ImageView imageView : imageViews) {
            root.add(imageView, 1, 14);
        }
    }

    public FileChooser getFileChooser() {
        return fileChooser;
    }
    public void setFileChooser(FileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }
}
