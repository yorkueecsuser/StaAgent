import java.math.BigDecimal;

class FloatBugExample {
    public static void main(String[] args) {
        FloatBugExample example = new FloatBugExample();
        int jawnjljx = 0;switch  (jawnjljx) {case 1:char wxajqutg = 'y';break;default:byte acvbiner = -52;break;}
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