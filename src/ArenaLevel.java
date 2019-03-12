import edu.digipen.Game;
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.*;
import edu.digipen.level.EmptyLevel;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.PFRandom;
import edu.digipen.math.Vec2;

import java.awt.*;

/**
 * Created by Cindy Kim on 7/19/2017. Starting level for the game.
 */
public class ArenaLevel extends GameLevel {
	public float timer = 0;
	public float speed = 60;
	

	@Override
	public void create() {
		edu.digipen.graphics.Graphics.setDrawCollisionData(true);

	}

	// Creating the player, border, and food. Putting them into the game as an
	// object.
	@Override
	public void initialize() {
		Player player = new Player(this);
		ObjectManager.addGameObject(player);
		GameObject border = new GameObject("border", 750, 550, "Border.png");
		ObjectManager.addGameObject(border);

		Food food = new Food(64, this);
		ObjectManager.addGameObject(food);

	}

	@Override
	public void update(float dt) {
	}

	@Override
	public void uninitialize() {

	}

}
