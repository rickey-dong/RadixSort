public class Radix
{
  public static int nth(int n, int col)
  {
    n = Math.abs(n);
    int extractedDigit = (int) (n % Math.pow(10, col+1)) / (int) Math.pow(10, col);
    return extractedDigit;
  }
}