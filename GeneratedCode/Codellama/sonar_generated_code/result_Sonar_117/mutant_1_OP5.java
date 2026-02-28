import java.util.ArrayList;

class MyList {
    private ArrayList<String> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(String element) {
        list.add(element);
    }

    public String toString() {
        if (list.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            StringBuilder sb = new StringBuilder();
            for (String element : list) {
                sb.append(element).append(", ");
            }
            return sb.toString();
        }
    }

    public Object clone() {
        if (list.isEmpty()) {
            return null; // BUG: "clone()" method should not return null
        } else {
            MyList clone = new MyList();
            for (String element : list) {
                clone.add(element);
            }
            return clone;
        }
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList.toString());
        System.out.println(myList.clone());
    }
}

// Unreachable switch statement mutant

class UnreachableSwitchStatementMutant {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList.toString());
        System.out.println(myList.clone());
    }

    public static void unreachableSwitchStatement() {
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("This statement is unreachable.");
                break;
            default:
                System.out.println("This statement is reachable.");
                break;
        }
    }

    private static boolean getCondition() {
        // This method is only used to demonstrate the mutant behavior.
        // In a real-world scenario, the condition should be determined dynamically at runtime.
        return false;
    }
}