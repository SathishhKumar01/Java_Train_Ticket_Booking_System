public class Ticket {
       String name;
       int age;
       String berthPerf;
       int id;
       Ticket()
       {
        
       }
       Ticket(String name,int age,String berthPerf,int id)
       {
            this.name=name;
            this.age=age;
            this.berthPerf=berthPerf;
            this.id=id;
       }
       String getName()
       {
        return name;
       }
       String getberthPerf()
       {
        return berthPerf;
       }
       int getAge()
       {
        return age;
       }
       int getId()
       {
        return id;
       }
       void setId(int id)
       {
         this.id=id;
       }
       void setberthPerf(String berthPerf)
       {
          this.berthPerf=berthPerf;
       }
       void setAge(int age)
       {
          this.age=age;
       }
       void setName(String name)
       {
          this.name=name;
       }

}
