import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class code1 {

	public static void main(String[] args) {
//		Given a string, find the character that appears the most frequently. 
//		If multiple characters have the same frequency, return any one of them.
		//"abracadabra"
		System.out.println("Enter String to check frequencty");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		char [] arr= s.toCharArray();
		
		Map<Character, Integer> map= new HashMap<>();
		for( int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			else
			{
				int v= map.get(arr[i]);
				map.put(arr[i], v+1);
			}
		}
	  Set<Entry<Character, Integer>> set =map.entrySet(); 
	  int max=0;
	  char maxkey=' ';
	  for (Entry<Character,Integer> entry: set)
	  {
		  if(entry.getValue()>max)
		  {
			  max=entry.getValue();
			  maxkey=entry.getKey();
		  }
		 
	  }
	  System.out.println(maxkey);

	}

}

