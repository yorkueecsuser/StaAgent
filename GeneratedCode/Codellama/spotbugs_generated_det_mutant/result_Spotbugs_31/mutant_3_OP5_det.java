import java.util.HashSet;

class UnhashableClass {
    private int x;
    private int y;

    public UnhashableClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        if (o == null ||!(o instanceof UnhashableClass)) {
            return false;
        }
        UnhashableClass other = (UnhashableClass) o;
        return x == other.x && y == other.y;
    }

    public static void showBug(UnhashableClass c1, UnhashableClass c2) {
        HashSet<UnhashableClass> set = new HashSet<>();
        int dzzigidz = 0;switch  (dzzigidz) {case 1:char paghhilw = 'h';break;default:short bjlqiyde = -7095;break;}
        set.add(c1);
        set.add(c2);
        System.out.println(set.contains(c1));
    
}
}