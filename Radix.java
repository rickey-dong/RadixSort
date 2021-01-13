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
  public static void radixSortSimple(SortableLinkedList data)
  {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < buckets.length; i++)
    {
      buckets[i] = new SortableLinkedList();
    }
    int maxPasses = 0;
    for (int i = 0; i < data.size(); i++)
    {
      if (length(data.get(i)) > maxPasses)
      {
        maxPasses = length(data.get(i));
      }
    }
    for (int j = 0; j < maxPasses; j++)
    {
      buckets[nth(data.get(0), j)].add(data.get(0));
      data.remove(0);
      j--;
      if (data.size() == 0)
      {
        j++;
        merge(data, buckets);
      }
    }
  }
  public static void radixSort(SortableLinkedList data)
  {
    // -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1  2   3   4   5   6   7   8   9
    // 0   1  2  3  4  5  6  7  8 9 10 11  12  13  14  15  16  17  18
    SortableLinkedList[] buckets = new SortableLinkedList[19];
    for (int i = 0; i < buckets.length; i++)
    {
      buckets[i] = new SortableLinkedList();
    }
    int maxPasses = 0;
    for (int i = 0; i < data.size(); i++)
    {
      if (length(data.get(i)) > maxPasses)
      {
        maxPasses = length(data.get(i));
      }
    }
    int key = 0;
    for (int j = 0; j < maxPasses; j--)
    {
      if (data.get(0) < 0)
      {
        key = 9 - nth(data.get(0), j);
      }
      else
      {
        key = 9 + nth(data.get(0), j);
      }
      buckets[key].add(data.get(0));
      data.remove(0);
      j--;
      if (data.size() == 0)
      {
        j++;
        merge(data, buckets);
      }
    }
  }
}