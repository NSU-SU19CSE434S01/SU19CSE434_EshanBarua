package com.javacodegeeks.snippets.desktop;
 
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
 
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
 
public class DetermineFormatOfAnImage {
 
    public static void main(String[] args) throws IOException {
 
        // get image format in a file
        File file = new File("newimage.jpg");
 
        // create an image input stream from the specified file
 
  ImageInputStream iis = ImageIO.createImageInputStream(file);
 
  // get all currently registered readers that recognize the image format
 
  Iterator<ImageReader> iter = ImageIO.getImageReaders(iis);
 
  if (!iter.hasNext()) {
 
throw new RuntimeException("No readers found!");
 
  }
 
  // get the first reader
 
  ImageReader reader = iter.next();
 
  System.out.println("Format: " + reader.getFormatName());
 
  // close stream
 
  iis.close();
 
    }
 
}