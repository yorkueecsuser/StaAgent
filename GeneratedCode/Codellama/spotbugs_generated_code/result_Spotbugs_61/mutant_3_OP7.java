import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        boolean conditionFor = getCondition();
        for (String item : list) {
            System.out.println(item);
        }
        while (!conditionFor) {
            // Unreachable while loop
            int i = 1;
            while (false) {
                i++;
            }
        }
    }
}