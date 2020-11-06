package app.controller;

import static utilities.Console.*;

import app.App;

public class Controller {

  private App app;

  public Controller(App app) {
    log(PURPLE, "Constructing controller");
    this.app = app;
  }

  public void fin() {
    log(PURPLE, "Finalizing controller");
  }

  public void init() {
    log(PURPLE, "Initializing controller");
  }

  public void run() {
    log(PURPLE, "Running controller");
  }

}
