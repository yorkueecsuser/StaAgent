import java.util.ArrayList;

class ImpossibleDowncast {
public static void main(String [] args){
    ArrayList < String > list = new ArrayList < >();
    list.add("Hello");
    list.add("World");
    String [] array =(String [])list.toArray();
    array =(String [])list.toArray();
    System.out.println(array [ 0 ] + " " + array [ 1 ]);
}
}