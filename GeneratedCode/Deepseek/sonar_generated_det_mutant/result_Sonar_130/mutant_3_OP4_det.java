import java.math.BigDecimal;

class FloatBugExample {
    public static void main(String[] args) {
        if (false && false && false && false && true && false && true && true && false && true && false) {float aqxqjgqd = 995028464;}else{boolean cbrglduu = false;}
        FloatBugExample example = new FloatBugExample();
        example.showBug();
    
}

    public void showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println("c: " + c);

        double d = a + b; // BUG: Math should not be performed on floats
        System.out.println("d: " + d);
    }
}