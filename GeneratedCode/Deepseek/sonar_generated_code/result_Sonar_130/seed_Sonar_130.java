import java.math.BigDecimal;

class FloatBug {

    public static void main(String[] args) {
        FloatBug bug = new FloatBug();
        bug.showBug();
    }

    public void showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        double d = (double)a + (double)b;
        System.out.println(d);

        BigDecimal e = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        System.out.println(e);
    }
}