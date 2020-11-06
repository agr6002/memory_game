//this is the main class that runs everything

import java.awt.EventQueue;

import app.App;

public class MVC {
  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      new App();
    });
  }
}