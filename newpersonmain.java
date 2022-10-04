import java.util.Arrays;
public class newpersonmain {
    public static void main(String[] args) {

        String[] parts={"om","whops"};

        newperson obj = new newperson("om","Indian dil se",9, parts);
        newperson obj2=new newperson(obj);
        obj2.setName("ayush");
        obj2.setSeatnumber(10);
     String[] n=obj.getParts();
   
     /*  n[0]="yo";
        System.out.println(Arrays.toString(n));  */

        System.out.println(Arrays.toString(obj.getParts()));
        System.out.println(Arrays.toString(obj2.getParts()));

        obj2.setParts(new String[]{"ayush","whops"});
        System.out.println(Arrays.toString(obj2.getParts()));


        System.out.println("My name is "+obj.getName()+".My nationality is "+obj.getNationality()+" and my seat number is "+obj.getSeatnumber());
        System.out.println("My name is "+obj2.getName()+".My nationality is "+obj2.getNationality()+" and my seat number is "+obj2.getSeatnumber());
  
  

    }
}
