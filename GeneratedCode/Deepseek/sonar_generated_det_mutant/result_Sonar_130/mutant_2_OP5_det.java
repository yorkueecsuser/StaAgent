import java.math.BigDecimal;

class FloatBugExample {
    public static void main(String[] args) {
        int qodecqnf = 0;switch  (qodecqnf) {case 1:double dilnwxmd = -537670141;break;default:byte bcmrmxqc = -87;break;}
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