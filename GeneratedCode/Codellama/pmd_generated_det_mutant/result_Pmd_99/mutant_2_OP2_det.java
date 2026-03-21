// BUG: AddEmptyString

class BuggyCode {
public static void main(String [] args){
    int x = 5;
    String y = "" + x;
    y = "" + x;
    System.out.println(y);
}
}