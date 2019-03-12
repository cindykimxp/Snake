import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.PFRandom;
import edu.digipen.math.Vec2;

import java.awt.*;

/**
 * Created by Cindy Kim on 7/19/2017. Class for Food and how it interacts in the
 * game.
 */
public class Food extends GameObject {
	public float speed = 40;
	public int size;
	public ArenaLevel level;

	public Food(int size, ArenaLevel level) {
		super("food", size, size, "FoodBlock.png");
		this.level = level;
		this.size = size;
		setRectangleCollider(5, 7);
		setPosition(PFRandom.randomRange(-30, 30) * 12, PFRandom.randomRange(-16, 16) * 16);
	}

	@Override
	public void update(float dt) {

	}

	// Killing the food block if it collides with the player before it spawns again.
	@Override
	public void collisionReaction(GameObject other) {


	}
}
