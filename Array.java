import java.util.*;
public class Array {
    public static void update(int marks[]){
        for(int i=0; i<marks.length;i++)
        marks[i]=marks[i]+1;
    }
    public static void main(String[] args) {
int marks[]={98,78,58};
update(marks);
for (int i  = 0; i <marks.length; i++) {
    System.out.println(marks[i]+"");
    
}
System.out.println();
// taking input/output
/*marks[0]=sc.nextInt();
marks[1]=sc.nextInt();
marks[2]= sc.nextInt();
System.out.println("math:" +marks[0]);
System.out.println("physics:" +marks[1]);
System.out.println("chemistry:"+marks[2]);

int persantage=(marks[0]+marks[1]+marks[2])/3;
System.out.println("persantage="+persantage+"%");*/
//System.out.println("length of array="+marks.length);
        }
        
}
    


