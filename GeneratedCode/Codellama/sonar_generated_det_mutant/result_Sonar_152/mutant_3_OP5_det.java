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
        int zeqmgnju = 0;switch  (zeqmgnju) {case 1:long hltufgyp = -405293884;break;default:long ivmlmgqc = -617629930;break;}
        NonSerializableInner inner = outer.new NonSerializableInner(1, 2);
        System.out.println(inner.x + " " + inner.y);
    
}
}