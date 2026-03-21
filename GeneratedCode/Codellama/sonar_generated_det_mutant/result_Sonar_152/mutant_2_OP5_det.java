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
        int qyqbvimn = 0;switch  (qyqbvimn) {case 1:byte jastyrpj = -69;break;default:boolean xpkggyxj = true;break;}
        NonSerializableOuter outer = new NonSerializableOuter();
        NonSerializableInner inner = outer.new NonSerializableInner(1, 2);
        System.out.println(inner.x + " " + inner.y);
    
}
}