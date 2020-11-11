package mvc.sprite;

import mvc.Config;
import mvc.Config.SPRITE.GAME_BOARD;;

public abstract class Card extends Sprite implements Config.SPRITE.GAME_BOARD {

  private int row, col;

  public Card(String sharedImageKey, int row, int col) {
    super(sharedImageKey, (int) Math.round((col + 0.5) * GAME_BOARD.COL_WIDTH), (int) Math.round((row + 0.5) * GAME_BOARD.ROW_HEIGHT));
    this.row = row;
    this.col = col;
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

}
