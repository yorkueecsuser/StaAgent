import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if (list.size() >= 0) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    }
}