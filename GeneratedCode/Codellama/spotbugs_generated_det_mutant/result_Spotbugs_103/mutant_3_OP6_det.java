class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        for  (int mecztcxl = 0; mecztcxl < 0; mecztcxl++) {short qibkcdkk = -6067;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}