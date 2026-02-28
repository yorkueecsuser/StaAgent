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

    // Unreachable switch statement mutant
    public static void showBug(UnreachableSwitchStatement mutant) {
        for (String item : list) {
            switch (mutant) {
                case 1:
                    System.out.println(item);
                    break;
                case 2:
                    System.out.println(item);
                    break;
                case 3:
                    System.out.println(item);
                    break;
            }
        }
    }
}