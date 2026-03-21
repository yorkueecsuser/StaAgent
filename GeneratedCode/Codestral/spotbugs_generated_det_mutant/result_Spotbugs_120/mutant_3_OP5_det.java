class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
int mmpgjnud = 0;switch  (mmpgjnud) {case 1:boolean hbtozjsp = false;break;default:char sgjeoqfe = 'z';break;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}