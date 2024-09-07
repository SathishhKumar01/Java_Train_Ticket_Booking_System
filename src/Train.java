import java.util.*;

public class Train{
    ArrayList<Ticket> ticketdetails=new ArrayList<>();
    public void bookingTicket(Ticket t)
    {
        if(Berth.bookingTicket(t.getberthPerf()))
        {
        System.out.println("Your id : " + t.getId());
        ticketdetails.add(t);
        }
        else{
            System.out.println("Berth not Available");
        }

    }
    public void  cancelTicket(int cancelid)
    {
        for(int i=0;i<ticketdetails.size();i++)
        {
            if(ticketdetails.get(i).getId()==cancelid)
            {
                Berth.cancelTicket(ticketdetails.get(i).getberthPerf());
                ticketdetails.remove(i);
            }
        }
    }
    public void allTicket()
    {
        for(Ticket t:ticketdetails)
        {
            System.out.println(t.getName()+" "+t.getAge()+" "+t.getberthPerf());
        }
    }
}
