import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	// images used
  PImage imgBeach;
  PImage imgDino;
  PImage imgNuke;

  float fltBeachX = 0;
  float fltBeachY = 0;

  float fltDinoX = 0;
  float fltDinoY = 300;

  float fltNukeX = 0;
  float fltNukeY = 0;

  float fltDinoSpeedX = 3;

  float fltNukeSpeedX = 4;
  float fltNukeWaveX;
	
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
    
    background(255);
    
    imgBeach = loadImage("beach.jpg"); 
    imgDino = loadImage("dinosaur.png");
    imgNuke = loadImage("nuke.png");
    
    imgDino.resize(imgDino.width / 7, imgDino.height / 7);
    imgNuke.resize(imgNuke.width / 8, imgNuke.height / 8);
  }

  public void draw() {

    image(imgBeach, fltBeachX, fltBeachY);
    image(imgDino, fltDinoX, fltDinoY);
    
    fltDinoX += fltDinoSpeedX;

    if (fltDinoX < 0 || fltDinoX > width - 120) {
    fltDinoSpeedX *= -1;
  }
        
    image(imgNuke, fltNukeX, fltNukeY);

    fltNukeX += fltNukeSpeedX;
    if (fltNukeX < 0 || fltNukeX > width - 60) {
    fltNukeSpeedX *= -1;
    }

    fltNukeY = ((float) 0.006 * ((float) Math.pow(fltNukeX - width / (float) 2, (float) 2))) + (float) 10;
    fltNukeWaveX = width - (float) fltNukeX;
    
  }
  
  // define other methods down here.
}