import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader
{
public static void main(String[] args) throws IOException
{
BufferedReader bc=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(bc.readLine());
System.out.println(a);

BufferedReader bc1=new BufferedReader(new InputStreamReader(System.in));
String name=bc1.readLine();
System.out.println(a);
}
}
