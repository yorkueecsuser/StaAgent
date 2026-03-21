class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
boolean ryafrjtz = false;while (ryafrjtz && true && true && true && false && false && true && false && false && true && false && false) {int knitnuhk = 438937180;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}