package packages.base;

public interface BaseInterface {
    default <T> void p(T obj) {
        System.out.println(obj);
    }

}
