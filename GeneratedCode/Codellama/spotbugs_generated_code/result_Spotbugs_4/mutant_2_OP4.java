import java.util.ArrayList;
import java.util.List;

class UnresolvableReferenceBug {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }
}

// Mutant 1: Unreachable if-else statement
class UnresolvableReferenceBugMutant1 {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBugMutant1() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Mutant code begins
    public void showBugMutant1() {
        System.out.println(myList);
        if (false) {
            // This branch is never executed
            System.out.println("This is a unreachable branch");
        } else {
            System.out.println("This is the original branch");
        }
    }
    // Mutant code ends
}

// Mutant 2: Unreachable if-else statement
class UnresolvableReferenceBugMutant2 {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBugMutant2() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Mutant code begins
    public void showBugMutant2() {
        System.out.println(myList);
        boolean isUnreachable = false;
        if (isUnreachable) {
            // This branch is never executed
            System.out.println("This is a unreachable branch");
        } else {
            System.out.println("This is the original branch");
        }
    }
    // Mutant code ends
}

// Mutant 3: Unreachable if-else statement
class UnresolvableReferenceBugMutant3 {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBugMutant3() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Mutant code begins
    public void showBugMutant3() {
        System.out.println(myList);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is never executed
            System.out.println("This is a unreachable branch");
        } else {
            System.out.println("This is the original branch");
        }
    }
    // Mutant code ends

    private boolean getCondition() {
        return false;
    }
}

// Mutant 4: Unreachable if-else statement
class UnresolvableReferenceBugMutant4 {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBugMutant4() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Mutant code begins
    public void showBugMutant4() {
        System.out.println(myList);
        boolean shouldRun = false;
        if (shouldRun) {
            // This branch is never executed
            System.out.println("This is a unreachable branch");
        } else {
            System.out.println("This is the original branch");
        }
    }
    // Mutant code ends
}

// Mutant 5: Unreachable if-else statement
class UnresolvableReferenceBugMutant5 {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBugMutant5() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Mutant code begins
    public void showBugMutant5() {
        System.out.println(myList);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is never executed
            System.out.println("This is a unreachable branch");
        } else {
            System.out.println("This is the original branch");
        }
    }
    // Mutant code ends

    private boolean getCondition() {
        return false;
    }
}