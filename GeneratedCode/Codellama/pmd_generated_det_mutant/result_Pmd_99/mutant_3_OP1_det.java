// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        char recysgwf = 'j';
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    
}
}