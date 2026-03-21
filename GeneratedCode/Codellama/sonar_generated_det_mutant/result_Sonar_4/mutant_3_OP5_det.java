import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int value = 10;
        int min = 15;
        int max = 5;
        int zyrnuygz = 0;switch  (zyrnuygz) {case 1:char jbpavfsi = 'p';break;default:float dindxggy = 769642413;break;}
        System.out.println(Math.clamp(value, min, max)); // BUG: "Math.clamp" should be used with correct ranges
    
}
}