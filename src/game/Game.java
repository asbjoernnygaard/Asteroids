package game;

import controller.PlayerController;
import display.Display;
import input.Keyboard;
import entities.GameObject;
import entities.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public Display display;
    private List<GameObject> gameObjects;
    private Keyboard input;

    public Game(int width, int height){
        input = new Keyboard();
        display = new Display(width,height, input);
        gameObjects = new ArrayList<>();
        gameObjects.add(new Player(new PlayerController(input)));
    }

    public void update(){
        gameObjects.forEach(GameObject -> GameObject.update());
    }

    public void render(){
        display.render(this);

    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
