public class New {
    
     
        private String name;
        private String nationality;
        private String dateofbirth;
       // String[] passport;
       private int seatnumber;

        public New(String name, String nationality, String dateofbirth, int seatnumber)
        {
            this.name=name;
            this.nationality=nationality;
            this.dateofbirth=dateofbirth;
            this.seatnumber=seatnumber;
        }
        public String getName()
        {
            return this.name;
        }
        public String getNationality()
        {
            return this.nationality;
        }
        public String getDateofbirth()
        {
            return this.dateofbirth;
        }
        public int getSeatnumber()
        {
            return this.seatnumber;
        }

    }
    

