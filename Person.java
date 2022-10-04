import java.util.Arrays;

public class Person {
     
        private String name;
        private String nationality;
        private String dateofbirth;
        private String[] passport;
        private int seatnumber;

        public Person(String name, String nationality, String dateofbirth, int seatnumber)
        {
            this.name=name;
            this.nationality=nationality;
            this.dateofbirth=dateofbirth;
            this.seatnumber=seatnumber;
            this.passport=new String[3];
        }
        public Person(Person source)
        {
            this.name=source.name; 
            this.nationality=source.nationality;
            this.dateofbirth=source.dateofbirth;
            this.seatnumber=source.seatnumber;
            this.passport=Arrays.copyOf(source.passport, source.passport.length);
        }
        public String getDateofbirth()
        {
            return this.dateofbirth;
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
        public void setName(String name)
        {
            this.name=name;
        }
        public void setSeatnumber(int seatnumber)
        {
        this.seatnumber=seatnumber;
        }
        public void setNationality(String nationality)
        {
            this.nationality=nationality;
        }
        public void setDateofbirth(String dateofbirth)
        {
            this.dateofbirth=dateofbirth;
        }
        public void setPassport()
        {
            this.passport=new String[]{this.name, this.nationality,this.dateofbirth};
        }
        public String toString()
        {
            return "Name: " + this.name + "\n"
            +  "Nationality: " + this.nationality + "\n"
            +  "Date of Birth: " + this.dateofbirth + "\n"
            +  "Seat Number: " + this.seatnumber + "\n"
            +  "Passport: " + Arrays.toString(this.passport) + "\n";
        }
        public void chooseSeatnumber()
        {
            this.seatnumber=(int)(Math.random()*11+1);
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

  
