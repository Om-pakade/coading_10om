import java.util.Arrays;

class half
{
  public static void order(int a[])
  {
    Arrays.sort(a);
    for(int i=0;i<a.length/2;i++)
    {
      System.out.println(a[i]+" ");
    }
    for(int j=(a.length-1);j>a.length/2;j--)
    {
      System.out.println(a[j]+"");
    }
  }
  public static void main(String args[])
  {
    int a[]={1,3,4,8,9,52,7,10};
    order(a);
  }
}