public class Radix
{
  public static int nth(int n, int col)
  {
    n = Math.abs(n);
    int extractedDigit = (int) (n % Math.pow(10, col+1)) / (int) Math.pow(10, col);
    return extractedDigit;
  }
  public static int length(int n)
  {
    if (n == 0)
    {
      return 1;
    }
    n = Math.abs(n);
    int len = ((int) Math.log10(n)) + 1;
    return len;
  }
  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets)
  {
    for (int i = 0; i < buckets.length; i++)
    {
      original.extend(buckets[i]);
    }
  }
}