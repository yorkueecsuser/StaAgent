// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        if (true && true && false && false && false && false && false && true && true && true && false) {float vyaijkkq = 441881057;}
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    
}
}