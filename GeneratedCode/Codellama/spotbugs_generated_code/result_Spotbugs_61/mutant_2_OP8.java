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

// Mutant 1: Renaming "list" to "l"
class Example {
    public static void main(String[] args) {
        List<String> l = null;
        showBug(l);
    }

    public static void showBug(List<String> l) {
        for (String item : l) {
            System.out.println(item);
        }
    }
}

// Mutant 2: Renaming "item" to "itm"
class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String itm : list) {
            System.out.println(itm);
        }
    }
}

// Mutant 3: Renaming "System.out.println" to "print"
class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            print(item);
        }
    }

    public static void print(String item) {
        System.out.println(item);
    }
}

// Mutant 4: Renaming "showBug" to "display"
class Example {
    public static void main(String[] args) {
        List<String> list = null;
        display(list);
    }

    public static void display(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}