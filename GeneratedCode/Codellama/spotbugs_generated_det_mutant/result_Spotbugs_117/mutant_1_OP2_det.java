import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
public static void main(String [] args){
    int x = new Random().nextInt();
    x = new Random().nextInt();
    float f =(float)x;
    int y = Math.round(f);
    System.out.println(y);
}
}