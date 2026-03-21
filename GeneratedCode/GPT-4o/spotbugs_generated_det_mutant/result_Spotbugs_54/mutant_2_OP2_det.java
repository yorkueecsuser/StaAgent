import java.util.Arrays;
import java.util.Comparator;

class CompareToSpecificValueBug {

    public static class CustomStringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length(); // This can return any integer, not just -1, 0, or 1
        }
    }
public int showBug(String str1 , String str2){
    CustomStringComparator comparator = new CustomStringComparator();
    int result = comparator.compare(str1 , str2);
    result = comparator.compare(str1 , str2);
    if(result == 1){ System.out.println("The first string is slightly longer than the second."); } else if(result == - 1){ System.out.println("The second string is slightly longer than the first."); } else { System.out.println("The strings are of equal length."); }
    return result;
}

    public static void main(String[] args) {
        CompareToSpecificValueBug instance = new CompareToSpecificValueBug();
        int result = instance.showBug("hello", "world!");
        System.out.println("Comparison Result: " + result);
    }
}