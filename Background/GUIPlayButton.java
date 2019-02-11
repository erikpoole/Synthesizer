package Background;

import Backend.AudioClip;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class GUIPlayButton {

	public Button playButton;

	public GUIPlayButton(MyApp guiMain) {
		playButton = new Button();
		playButton.setText("Play");
		playButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				try {
					AudioClip.playSound(GUISpeaker.source.getAudioClip());
				} catch (NullPointerException e) {
					System.out.println("No Audio Source");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

}
