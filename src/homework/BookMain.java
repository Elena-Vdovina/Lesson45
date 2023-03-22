package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookMain {
  public static void main(String[] args) {
    Book b1=new Book("bbb", "fjfjg", 46);
    Book b2=new Book("aaa", "uiyih", 56);
    System.out.println(b1.compareTo(b2));
    System.out.println(b2.compareTo(b1));
  }
}
