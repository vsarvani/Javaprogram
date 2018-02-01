package package4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class Collection {
	public static void main(String[] args){
		int i;
		
		List l=new ArrayList();   //Arraylist object
		l.add("sar");
		l.add("vani");
		l.add(new Book());
		
		
		List<String> l1=new ArrayList<String>();   //generic arraylist
		l1.add("frd");
		l1.add("gft");
		
		Set s=new HashSet();     //hashset object
		s.add("sar");
		s.add("vani");
		s.add("sar");
		s.add(new Book());
		
		Map m=new HashMap();    //hashmap
		m.put("sar","vani");
		m.put("sar","cvb");
		m.put(new Book(),"lkj");
		
		for(i=0;i<l.size();i++){    //retrieving list objects
		Object o = l.get(i);	
		if(o instanceof String){
			String s1=(String) o;
			System.out.println(s1);
		}
		else if(o instanceof Book){
			Book b=(Book) o;
			System.out.println(b);
			System.out.println();
		}
		}
		for(i=0;i<l1.size();i++){    //retriving objects from generic arraylist
		String s1 = l1.get(i);
		System.out.println(s1);
		
		}
		
	Iterator it = s.iterator();     //retrieving objects from hashset
	while(it.hasNext()){
		Object o=it.next();
		if(o instanceof String){
			String s1=(String) o;
			System.out.println(s1);
		}
		else if(o instanceof Book){
			Book b=(Book) o;
			System.out.println(b);
		}
	}
		
	         Set k = m.keySet();         //retrievng objects from hashmap
	         Iterator it1 = k.iterator();
	         while(it1.hasNext()){
	        	Object o1=it1.next();
	        	if(o1 instanceof String){
	        		String s1=(String) o1;
	        		String v =(String) m.get(s1);
	        		System.out.println(s1);
	        		System.out.println(v);
	        	}
	        	else if(o1 instanceof Book){
	        		Book b=(Book) o1;
	        		String v=(String) m.get(b);
	        		System.out.println(b);
	        		System.out.println(v);
	        	}
	        	 
	         }
		
		
	}
}
