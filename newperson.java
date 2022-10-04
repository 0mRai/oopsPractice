import java.util.Arrays;

public class newperson {
     private String name;
     private String nationality;
     private int seatnumber;
     private String[] parts;
   
     public newperson(String name, String nationality, int seatnumber, String[] parts)
     {
        this.name=name;
        this.nationality=nationality;
        this.seatnumber=seatnumber;
        this.parts=Arrays.copyOf(parts, parts.length);
     }
     public newperson(newperson source)
     {
       this.name=source.name;
       this.nationality=source.nationality;
       this.seatnumber=source.seatnumber;
       this.parts=Arrays.copyOf(source.parts,source.parts.length);
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
     public String[] getParts()
     {
      return Arrays.copyOf(this.parts, this.parts.length);
     }

     public void setName(String name)
     {
        this.name=name;
     }
     public void setNationality(String nationality)
     {
        this.nationality=nationality;
     }
     public void setSeatnumber(int seatnumber)
     {
        this.seatnumber=seatnumber;
     }
     public void setParts(String[] parts)
     {
      this.parts=Arrays.copyOf(parts, parts.length);
     }
}
