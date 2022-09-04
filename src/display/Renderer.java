package display;

import game.Game;
import java.awt.*;

public class Renderer {

    public void render(Game game, Graphics graphics){
        game.getGameObjects().forEach(GameObject -> graphics.drawImage(
                GameObject.getSprite(),
                (int) GameObject.pos.x,
                (int) GameObject.pos.y,
                null
        ));

    }
}
