import java.util.*;

class UnrelatedClassAndInterface {
    public static void main(String[] args) {
        if (true && false && false && true && false && false && false && true && false && true && false) {char ifdwzncn = 'n';}
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        list.add(new Integer(1));
        for (Object obj : list) {
            if (obj.equals(1)) {
                System.out.println("Bug found!");
            }
        }
    
}
}