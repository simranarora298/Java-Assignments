import java.util.Map;
import java.util.TreeMap;

public class Collection1 
{
	public static void main(String[] args) 
	{
        Contact con  = new Contact((long)911111114, "abc", "abc@gmail.com","female");
        Contact con1 = new Contact((long)911111113, "abc1", "abc1@gmail.com","male");
        Contact con2 = new Contact((long)911111112, "abc2", "abc2@gmail.com","female");
        Contact con3 = new Contact((long)911111111, "abc3", "abc3@gmail.com","male");
        
        Map<Long,Contact> treeMap = new TreeMap<>();
        
        treeMap.put(con.phNo, con);
        treeMap.put(con1.phNo, con1);
        treeMap.put(con2.phNo, con2);
        treeMap.put(con3.phNo, con3);
        
        //System.out.println(treeMap);
        
        
         for(Map.Entry<Long,Contact> map :treeMap.entrySet())
         {
                 Contact newCon = map.getValue();
                 System.out.println(map.getKey()+" "+newCon.email+" "+newCon.gender+" "+newCon.name);
         }

      
         for(Map.Entry<Long,Contact> map: treeMap.entrySet())
         {
             System.out.println(map.getKey());
         }

      
         for(Map.Entry<Long,Contact> map:treeMap.entrySet())
         {	
        	 //System.out.println(map.getValue());
             Contact newCon = map.getValue();
             System.out.println(newCon.email+" "+newCon.gender+" "+newCon.name);
         }
    }
}

class Contact
{
    Long phNo;
    String name,email,gender;
    
    public Contact(Long phNo,String name,String email,String gender)
    {
        this.phNo=phNo;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    
    
}