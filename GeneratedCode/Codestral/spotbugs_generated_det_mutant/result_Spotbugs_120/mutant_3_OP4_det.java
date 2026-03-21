class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
if (false && false && true && true && false && false && false && false && true && false && false) {float iqpfdmlf = 45747046;}else{int cvtnsbfr = -847652486;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}