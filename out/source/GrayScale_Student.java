import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GrayScale_Student extends PApplet {

PImage img;

public void setup()     
{      
  img = loadImage("fwcdlogo.jpg");
  
}

public void draw() 
{
  image(img, 0, 0);
}

public void mouseClicked()
{
    img.loadPixels();
    for(int i=0;i<img.pixels.length; i++)
    {
        int c= img.pixels[i];
        int redvar=PApplet.parseInt(red(c));
        int greenvar=PApplet.parseInt(green(c));
        int bluevar=PApplet.parseInt(blue(c));
        // make three containers to store the red, green, and blue
        //values from the color variable called c
        int avg=average(redvar,greenvar,bluevar);
        //make a fourth container called avg
        //to remember the average, set this container to
        //the result returned when you call your average method. (capture it)
         
        
        
         img.pixels[i] = color(avg);
    }
    img.updatePixels();
}

//write the  average method HERE
public int average(int first, int second, int third)
{
  int returnvar=(first+second+third)/3;
  return returnvar;
}
  public void settings() {  size(800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GrayScale_Student" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
