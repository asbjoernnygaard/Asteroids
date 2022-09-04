package entities;

import controller.Controller;
import core.Vector2D;

public abstract class MovingEntity extends GameObject {

    public Controller controller;
    public Vector2D vel;


    public MovingEntity(Controller controller) {
        super();
        this.controller = controller;
        this.vel = new Vector2D(0,0);
        System.out.println(this.vel);
    }

    @Override
    public void update(){
    }

}
