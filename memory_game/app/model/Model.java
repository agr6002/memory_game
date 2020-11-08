package app.model;

import static utilities.Console.*;

import app.App;

public class Model {

  public String[][] cards = {
    { "apple", "apple", "banana", "banana"}, 
    {"blueberry", "blueberry", "cherry", "cherry"},
    {" rasberry", "rasberry", "sheep", "sheep"},
    {"snake", "snake", " fish", " fish"},
  };

  private App app;

  public Model(App app) {
    log(BLUE, "Constructing Model.");
    this.app = app;
  }

  public void fin() {
    log(BLUE, "Finalizing Model.");
  }

  private void shuffleCards() {
    for (int i = 0; i < 1000; ++i) {
      int rowA = (int)(Math.random() * 4);
      int colA = (int)(Math.random() * 4);
      int rowB = (int)(Math.random() * 4);
      int colB = (int)(Math.random() * 4);
      String temp = cards[rowA][colA];
      cards[rowA][colA] = cards[rowB][colB];
      cards[rowB][colB] = temp;
    }
  }

  
  private void drawCards() {
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {
        System.out.print(cards[row][col] + "  ");
      }
      System.out.println();
    }
  }

  public void init() {
    log(BLUE, "Initializing Model.");
    shuffleCards();
    drawCards();
  }

  public void run() {
    log(BLUE, "Initializing Model.");
  }

  // updateImage() {
  //   if (cards[asdfaosdf][adsjkfasd.f] == "rasberry") {
  //     alsdfasd
      
  //   }
  // }

}
