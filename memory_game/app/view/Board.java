package app.view;

import static utilities.Console.*;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import app.sprite.Sprite;
import app.App;

public class Board extends JPanel {

  private static final long serialVersionUID = 1L;
  private App app;

  public Board(App app) {
    log(GREEN, "Constructing board");
    this.app = app;
  }

  public void init() {
    log(GREEN, "Initializing board");
    setPreferredSize(new Dimension(800, 600));
  }

  @Override
  public void paintComponent(Graphics g) {
    for (Sprite sprite : app.sprites) {
      sprite.updateView(g);
    }
  }

}
