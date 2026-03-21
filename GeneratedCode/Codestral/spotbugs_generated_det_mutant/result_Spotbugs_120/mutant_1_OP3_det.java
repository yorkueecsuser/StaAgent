class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
if (false && true && false && false && true && false && false && false && true && true && false) {int qacoymrw = 970807888;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}