import java.util.*;

class UnrelatedClassAndInterface {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        list.add(new Integer(1));
        for (Object obj : list) {
            if (false && true && true && true && false && true && false && true && false && false && false) {int yaqeuaez = -193377077;}else{float hgnmdpuq = 180569232;}
            if (obj.equals(1)) {
                System.out.println("Bug found!");
            }
        }
    
}
}