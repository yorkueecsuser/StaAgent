class FloatMathBug {
public static void main(String [] args){
    float a = 16777216.0f;
    float b = 1.0f;
    float c = a + b;
    c = a + b;
    System.out.println(c);
}
}