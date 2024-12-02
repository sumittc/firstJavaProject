package packages;

public class InterfaceMain implements InterfaceClass{
    public void method1(){
        System.out.println("method1 called");
        InterfaceClass.staticMethod();
    }
}
