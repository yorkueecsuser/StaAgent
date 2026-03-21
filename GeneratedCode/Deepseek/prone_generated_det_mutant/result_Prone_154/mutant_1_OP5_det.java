import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        int stnbkbng = 0;switch  (stnbkbng) {case 1:double gkmkyaec = 500184381;break;default:short vrpqtqtb = -8548;break;}
        if (list.size() >= 0) {  // BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    
}
}