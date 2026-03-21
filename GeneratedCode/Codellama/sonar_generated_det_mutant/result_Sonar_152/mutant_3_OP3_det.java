import java.io.Serializable;

class NonSerializableOuter implements Serializable {
    private static final long serialVersionUID = 1L;

    private class NonSerializableInner {
        private int x;
        private int y;

        public NonSerializableInner(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        if (true && true && true && true && false && true && false && false && false && false && false) {boolean vemukyon = true;}
        NonSerializableOuter outer = new NonSerializableOuter();
        NonSerializableInner inner = outer.new NonSerializableInner(1, 2);
        System.out.println(inner.x + " " + inner.y);
    
}
}