package Methods;

//Integerpackage Methods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TestCollection {
	public static void main(String[] args) {
	/*	ArrayList list = new ArrayList();
		//ArrayList list2 = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		//list2.add(4);
		//list2.add("xyz");
		//System.out.println(list.get(1));
		//System.out.println(list2);
	/*	for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)=="b")
			System.out.println(i);
		}
	/*	for(int j=0; j<10; j++)
		{
			list2.add(j);
		}
		System.out.println(list2);*/
	/*	Set<String> s1=new HashSet<String>();
		Set s2=new HashSet();
		s1.add("b");
		s1.add("b");
		s2.add("45");
		System.out.println(s1);
		System.out.println(s2); */
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 10);
		hm.put("b", 11);
		hm.put("c", 12);
		hm.put("d", 12);
		hm.get("a");
		System.out.println(hm);
		//System.out.println(hm.get(1));
	}

}
