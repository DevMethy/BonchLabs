package com.company;
import java.lang.*;
public class Main {
 ublic class Test {
  public static void main(String[] args) {
    Test t = new Test();
    StringBuffer sb = new StringBuffer("aaa");
    System.out.println("Before = " + sb);
    t.doTest(sb);
    System.out.println("After = " + sb);
  }
  void doTest(StringBuffer theSb){
    theSb.append("-bbb");
  }
}
}
