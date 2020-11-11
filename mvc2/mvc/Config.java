package mvc;

import javax.swing.JFrame;

public interface Config {

  public interface CONTROLLER {
  }

  public interface MODEL {

    public int COLS = 5;
    public int ROWS = 4;

  }

  public interface SPRITE {

    public interface BACK_CARD {
      public String IMAGE_URL = "mvc/resources/back-card.jpg";
      public int HEIGHT = (int) (0.9 * GAME_BOARD.ROW_HEIGHT);
      public int WIDTH = (int) (0.9 * GAME_BOARD.COL_WIDTH);
    }

    public interface GAME_BOARD {
      public String IMAGE_URL = "mvc/resources/game-board.png";
      public int HEIGHT = VIEW.BOARD.HEIGHT;
      public int WIDTH = VIEW.BOARD.WIDTH;
      public int ROWS = MODEL.ROWS;
      public int COLS = MODEL.COLS;
      public int POS_X = WIDTH / 2;
      public int POS_Y = HEIGHT / 2;
      // public double MARGIN_X = 32.0 * WIDTH / 1024.0;
      // public double MARGIN_Y = 32.0 * HEIGHT / 1024.0;
      public double MARGIN_X = 0;
      public double MARGIN_Y = 0;
      public double ROW_HEIGHT = (HEIGHT - 2.0 * MARGIN_Y) / (ROWS - 1);
      public double COL_WIDTH = (WIDTH - 2.0 * MARGIN_X) / (COLS - 1);
    }

  }

  public interface VIEW {

    public String TITLE = "Memory";
    public int CLOSE_OP = JFrame.EXIT_ON_CLOSE;
    public boolean IS_CENTERED = true;
    public boolean IS_PACKED = true;
    public boolean IS_RESIZABLE = false;
    public boolean IS_VISIBLE = true;
    public int UNPACKED_HEIGHT = 768;
    public int UNPACKED_WIDTH = 1024;

    public interface BOARD {

      public int HEIGHT = 625;
      public int WIDTH = 564;

    }

  }
}
