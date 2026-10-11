package module11javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Martha Guzman
 * CSD-402 Java for Programmers
 * Module 11.2
 *
 * This program demonstrates the JavaFX GridPane and HBox
 * layout containers through a simple expense entry application.
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
    
    GridPane grid = new GridPane();

    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(20));
    
    Label descriptionLabel = new Label("Description:");
    TextField descriptionField = new TextField();

    Label amountLabel = new Label("Amount:");
    TextField amountField = new TextField();

    Label categoryLabel = new Label("Category:");
    TextField categoryField = new TextField();
    
    grid.add(descriptionLabel, 0, 0);
    grid.add(descriptionField, 1, 0);

    grid.add(amountLabel, 0, 1);
    grid.add(amountField, 1, 1);

    grid.add(categoryLabel, 0, 2);
    grid.add(categoryField, 1, 2);
    
    Button saveButton = new Button("Save Expense");
    Button clearButton = new Button("Clear");

    HBox buttonBox = new HBox(10);
    buttonBox.getChildren().addAll(saveButton, clearButton);
    buttonBox.setAlignment(Pos.CENTER);
    
    Label resultLabel = new Label();
    
    saveButton.setOnAction(e -> {
    String description = descriptionField.getText();
    String amount = amountField.getText();
    String category = categoryField.getText();

    resultLabel.setText("Saved: " + description +
            " | $" + amount +
            " | " + category);
});
    
    clearButton.setOnAction(e -> {
    descriptionField.clear();
    amountField.clear();
    categoryField.clear();
    resultLabel.setText("");
});

    VBox root = new VBox(15);
    root.setPadding(new Insets(20));
    root.getChildren().addAll(grid, buttonBox, resultLabel);

    Scene scene = new Scene(root, 450, 300);

    stage.setTitle("Expense Entry Application");
    stage.setScene(scene);
    stage.show();

    }
    
    public static void main(String[] args) {
    launch(args);
}
}