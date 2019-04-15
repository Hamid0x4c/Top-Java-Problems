package ir.h76.javaproblems.algorithms;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Simple image downloader class, using java.net library for downloading an image from Internet
 * and saving it on hard drive
 */
public class ImageDownloader {
  public void downloadAndSave() {
    try {
      String fileName = "digital_image_processing.jpg";
      String website = "http://tutorialspoint.com/java_dip/images/" + fileName;

      System.out.println("Downloading File From: " + website);

      URL url = new URL(website);
      InputStream inputStream = url.openStream();

      // Full path of saving location for image (Current directory)
      String imgDir = System.getProperty("user.dir") + "\\res\\" + fileName;
      OutputStream outputStream = new FileOutputStream(imgDir);
      byte[] buffer = new byte[2048];

      int length = 0;

      while ((length = inputStream.read(buffer)) != -1) {
        System.out.println("Buffer Read of length: " + length);
        outputStream.write(buffer, 0, length);
      }

      inputStream.close();
      outputStream.close();

    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}
