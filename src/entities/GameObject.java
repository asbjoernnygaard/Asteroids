package entities;

import core.Size;
import core.Vector2D;

import java.awt.*;

public abstract class GameObject {
    public Vector2D pos;
    public Size size;

    public GameObject(){
        pos = new Vector2D(0,0);
        size = new Size(20,20);

    }

    public abstract void update();
    public abstract Image getSprite();

}
