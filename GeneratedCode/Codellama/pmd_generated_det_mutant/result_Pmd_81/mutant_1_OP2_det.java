class UnnecessaryConversionTemporary {
public static void main(String [] args){
    int x = 10;
    x = 10;
    String y = String.valueOf(x);
    System.out.println(y);
}
}