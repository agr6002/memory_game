package mvc.sprite;

import mvc.Config;

public class TestCard extends Card implements Config.SPRITE.BACK_CARD {

  static {
    Sprite.shareImage("BackCard", Config.SPRITE.BACK_CARD.IMAGE_URL, 0, Config.SPRITE.BACK_CARD.WIDTH);
  }

  public TestCard(int row, int col) {
    super("BackCard", row, col);
  }
}
