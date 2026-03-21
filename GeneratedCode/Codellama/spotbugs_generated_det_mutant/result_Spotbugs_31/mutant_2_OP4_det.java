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
        set.add(c2);
        if (false && true && true && false && false && true && true && false && true && true && false) {String bdxlsdzn = "wrlekccd";}else{float zzwlnagd = 803586141;}
        System.out.println(set.contains(c1));
    
}
}