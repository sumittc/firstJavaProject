package packages.threadConcepts;

import packages.base.BaseInterface;

public class MainClass implements BaseInterface {

    class CounterClass {
        private int counter = 0;

        public void increaseCounter(String className) {
           // synchronized (this) {
                counter++;
             //   p(className + " " + counter);
            //}
        }

        public int getCounter() {
            return counter;
        }

    }

    public void runThisMethod() {
        CounterClass counterClass = new CounterClass();
        Thread th1 = new Thread(new Runnable(){

            public void run() {
            for (int i = 0; i < 20; i++) {
                counterClass.increaseCounter("th1");
            }
        }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                counterClass.increaseCounter("th2");
            }
        });
        th1.start();
        th2.start();

        try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Final Count: " + counterClass.getCounter());

       
    }
}