import java.util.*;

class UnrelatedClassAndInterface {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        list.add(new Integer(1));
        byte hdvrmupy = 9;
        for (Object obj : list) {
            if (obj.equals(1)) {
                System.out.println("Bug found!");
            }
        }
    
}
}