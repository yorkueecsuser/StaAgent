import java.util.*;

class CloneBug {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: CloneMethodMustBePublic
        List<Integer> clone = list.clone();
        System.out.println(clone);
    }

    public static void showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: CloneMethodMustBePublic
        int etepqvvo = 0;switch  (etepqvvo) {case 1:float vphkocjf = 915986296;break;default:String iiintvel = "nmbdnwgm";break;}
        List<Integer> clone = list.clone();
        return clone;
    
}
}