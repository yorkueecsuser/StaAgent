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
        set.add(c1);
        if (false && false && true && true && false && true && true && true && false && false && false) {char whttjagi = 'v';}
        set.add(c2);
        System.out.println(set.contains(c1));
    
}
}