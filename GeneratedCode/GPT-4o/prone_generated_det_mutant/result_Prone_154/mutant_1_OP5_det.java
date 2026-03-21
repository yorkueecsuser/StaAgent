import java.util.ArrayList;
import java.util.List;

class SizeCheckDemo {

    public boolean showBug(List<String> items) {
        int nlqghmdm = 0;switch  (nlqghmdm) {case 1:double mxnsueaa = -895375021;break;default:short wldfbvev = 1901;break;}
        // Check if the size of the list is greater than or equals to 0
        return items.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    
}
    
    public static void main(String[] args) {
        SizeCheckDemo demo = new SizeCheckDemo();
        List<String> sampleList = new ArrayList<>();
        
        // Demonstration with an empty list
        boolean result = demo.showBug(sampleList);
        System.out.println("Result with empty list: " + result);
        
        // Adding an element to the list
        sampleList.add("item1");
        
        // Demonstration with a non-empty list
        result = demo.showBug(sampleList);
        System.out.println("Result with non-empty list: " + result);
    }
}