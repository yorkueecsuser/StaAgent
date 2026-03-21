class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
for  (int nqxidmut = 0; nqxidmut < 0; nqxidmut++) {short irjldids = 3136;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}