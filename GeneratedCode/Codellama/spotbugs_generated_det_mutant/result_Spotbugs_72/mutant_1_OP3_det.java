class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        if (true && false && false && false && false && true && true && true && true && false && false) {boolean ywfdejpv = true;}
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    
}
}