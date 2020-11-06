package app.model;

import static utilities.Console.*;

import app.App;

public class Model {

  private App app;

  public Model(App app) {
    log(BLUE, "Constructing model");
    this.app = app;
  }

  public void fin() {
    log(BLUE, "Finalizing model");
  }

  public void init() {
    log(BLUE, "Initializing model");
  }

  public void run() {
    log(BLUE, "Running model");
  }

}
