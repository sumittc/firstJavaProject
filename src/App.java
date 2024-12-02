import java.util.*;

import packages.AbstractMain;
import packages.BaseClass;
import packages.InterfaceMain;
import packages.Person;

public class App extends BaseClass {

  public static String sortStr(String str) {
    char[] strArr = str.toCharArray();
    Arrays.sort(strArr);
    return new String(strArr);
  }

  //     ./runApp.sh    ./runApp.bat

  public static void main(String[] args) {

    p("shcbsjchb");
     AbstractMain temp = new AbstractMain();
     temp.getName();

  }
}