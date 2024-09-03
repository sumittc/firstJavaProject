import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import packages.FunctionalInterface;

class SharedResource {
  public synchronized void write() {
    System.out.println("Writing data...");
  }

  public synchronized void read() {
    System.out.println("Reading data...");
  }
}

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello Word");
  }

}
