import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int value = 10;
        int min = 15;
        int max = 5;
        int rishbvpb = 0;switch  (rishbvpb) {case 1:int fzmivfge = -54411226;break;default:short ttqeyefk = 6135;break;}
        System.out.println(Math.clamp(value, min, max)); // BUG: "Math.clamp" should be used with correct ranges
    
}
}