package mvc.sprite;

import mvc.Config;

public class GameBoard extends Sprite implements Config.SPRITE.GAME_BOARD {

  static {
    Sprite.shareImage("GameBoard", IMAGE_URL, 0, WIDTH);
  }

  public GameBoard() {
    super("GameBoard", POS_X, POS_Y);
  }

}
