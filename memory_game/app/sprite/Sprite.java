package app.sprite;
//what is all of this?
import utilities.Loader;
import static utilities.Console.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Sprite {

  private BufferedImage originalImage;
  private BufferedImage resizedImage;
  private BufferedImage rotatedImage;
  private int vPosX, vPosY, vDimX, vDimY;
  private double angle;
  private String imageURL;

  public Sprite(String imageURL, double angle, int vPosX, int vPosY, int vDimX) {
    log(CYAN, "Constructing sprite " + imageURL);
    this.imageURL = imageURL;
    this.angle = angle;
    this.vPosX = vPosX;
    this.vPosY = vPosY;
    this.vDimX = vDimX;
  }

  public void init() {
    log(CYAN, "Initializing sprite " + imageURL);
    try {
      originalImage = Loader.loadImage(imageURL);
    } catch (IOException e) {
      e.printStackTrace();
    }
    resizedImage = Loader.resizeImageByWidth(originalImage, vDimX);
    rotatedImage = Loader.rotateImage(resizedImage, angle);
    vDimX = rotatedImage.getWidth();
    vDimY = rotatedImage.getHeight();
  }

  // public void updateModel() {
  // this.angle += 0.01;
  // rotatedImage = Loader.rotateImage(resizedImage, a);
  // vDimX = rotatedImage.getWidth();
  // vDimY = rotatedImage.getHeight();
  // }

  public void updateView(Graphics g) {
    g.drawImage(rotatedImage, vPosX - vDimX / 2, vPosY - vDimY / 2, null);
  }

}