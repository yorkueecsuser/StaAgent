import java.util.List;

class FloatingPointPrecisionBug {
public static void main(String [] args){
    float number1 = 16777216.0f;
    number1 = 16777216.0f;
    float number2 = 1.0f;
    float result = number1 + number2;
    System.out.println(result);
}
}