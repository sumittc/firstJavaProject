import java.util.*;

import packages.AbstractMain;
import packages.base.BaseClass;
import packages.threadConcepts.MainClass;
import packages.AappClass;

public class App extends BaseClass {

  public static String sortStr(String str) {
    char[] strArr = str.toCharArray();
    Arrays.sort(strArr);
    return new String(strArr);
  }

  // ./runApp.sh ./runApp.bat

  public static void main(String[] args) {

    AappClass runApp = new AappClass();
    runApp.runThisMethod();

    MainClass mainClass = new MainClass();
    mainClass.runThisMethod();

    AbstractMain temp = new AbstractMain();
    temp.getName();

  }
}