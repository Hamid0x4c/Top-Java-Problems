package ir.h76.javaproblems;


import ir.h76.javaproblems.algorithms.ImageDownloader;

public class App {

  // for testing and using any Classes and methods, just Try making new objects of them in here
  public static void main(String[] args) {
    ImageDownloader id = new ImageDownloader();
    id.downloadAndSave();
  }
}
