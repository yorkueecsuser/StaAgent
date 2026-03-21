import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int auhzkfjl = 0;switch  (auhzkfjl) {case 1:float phmvmicr = -150967686;break;default:String kyzegicc = "qdseigog";break;}
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        System.out.println(list);
    
}
}