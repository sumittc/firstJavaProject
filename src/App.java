import packages.BaseClass;

public class App extends BaseClass {

  public static void main(String[] args) {

    class Resource {
      private int count = 0;
      public int countLimit = 20;

      public int getCount() {
        return count;
      }

      public synchronized void increamentCount(String className) {
        p(className + " = " + String.valueOf(++count));
      }
    }

    class EvenCount extends Thread {
      private Resource resource;

      public EvenCount(Resource resource) {
        this.resource = resource;
      }

      public void run() {
        while (resource.getCount() < resource.countLimit) {

          synchronized (resource) {
            while (resource.getCount() % 2 == 0) {
              try {
                resource.wait();
              } catch (Exception e) {
              }
            }
            resource.increamentCount("EvenCount");
            resource.notify();
          }
        }
      }
    }

    class OddCount extends Thread {
      private Resource resource;

      public OddCount(Resource resource) {
        this.resource = resource;
      }

      public void run() {
        while (resource.getCount() < resource.countLimit) {
          synchronized (resource) {
            while (resource.getCount() % 2 == 0) {
              try {
                resource.wait();
              } catch (Exception e) {
              }
            }
            resource.increamentCount("OddCount");
            resource.notify();
          }
        }
      }
    }

    Resource resource = new Resource();
    EvenCount evenCount = new EvenCount(resource);
    OddCount oddCount = new OddCount(resource);

    oddCount.start();
    evenCount.start();
  }
}
