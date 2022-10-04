import java.util.Arrays;

public class Airline {
    private Person[] seats;

    public Airline()
    {
         this.seats=new Person[11];
    }
    /* 
     public Person getPerson(int index)
    {
        return new Person(this.seats[index]);
    }
    */
    public void setPerson(Person person)  
    {
        this.seats[person.getSeatnumber()-1]=new Person(person);
    }
    public Person getSeats(int index)
    {
        return new Person(this.seats[index]);
    }
    public void createReservation(Person person)
    {
        while(this.seats[person.getSeatnumber()-1]!=null)
        {
            System.out.println("\n"+person.getName()+", seat: "+person.getSeatnumber()+" is already taken. Please choose another one." );
            person.chooseSeatnumber();
        }
      //  int index=person.getSeatnumber()-1;
      //  this.seats[index]=new Person(person);
        this.seats[person.getSeatnumber()-1]=new Person(person);
        System.out.println("thank you "+person.getName()+"for flying with java airlines. Your seatnumber is "+person.getSeatnumber()+"\n");
        /*  for(int i=0;i<this.seats.length;i++)
        {
            while(this.seats[i]!=null)
            { 
            System.out.println("\n"+person.getName()+", seat: "+person.getSeatnumber()+" is already taken. Please choose another one." );
            this.seats[i].chooseSeatnumber();
            i++;
            }

        }
        */
    
    }
    public String toString()
    {
        String temp="";
        for(int i=0;i<this.seats.length;i++)
        {
            temp+="seatnumber "+(i+1)+"\n";
            if(this.seats[i]==null)
            {
                temp+="empty"+"\n";
            }
        else
        {
            temp+=this.seats[i].toString() + " \n";
        }
    }
        return temp;
    }
}
