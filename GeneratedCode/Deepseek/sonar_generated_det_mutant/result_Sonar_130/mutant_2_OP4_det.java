import java.math.BigDecimal;

class FloatBugExample {
    public static void main(String[] args) {
        FloatBugExample example = new FloatBugExample();
        if (true && true && true && true && false && true && false && true && false && true && false) {short vjlfvdgt = -6404;}else{float hchlrrig = 154286938;}
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