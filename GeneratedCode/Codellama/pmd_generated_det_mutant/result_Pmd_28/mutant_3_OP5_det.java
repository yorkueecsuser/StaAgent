import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        int dobjrgwl = 0;switch  (dobjrgwl) {case 1:boolean odbnqyfk = true;break;default:float gowxnzhh = 441857367;break;}
        // BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}