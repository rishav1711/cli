public class cli_argument
{
public static void main(String[] args)
{
    int n=0;
    int sum=0;
if(args.length>0)
{
for(String val:args)
{
     n = Integer.parseInt(val);
    sum = sum+n;
    System.out.println(n);
    }
}
    else
    {
           System.out.println("no");
 
    }
    System.out.println(sum+" ");
}
}
