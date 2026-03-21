class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
for  (int kfbpumkk = 0; kfbpumkk < 0; kfbpumkk++) {long hofoizxt = 416044523;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}