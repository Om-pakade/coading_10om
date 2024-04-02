import javax.swing.plaf.synth.SynthConstants;

public class CountEvenodd {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int i,count=0;

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
                
            }
        }
        System.out.println("The Even number in the array is"+""+count);
        System.out.println("The odd number in the array is"+(arr.length-count));
    }
}
