package packages.threadConcepts;


public class DeadlockExample {

    class Resource {
        public void action1() {
            System.out.println("Action1");
        }
    
        public void action2() {
            System.out.println("Action2");
        }
    }
    
    public void DeadlockExample() {
        
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
