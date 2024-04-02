
class Revers
{
    public static void main(String args[])
    {
        int a[]={1,4,6,3,7,8};
        int i;
        System.out.println("Array of Element is");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("\n Reverse Element in Array");
        for(i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+" ");
        }
    }
}



