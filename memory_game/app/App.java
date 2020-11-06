package app;

import app.controller.Controller;
import app.model.Model;
import app.sprite.Sprite;
import app.view.View;
import static utilities.Console.*;

import java.util.ArrayList;

public class App {

  private Controller controller;
  private Model model;
  private View view;
  public ArrayList<Sprite> sprites = new ArrayList<>();
  //these are the space between each image
  private int cardRowWidth = 125;
  private int cardColHeight = 175;
  private int cardDim = 100;
  private int angle = 0;
  private int numCols = 4;
  //to move it over
  //put score at the empty right side?
  private int leftMargin = 200;
  private int topMargin = 80;
  private String[] images = {"app/images/apple.jpg", "app/images/banana.jpg", "app/images/blueberry.jpg", "app/images/cherry.jpg"};

  public App() {
    log(YELLOW, "Constructing app");
    model = new Model(this);
    view = new View(this);
    controller = new Controller(this);
    
    for (int row = 0; row < images.length; row++) {
      for (int col = 0; col < numCols; col++) {
        //add image randomizer...
        sprites.add(new Sprite(images[row], angle, cardRowWidth * (col) + leftMargin, cardColHeight * (row) + topMargin, cardDim));
      }
    }
    init();
    run();
    fin(); 
  }

  private void fin() {
    log(YELLOW, "Finalizing app");
    model.fin();
    view.fin();
    controller.fin();
  }

  private void init() {
    log(YELLOW, "Initializing app");
    for (Sprite sprite : sprites) {
      sprite.init();
    }
    model.init();
    view.init();
    controller.init();
  }

  private void run() {
    log(YELLOW, "Running app");
    model.run();
    view.run();
    controller.run();
  }

}
