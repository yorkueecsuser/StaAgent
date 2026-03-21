import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        int wwmdyhti = 0;switch  (wwmdyhti) {case 1:boolean pxpmptmw = true;break;default:int milpwdyc = -102476702;break;}
        if (list.size() >= 0) {  // BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    
}
}