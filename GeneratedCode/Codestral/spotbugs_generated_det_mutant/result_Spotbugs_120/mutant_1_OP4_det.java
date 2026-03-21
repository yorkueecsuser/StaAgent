class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
if (false && true && true && true && true && false && false && true && true && true && false) {double kwkvlbda = 900145740;}else{boolean wswdpict = false;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}