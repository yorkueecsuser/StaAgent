import java.util.*;

class UnrelatedClassAndInterface {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        list.add(new Integer(1));
        if (true && true && false && true && true && true && false && false && false && false && false) {long lcibevze = 270477174;}else{boolean ypqyxhmg = true;}
        for (Object obj : list) {
            if (obj.equals(1)) {
                System.out.println("Bug found!");
            }
        }
    
}
}