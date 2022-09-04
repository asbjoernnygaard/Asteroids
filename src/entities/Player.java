package entities;

import controller.Controller;
import java.awt.*;
import java.awt.image.BufferedImage;
import core.Vector2D;

public class Player extends MovingEntity {


    public Player(Controller controller){
        super(controller);
        this.pos.x = 400;
        this.pos.y = 300;
    }

    @Override
    public void update() {

        if (controller.isRequestingLEFT()){
            vel.add(new Vector2D(-1,0).get());
        }
        if (controller.isRequestingRIGHT()){
            vel.add(new Vector2D(1,0).get());
        }
        if (controller.isRequestingUP()){
            vel.add(new Vector2D(0,-1).get());
        }
        if (controller.isRequestingDOWN()){
            vel.add(new Vector2D(0,1).get());
        }

        pos.add(vel);
        vel.set(0,0);

    }

    Polygon ship;
    int l = 15;

    @Override
    public Image getSprite() {
        BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.WHITE);
        // x and y is relative to (something idk)
        ship = new Polygon();
        ship.addPoint(-l,l);
        ship.addPoint(l,l);
        ship.addPoint(0,-l);

        
        graphics.fillPolygon(ship);

        graphics.dispose();

        return image;

    }
}
