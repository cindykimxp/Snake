import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;
import edu.digipen.text.FontTypes;
import edu.digipen.text.TextObject;

import java.awt.event.KeyEvent;

/**
 * Created by Cindy Kim on 7/19/2017.
 * Class for the Main Menu and its properties.
 */
public class MainMenu extends GameLevel{
    public MainMenu(){
        super();
    }

    //Setting the different properties of the Main Menu.
    @Override public void create(){
        TextObject menu = new TextObject("Menu", "PRESS SPACE TO BEGIN", FontTypes.FELIX_TITLING_32);

    }


    @Override public void initialize(){

    }

    //Starting the game if the space bar is pressed.
    @Override public void update (float dt){
        if (InputManager.isTriggered(KeyEvent.VK_SPACE)){
            GameLevelManager.goToLevel(new ArenaLevel());
        }
    }


    @Override public void uninitialize(){

    }

}
//Fix: simply not working.