import java.util.LinkedList;
import java.util.Queue;

import edu.digipen.gameobject.GameObject;

public class SnakeBlock extends GameObject {

	private SnakeBlock tail, head;

	public SnakeBlock(SnakeBlock p) {
		this();
		head = p;
	}

	public SnakeBlock() {
		super("player", 64, 64, "SnakeBlock.png");
		setRectangleCollider(4.5f, 7);
		setPosition(-1000,0);
	}

	public void go() {
		if (tail != null)
			tail.go();
		if (head != null) {
			setPositionX(head.getPositionX());
			setPositionY(head.getPositionY());
		}
	}

	public void addTail() {
		if (tail == null)
			tail = new SnakeBlock(this);
		else
			tail.addTail();
	}
}
