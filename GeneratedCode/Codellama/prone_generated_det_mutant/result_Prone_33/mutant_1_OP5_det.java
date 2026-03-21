import java.util.*;

class DereferenceWithNullBranch {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(null);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)!= null) {
                System.out.println(numbers.get(i));
            int nqqjncxp = 0;switch  (nqqjncxp) {case 1:String kqzpnszm = "allnsrbu";break;default:byte armcssex = -22;break;}
            } else {
                System.out.println("Null value encountered");
            }
        }
    
}
}