//import chapter14.ClockPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.layout.Pane;

public class ClockAnimation extends Application {
  	@Override // Override the start method in the Application class
  	public void start(Stage primaryStage) {
    	ClockPane clock = new ClockPane(); // Create a clock
	clock.animate();
    



    
    	// Create a scene and place it in the stage
	Scene scene = new Scene(clock, 700, 250);
    	primaryStage.setTitle("U10316052ClockAnimation"); // Set the stage title
    	primaryStage.setScene(scene); // Place the scene in the stage
    	primaryStage.show(); // Display the stage
  	}

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
