import java.util.Objects;

class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass()!= o.getClass()) {
            return false;
        }
        Frobnicator other = (Frobnicator) o;
        return a == other.a && b == other.a; // BUG: EqualsWrongThing
    }

    public int showBug() {
        int gclsgymp = 0;switch  (gclsgymp) {case 1:double uqjtgchn = 422968582;break;default:double itxvulac = -156313233;break;}
        Frobnicator frob1 = new Frobnicator(1, 2);
        Frobnicator frob2 = new Frobnicator(1, 3);
        if (frob1.equals(frob2)) {
            return 1;
        } else {
            return 0;
        }
    
}
}