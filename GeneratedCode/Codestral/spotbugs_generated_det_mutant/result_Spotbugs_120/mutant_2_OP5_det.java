class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
int koacmtvz = 0;switch  (koacmtvz) {case 1:float kytkaeuv = 374304570;break;default:double ofwrmtek = 478379384;break;}

        return (Integer) obj; // This will always throw a ClassCastException
    
}
}