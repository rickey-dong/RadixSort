import java.util.*;
import java.io.*;
public class RadixTesterRD
{
  public static void main(String[] args)
  {
    System.out.println(Radix.nth(12345, 0) + " should be 5");
    System.out.println(Radix.nth(12345, 1) + " should be 4");
    System.out.println(Radix.nth(12345, 2) + " should be 3");
    System.out.println(Radix.nth(12345, 3) + " should be 2");
    System.out.println(Radix.nth(12345, 4) + " should be 1");
    System.out.println(Radix.nth(-12345, 0) + " should be 5");
    System.out.println(Radix.nth(-12345, 1) + " should be 4");
    System.out.println(Radix.nth(-12345, 2) + " should be 3");
    System.out.println(Radix.nth(-12345, 3) + " should be 2");
    System.out.println(Radix.nth(-12345, 4) + " should be 1");
    
    System.out.println();
    
    System.out.println(Radix.length(0) + " should be 1");
    System.out.println(Radix.length(1) + " should be 1");
    System.out.println(Radix.length(11) + " should be 2");
    System.out.println(Radix.length(111) + " should be 3");
    System.out.println(Radix.length(1111) + " should be 4");
    System.out.println(Radix.length(11111) + " should be 5");
    System.out.println(Radix.length(9) + " should be 1");
    System.out.println(Radix.length(-0) + " should be 1");
    System.out.println(Radix.length(-1) + " should be 1");
    System.out.println(Radix.length(-11) + " should be 2");
    System.out.println(Radix.length(-111) + " should be 3");
    System.out.println(Radix.length(-1111) + " should be 4");
    System.out.println(Radix.length(-11111) + " should be 5");
    System.out.println(Radix.length(-9) + " should be 1");
    
    System.out.println();
    
    /*MyLinkedList orig = new MyLinkedList();
    orig.add("one");
    MyLinkedList orig1 = new MyLinkedList();
    MyLinkedList[] bucks = new MyLinkedList[3];
    MyLinkedList buck0 = new MyLinkedList();
    MyLinkedList buck1 = new MyLinkedList();
    MyLinkedList buck2 = new MyLinkedList();
    bucks[0] = buck0;
    bucks[1] = buck1;
    bucks[2] = buck2;
    buck0.add("two");
    buck0.add("three");
    buck1.add("four");
    buck1.add("five");
    buck2.add("six");
    Radix.merge(orig1, bucks);
    System.out.println(orig1 + " should be [two, three, four, five, six]");*/
    System.out.println(Radix.nth(55,2) + " should be 0");
    System.out.println();
    Random rng = new Random(0);
    SortableLinkedList l = new SortableLinkedList();
    int c;
    for (int i = 0; i < 1000; i++) {
         c = rng.nextInt();
         l.add(c);
    }
    Radix.radixSort(l);
    System.out.println(l);
  }
}