public class Commonele {
    public static void main(String arrgs[])
    {
        int a[]={1,2,3,4,5};
        int b[]={2,6,7,4,1};
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
