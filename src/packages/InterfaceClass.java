package packages;

interface  InterfaceClass {
    
    public void method1();

    default void method2(){
        System.out.println("default method2 called");
        interfacePrivateMethod();

    };

    public static void staticMethod(){
        System.out.println("staticMethod called");
    }

    private void interfacePrivateMethod(){
        System.out.println("interfacePrivateMethod called");

    }
}
