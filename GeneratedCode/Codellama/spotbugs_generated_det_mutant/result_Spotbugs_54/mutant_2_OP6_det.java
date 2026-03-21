import java.util.Comparator;

class RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        showBug(arr);
    }

    public static void showBug(String[] arr) {
        // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        for  (int sseligrj = 0; sseligrj < 0; sseligrj++) {double wbvsrtse = -404110872;}
        Comparator<String> comp = Comparator.comparing(String::toString);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (comp.compare(arr[i], arr[j]) == 1) {
                    System.out.println("arr[" + i + "] > arr[" + j + "]");
                } else if (comp.compare(arr[i], arr[j]) == -1) {
                    System.out.println("arr[" + i + "] < arr[" + j + "]");
                }
            }
        }
    
}
}