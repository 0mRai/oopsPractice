import java.util.Arrays;

public class oopsi {

    private String name;
     private String nationality;
     private int seatnumber;
     private String[] passport;

     public oopsi(String name,String nationality,int seatnumber)
     {
        this.name = name;
        this.nationality= nationality;
        this.seatnumber=seatnumber;
        this.passport=new String[2];
     }
     public oopsi(oopsi source)
     {
        this.name=source.name;
        this.nationality=source.nationality;
        this.seatnumber=source.seatnumber;
        this.passport=Arrays.copyOf(source.passport, source.passport.length);
     }
     public String getName()
     {
        return this.name;
     }

     public String getNationality()
     {
        return this.nationality;
     }

     public int getSeatnumber()
     {
        return this.seatnumber;
     }
     public String[] getPassport()
        {
            return Arrays.copyOf(this.passport, this.passport.length);
        }
        public void setPassport()
        {
            this.passport=new String[]{"om","indian"};
        }
        public String toString()
        {
            return "Name: " + this.name + "\n" + 
            "Nationality: " + this.nationality  + "\n" +
            "Seat Number: " + this.seatnumber + "\n" + "Passport: " +
             Arrays.toString(this.passport) + "\n";
        }
     public boolean applyPassport()
     {
        int num=(int)(Math.random()*2);
        if(num==0)
        {
            return false;

        }
        else
        {
            return true;
        }
       
     }
     
}
