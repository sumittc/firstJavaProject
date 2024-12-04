package packages.exceptionConcept;

import packages.base.BaseInterface;

public class ExceptionAppClass implements BaseInterface {

    public void runThisMethod() {
        try {
            throw new CustomExceptionClass();
        } catch (CustomExceptionClass e) {
            p("Custom exception");
        }
    }
}
