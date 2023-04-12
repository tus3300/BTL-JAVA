package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// TODO Auto-generated method stub
		Stage stage =new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,Color.WHITESMOKE);
		Image jennie = new Image("jennie.jpg");
		stage.getIcons().add(jennie);
		stage.setTitle("MY STORE");
		stage.setWidth(420);
		stage.setHeight(420);
		//stage.setResizable(false);
		//stage.setX(50);
		//stage.setY(50);
		/*stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		 */
		Text text1 = new Text();
		text1.setText(" My Store");
		text1.setX(50);
		text1.setY(150);
		//text1.setStrikethrough(true);
		text1.setFont(Font.font("Verdana",FontWeight.BOLD, FontPosture.REGULAR,50));
		text1.setFill(Color.BROWN);
		text1.setUnderline(true);
		
		/*Line line = new Line();
		line.setStartX(60);
		line.setStartY(150);
		line.setEndX(300);
		line.setEndY(150);
		
		root.getChildren().add(line);*/
		
		root.getChildren().add(text1);
		stage.setScene(scene);
		stage.show();
	}
}

