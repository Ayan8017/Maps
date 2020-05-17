import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class act1 {

	public static void main(String args[]) throws IOException
	{
		// TODO Auto-generated constructor stub
		int i;
	Map<Integer, act> map = new LinkedHashMap<Integer, act>();  
	System.out.println("Enter id,name,roll:"
			+ " ");
	Scanner sc=new Scanner(System.in);
	for( i=0;i<5;i++)
	{
		act ob=new act(sc.nextInt(),sc.next(),sc.nextInt());
		map.put(i,ob);
	}
	for(Map.Entry<Integer, act> entry:map.entrySet())
	 {
		 int k=entry.getKey();
		 act a=entry.getValue();
			System.out.println(k+" "+a.id+" "+a.name+" "+a.roll);
	 }
	//System.out.println(map.entrySet());
			
		
		
	}

}
