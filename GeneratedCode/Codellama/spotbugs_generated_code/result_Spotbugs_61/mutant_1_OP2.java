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

// DUPLICATION MUTANT 1
class Example {
    public static void main(String[] args) {
        List<String> list = null;
        List<String> list2 = list;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

// DUPLICATION MUTANT 2
class Example {
    public static void main(String[] args) {
        List<String> list = null;
        List<String> list2 = list;
        showBug(list2);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}