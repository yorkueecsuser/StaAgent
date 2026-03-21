class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
int ybwgeuok = 0;switch  (ybwgeuok) {case 1:double wmkixzbg = 884898278;break;default:long rcepibiq = 478943263;break;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}