import java.util.Arrays;
public class oppsimain {
    public static void main(String[] args) {

        oopsi obj=new oopsi("om","Indian",10);
//printing using toString method
System.out.println(obj);
 if (obj.applyPassport()==true)
 {
    obj.setPassport();
   System.out.println(obj);

 }
 else
 {

    System.out.println("Name: " + obj.getName() + "\n" + 
    "Nationality: " + obj.getNationality()  + "\n" +
    "Seat Number: " + obj.getSeatnumber() + "\n" + "Passport: " +
     Arrays.toString(obj.getPassport()) + "\n");
    

 }
    }
}
