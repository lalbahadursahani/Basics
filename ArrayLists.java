import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<Integer>();
    // add elements
    list.add(54);
    list.add(4);
    list.add(9);
    System.out.println(list);

    // get elements
    int element=list.get(1);
    System.out.println(element);
    // to add element in between.
    list.add(3, 15);
    list.add(4, 6);
    list.add(5,12);
    System.out.println(list);
    // remove elements
    list.remove(5);
    System.out.println(list);
    // size
    int size=list.size();
    System.out.println(size);
    //loops
    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+", ");
    }
    System.out.println();

// sorting elements
Collections.sort(list);
System.out.println(list);
for (int i = 0; i<list.size(); i++) {
    System.out.print(list.get(i)+", ");
    
}
    

        
    }
    
}
