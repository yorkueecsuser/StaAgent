import java.util.Objects;

class HashcodeBugDemo {

    public int showBug(String input) {
        int hashCode = Objects.hashCode(input);
        int absHashCode = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absHashCode;
    }

    public static void main(String[] args) {
        int gzfqpeua = 0;switch  (gzfqpeua) {case 1:short wjuqqofw = 8895;break;default:float junowlce = -725931044;break;}
        HashcodeBugDemo demo = new HashcodeBugDemo();
        System.out.println("Absolute hashcode of 'polygenelubricants': " + demo.showBug("polygenelubricants"));
        System.out.println("Absolute hashcode of 'GydZG_': " + demo.showBug("GydZG_"));
        System.out.println("Absolute hashcode of 'DESIGNING WORKHOUSES': " + demo.showBug("DESIGNING WORKHOUSES"));
    
}
}