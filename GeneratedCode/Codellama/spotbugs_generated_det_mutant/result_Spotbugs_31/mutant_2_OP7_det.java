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
        boolean ahoglaai = false;while (ahoglaai && true && false && false && false && false && false && false && true && true && false && false) {int nystpjzx = 925595082;}
        HashSet<UnhashableClass> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        System.out.println(set.contains(c1));
    
}
}