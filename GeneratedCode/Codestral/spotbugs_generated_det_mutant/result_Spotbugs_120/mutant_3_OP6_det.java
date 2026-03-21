class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
for  (int qgzserdf = 0; qgzserdf < 0; qgzserdf++) {String jifdryhb = "jvinxijq";}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}