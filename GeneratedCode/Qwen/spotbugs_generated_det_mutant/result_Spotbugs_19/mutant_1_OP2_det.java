import java.util.Objects;

class HashcodeBugDemo {
public int showBug(String input){
    int hashCode = Objects.hashCode(input);
    int absHashCode = Math.abs(hashCode);
    absHashCode = Math.abs(hashCode);
    return absHashCode;
}

    public static void main(String[] args) {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        System.out.println("Absolute hashcode of 'polygenelubricants': " + demo.showBug("polygenelubricants"));
        System.out.println("Absolute hashcode of 'GydZG_': " + demo.showBug("GydZG_"));
        System.out.println("Absolute hashcode of 'DESIGNING WORKHOUSES': " + demo.showBug("DESIGNING WORKHOUSES"));
    }
}