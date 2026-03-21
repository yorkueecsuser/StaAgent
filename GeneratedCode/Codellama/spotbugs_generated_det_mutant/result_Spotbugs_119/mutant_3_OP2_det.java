import java.util.Arrays;

class DoubleBitsToDoubleBug {
public static void main(String [] args){
    int [] intArray = { 1 , 2 , 3 , 4 , 5 };
    double [] doubleArray = new double [ intArray.length ];
    doubleArray = new double [ intArray.length ];
    for(int i = 0; i < intArray.length; i ++){ doubleArray [ i ] = Double.longBitsToDouble(( int)intArray [ i ]); }
    System.out.println(Arrays.toString(doubleArray));
}
}