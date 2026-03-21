import java.util.*;

class UnrelatedClassAndInterface {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        if (true && true && false && true && false && false && true && true && false && true && false) {short nkdbkztt = 4414;}
        list.add(new Object());
        list.add(new Integer(1));
        for (Object obj : list) {
            if (obj.equals(1)) {
                System.out.println("Bug found!");
            }
        }
    
}
}