class VarTypeNameBug {
public static void main(String [] args){
    var x = 5;
    x = 5;
    System.out.println(x);
}
}