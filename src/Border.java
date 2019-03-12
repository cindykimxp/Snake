import edu.digipen.gameobject.GameObject;

/**
 * Created by Digipen on 7/19/2017.
 */
public class Border extends GameObject {
    public Border(String name, int width, int height, String texturename){
        super("border", 750, 550, "Border.png");
        setRectangleCollider(10000, 10000);
    }

    @Override public void update (float dt){

    }

    @Override public void collisionReaction (GameObject other){

    }
}
