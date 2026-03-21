class UnaryPrefixOperatorsBug {
public static void main(String [] args){
    int i = 1;
    int j = - - - i;
    int k = ~ ~ ~ i;
    int m = + + i;
    boolean b = false;
    boolean c = ! ! ! b;
    c = ! ! ! b;
    System.out.println("j: " + j);
    System.out.println("k: " + k);
    System.out.println("m: " + m);
    System.out.println("c: " + c);
}
}