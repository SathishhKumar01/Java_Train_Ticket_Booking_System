import java.util.HashMap;
import java.util.Map;

public class Berth {
    static HashMap<Integer,String> berth=new HashMap<>();
    static
    {
        berth.put(1,"LB");
        berth.put(2,"MB");
        berth.put(3,"UB");
        berth.put(4,"LB");
        berth.put(5,"MB");
        berth.put(6,"UB");
        berth.put(7,"SLB");
        berth.put(8,"SUB");
        berth.put(9,"SLB");
        berth.put(10,"SUB");
    }
    static boolean bookingTicket(String be)
    {
        boolean check=false;
          for(Map.Entry<Integer,String> entry:berth.entrySet())
          {
            if(entry.getValue().equals(be))
            {
                   berth.replace(entry.getKey(),be+"0"); 
                   
                   check=true;
                   break;
            }
          }
        return check;
    }
    static void cancelTicket(String cancelberth)
    {
        for(Map.Entry<Integer,String> entry:berth.entrySet())
        {
          if(entry.getValue().equals(cancelberth+"0"))
          {
                 berth.put(entry.getKey(),cancelberth); 
                 break;
          }
        } 
    }
    static void display()
    {
        for(Map.Entry<Integer,String> ro:berth.entrySet())
        {
            if(!ro.getValue().endsWith("0"))
            {
                System.out.println(ro.getKey()+" "+ro.getValue());
            }
        }
    }
    
}
