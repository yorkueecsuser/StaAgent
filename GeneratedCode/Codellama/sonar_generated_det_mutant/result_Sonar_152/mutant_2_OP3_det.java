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
        NonSerializableOuter outer = new NonSerializableOuter();
        NonSerializableInner inner = outer.new NonSerializableInner(1, 2);
        if (false && true && false && false && false && false && false && false && true && false && false) {boolean qkqzxrau = false;}
        System.out.println(inner.x + " " + inner.y);
    
}
}