class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
boolean vteuwyxs = false;while (vteuwyxs && true && false && false && true && false && true && true && false && true && true && false) {byte swiaeiyj = 80;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}