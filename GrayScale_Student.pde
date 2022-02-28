PImage img;

void setup()     
{      
  img = loadImage("fwcdlogo.jpg");
  size(800,800);
}

void draw() 
{
  image(img, 0, 0);
}

void mouseClicked()
{
    img.loadPixels();
    for(int i=0;i<img.pixels.length; i++)
    {
        color c= img.pixels[i];
        int redvar=int(red(c));
        int greenvar=int(green(c));
        int bluevar=int(blue(c));
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
int average(int first, int second, int third)
{
  int returnvar=(first+second+third)/3;
  return returnvar;
}