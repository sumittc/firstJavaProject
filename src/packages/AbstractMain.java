package packages;

public class AbstractMain extends AbstractClass{
    
     public String getName(){

        FunctionalInterface fun = (String m)->System.out.println(m);

        Person pp = new Person("Sumit", 26);
        System.out.print(pp.getAge());

        fun.execute("Execute");

        return "Abstract Name";
    };
}
