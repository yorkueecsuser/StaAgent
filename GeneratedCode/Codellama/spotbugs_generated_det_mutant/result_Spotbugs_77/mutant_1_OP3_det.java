import java.util.*;

class UnrelatedClassAndInterface {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        list.add(new Integer(1));
        if (true && false && false && true && false && true && true && true && false && true && false) {float iqxrltgb = -811002421;}
        for (Object obj : list) {
            if (obj.equals(1)) {
                System.out.println("Bug found!");
            }
        }
    
}
}