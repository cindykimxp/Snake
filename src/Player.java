import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.PFRandom;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Cindy Kim on 7/19/2017. Class for the player and all its controls.
 */
public class Player extends SnakeBlock {
	public Vec2 direction = new Vec2(1, 0);
	public float speed = 10.0f;
	public float timer = 0;
	public ArenaLevel level;

	public Player(ArenaLevel level) {
		super();
		this.level = level;
		setPosition(0, 0);
	}

	private interface Action {
		void run();
	}

	char dir = 'u';
	int count = 20;

	// Setting all of the controls of the Player for movement.
	@Override
	public void update(float dt) {
		if (Math.abs(getPositionX()) > 370 || Math.abs(getPositionY()) > 270)
			kill();
		if (InputManager.isPressed(KeyEvent.VK_UP))
			dir = 'u';
		else if (InputManager.isPressed(KeyEvent.VK_DOWN))
			dir = 'd';
		else if (InputManager.isPressed(KeyEvent.VK_LEFT))
			dir = 'l';
		else if (InputManager.isPressed(KeyEvent.VK_RIGHT))
			dir = 'r';

		if (count-- > 0)
			return;
		count = 20;
		super.go();
		switch (dir) {
		case 'u':
			setPositionY(getPositionY() + 16);
			break;
		case 'd':
			setPositionY(getPositionY() - 16);
			break;
		case 'l':
			setPositionX(getPositionX() - 12);
			break;
		case 'r':
			setPositionX(getPositionX() + 12);
			break;
		}

	}

	@Override
	public void collisionReaction(GameObject other) {
		if (other.getName().equalsIgnoreCase("food")) {
			Food food = new Food(64, level);
			ObjectManager.addGameObject(food);
			addTail();
			other.kill();
		}
		if (other.getName() == "player") {
			kill();
		}

	}
}
// Fix: snake needs to run even without pressing the key
// Fix: playerblock and foodblock not always exactly in the same width and
// height. Foodblock is not int property.
// Continue: player grows if collide with food.
