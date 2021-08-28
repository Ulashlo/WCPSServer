package gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;


public class ImageWindow extends Application {
    private String filename;
    private String header;

    public ImageWindow(String filename, String header) {
        this.filename = filename;
        this.header = header;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(new FileInputStream(filename));
        double width = image.getWidth();
        double height = image.getHeight();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        if(screenSize.height < height || screenSize.width < width){
            return;
        }

        ImageView imageView = new ImageView(image);

        imageView.setX(10);
        imageView.setY(10);

        imageView.setFitHeight(height);
        imageView.setFitWidth(width);

        imageView.setPreserveRatio(true);

        Group root = new Group(imageView);

        Scene scene = new Scene(root, width + 20, height + 20);

        stage.setTitle(header);

        stage.setScene(scene);

        stage.show();
    }
}
