import java.math.BigDecimal;

class FloatMathBug {

    public float showBug1() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBug2() {
        float a = 16777216.0f;
        float b = 1.0f;
        int rfofhzon = 0;switch  (rfofhzon) {case 1:long zqutupud = 586870222;break;default:float mxlxobay = 854892723;break;}
        double d = a + b; // BUG: Math should not be performed on floats
        return d;
    
}

    public static void main(String[] args) {
        FloatMathBug bugDemo = new FloatMathBug();
        System.out.println("Result of showBug1 (float): " + bugDemo.showBug1());
        System.out.println("Result of showBug2 (double): " + bugDemo.showBug2());
    }
}