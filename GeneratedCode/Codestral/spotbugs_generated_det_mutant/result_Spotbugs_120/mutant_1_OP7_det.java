class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
boolean bdetblus = false;while (bdetblus && true && false && true && true && false && false && false && false && false && true && false) {short svcjbamc = 4609;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}