package mvc.model;

import mvc.App;
import mvc.Config;
import mvc.sprite.Card;
import mvc.sprite.TestCard;
import mvc.utilities.Phaseable;

public class Model implements Phaseable, Config.MODEL {

  public App app;
  private Card[][] cards = new Card[19][19];
  private boolean isPlayer1Turn;

  public Model(App app) {
    trace(this);
    this.app = app;
  }

  public void init() {
    trace(this);
    isPlayer1Turn = true;
    for (int row = 0; row < ROWS; ++row) {
      for (int col = 0; col < COLS; ++col) {
        cards[row][col] = new TestCard(row, col);
      }
    }
    // test();
  }

  public Card getCard(int row, int col) {
    return cards[row][col];
  }

  public int getNumCols() {
    return Config.MODEL.COLS;
  }

  public int getNumRows() {
    return Config.MODEL.ROWS;
  }

  public boolean flipCard(int row, int col) {
    if (row < 0 || row > ROWS || col < 0 || col > COLS ) {
      return false;
    }
    //board[row][col] = isBlackTurn ? new BlackStone(row, col) : new WhiteStone(row, col);
    //isBlackTurn = !isBlackTurn;
    return true;
  }

  // private void test() {
  // for (int row = 0; row < Config.MODEL.ROWS; ++row) {
  // for (int col = 0; col < Config.MODEL.COLS; ++col) {
  // setIntersection(row, col);
  // }
  // }
  // }

}
