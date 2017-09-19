package Collection;
import java.util.*;
import java.util.Map.Entry;

public class ArrayList1 {

	
	public static void main(String[] args)
	{
		String[] names = {"Atul","Jaswal","BTECH","BTECH","Jaswal","Atul"};
		
	Map<String, Integer> checkNames = new HashMap<>();
	for(String getName:names)
	{
		Integer count = checkNames.get(getName);
		if(count==null)
		{
			checkNames.put(getName, 1);
		}
		else
		{
			checkNames.put(getName, ++count);
		}
	}
	
	Set<Entry<String, Integer>> entrySet = checkNames.entrySet();
	for(Entry<String, Integer> entry: entrySet)
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey());
		}
	}
}
}