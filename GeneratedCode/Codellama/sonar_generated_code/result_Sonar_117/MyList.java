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

// Mutation operator: Unreachable while loop
// Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
// Core requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutated code:

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

        // Unreachable while loop
        while (false) {
            System.out.println("This loop is unreachable");
        }
    }
}