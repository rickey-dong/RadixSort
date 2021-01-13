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
  }
}