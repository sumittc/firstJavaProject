package packages.threadConcepts;
import packages.base.BaseInterface;

public class ThreadClass extends Thread implements BaseInterface {

    public void run() {
        p("ThreadClass started");
    }
}
