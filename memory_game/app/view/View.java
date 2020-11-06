package app.view;

import static utilities.Console.*;

import javax.swing.JFrame;

import app.App;

public class View extends JFrame {

  private static final long serialVersionUID = -1047704467982256204L;
  private App app;
  private Board board;

  public View(App app) {
    log(GREEN, "Constructing view");
    this.app = app;
    board = new Board(app); // modified
  }

  public void fin() {
    log(GREEN, "Finalizing view");
  }

  public void init() {
    log(GREEN, "Initializing view");
    board.init();
    add(board);
    setTitle("Memory Match");
    setSize(800, 725);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public void run() {
    log(GREEN, "Running view");
  }

}
