import java.lang.Math;

class MathRoundIntLongBug {
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2);
    }
    
    public void unreachableSwitchStatement() {
        boolean falseCondition = false;
        switch (1) {
            case 2:
                // Unreachable code
                System.out.println("Unreachable Switch Code");
                break;
            default:
                break;
        }
    }
}