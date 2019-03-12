/*
** Created by Cindy Kim on 7/19/2017
** Snake: a game where a snake grows by eating food and dies by running into the wall or itself.
 */

import edu.digipen.Game;
import edu.digipen.level.EmptyLevel;

import java.awt.*;
//Initializing the game window.
//Letting it run while it's being played.
public class Main {
    public static void main(String[] args) {
        Game.initialize(800, 600, 60, new ArenaLevel());
        
        while (!Game.getQuit()){
            Game.update();
        }
        Game.destroy();
    }

}


