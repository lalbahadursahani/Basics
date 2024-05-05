import java.util.*;
public class strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      String firstname=sc.next();
      String secondname=sc.next();
/* 
if (firstname.compareTo(secondname)==0) {
    System.out.println("strings are equal");
    
} else{
    System.out.println("strings are not equal"); */
    String fullname=firstname+secondname;
  System.out.println(fullname.length()); 
  for(int i=0; i<fullname.length(); i++){
    System.out.println(fullname.charAt(i));
    
  } 
}
    }

