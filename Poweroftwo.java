import java.util.*;
public class Poweroftwo
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=0;i<(n/2);i++)
        {
            if((2^i)==n)
            {
            System.out.println(n+"is a power of 2");
            }       
            else if((2^i)>n)
            {
                System.out.println(n+"is not a power of 2");
            }
            
         }
        
    }
}