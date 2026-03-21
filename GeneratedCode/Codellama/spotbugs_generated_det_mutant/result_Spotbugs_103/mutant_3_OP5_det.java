class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        int kydjrzpb = 0;switch  (kydjrzpb) {case 1:byte ytjyitiw = -19;break;default:int vskzozft = 616356726;break;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}