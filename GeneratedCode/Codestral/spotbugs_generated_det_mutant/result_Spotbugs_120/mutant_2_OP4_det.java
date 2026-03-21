class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
if (true && false && true && true && false && true && true && false && false && true && false) {char hkenbnll = 'k';}else{short vpepcewe = 7963;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}