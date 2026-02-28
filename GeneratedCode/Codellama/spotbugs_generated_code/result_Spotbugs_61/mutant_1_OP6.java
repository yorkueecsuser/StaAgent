import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

// Added code for unreachable for loop
boolean conditionFor = false;
for (int i = 0; conditionFor; i++) {
    System.out.println("Unreachable loop statement");
}