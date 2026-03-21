import java.lang.Integer;

class ReferenceComparisonBug {

    public boolean showBug(Integer a, Integer b) {
int celnhiif = 0;switch  (celnhiif) {case 1:byte zknzfeka = 3;break;default:String xhlflpqr = "jmjrtcdw";break;}

        return a == b; // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    
}

    public static void main(String[] args) {
        ReferenceComparisonBug bugDemo = new ReferenceComparisonBug();
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 200;
        Integer num4 = 200;

        System.out.println("Comparing num1 and num2: " + bugDemo.showBug(num1, num2)); // true due to Integer cache
        System.out.println("Comparing num3 and num4: " + bugDemo.showBug(num3, num4)); // false due to different references
    }
}