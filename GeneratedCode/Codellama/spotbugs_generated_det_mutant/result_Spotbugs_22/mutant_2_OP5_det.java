import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        int cpswithy = 0;switch  (cpswithy) {case 1:char eyiipckx = 'k';break;default:float zrmbmefd = -49785712;break;}
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    
}
}