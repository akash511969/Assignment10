package file_handling;
import java.util.Arrays;
import java.util.Scanner;
public class Dynamic_array {private Object[] myStore;
private int actSize = 0;

public Dynamic_array(){
    myStore = new Object[10];
}
 
public Object get(int index){
    if(index < actSize){
        return myStore[index];
    } else {
        throw new ArrayIndexOutOfBoundsException();
    }
}
 
public void add(Object obj){
    if(myStore.length-actSize <= 5){
        increaseListSize();
    }
    myStore[actSize++] = obj;
}
 
public Object remove(int index){
    if(index < actSize){
        Object obj = myStore[index];
        myStore[index] = null;
        int tmp = index;
        while(tmp < actSize){
            myStore[tmp] = myStore[tmp+1];
            myStore[tmp+1] = null;
            tmp++;
        }
        actSize--;
        return obj;
    } else {
        throw new ArrayIndexOutOfBoundsException();
    }
     
}
 
public int size(){
    return actSize;
}
 
private void increaseListSize(){
    myStore = Arrays.copyOf(myStore, myStore.length*2);
    System.out.println("\nNew length: "+myStore.length);
}
 
@SuppressWarnings("deprecation")
public static void main(String a[]){
	Dynamic_array f = new Dynamic_array();
    f.add(new Integer(2));
    f.add(new Integer(5));
    f.add(new Integer(1));
    f.add(new Integer(23));
    f.add(new Integer(14));
    for(int i=0;i<f.size();i++){
        System.out.print(f.get(i)+" ");
    }
    f.add(new Integer(29));
    System.out.println("Element at Index 5:"+f.get(5));
    System.out.println("List size: "+f.size());
    System.out.println("Removing element at index 2: "+f.remove(2));
    for(int i=0;i<f.size();i++){
        System.out.print(f.get(i)+" ");
    }
}
}
