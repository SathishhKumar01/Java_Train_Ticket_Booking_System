import java.util.*;
public class Main {
    static Train train=new Train();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
          
          label:
          while(true)
          {
              System.out.println("Enter Your choice from 1 to  4  : ");
              System.out.println("Enter 1 for Booking Ticket");
              System.out.println("Enter 2 for Cancel Ticket");
              System.out.println("Enter 3 for Display Ticket");
              System.out.println("Enter 4 for exit");
              int a=sc.nextInt();
              sc.nextLine();
              switch (a) {
                case 1:
                    train.bookingTicket(ticketBooker());
                    break;
                case 2:
                    train.cancelTicket(ticketCanceller());
                    break;
                case 3:
                    train.allTicket();
                    Berth.display();
                    break;
                case 4:
                    break label;
              }
          }
          
    }


    static Ticket ticketBooker()
    {
          System.out.println("Enter your name :");
          String name=sc.next();
          System.out.println("Enter your age :");
          int age=sc.nextInt();
          System.out.println("Enter your berth (LB,MB,UB,SLB,SUB) :");
          Berth.display();
          String berthPerf=sc.next();
          Random r=new Random();
          int id=r.nextInt(100000);
          return new Ticket(name,age,berthPerf,id);
    }
    
    static int ticketCanceller()
    {
        System.out.println("Enter your id : ");
        int cancelid=sc.nextInt();
        sc.nextLine();
        return cancelid;
    }
}
