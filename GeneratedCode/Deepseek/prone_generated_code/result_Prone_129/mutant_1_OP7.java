// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// Mutant Code
class MutantCode {
    boolean condition = getCondition(); 
    boolean conditionWhile = getCondition(); 
    boolean conditionFor = getCondition(); 
    boolean shouldRun = getCondition();
    int value = getValue();

    public void showMutant() {
        while (conditionWhile && condition) {
            System.out.println("This is a mutant class");
        }

        for (int i = 0; conditionFor; i++) {
            System.out.println("This is a mutant class");
        }

        if (shouldRun && condition) {
            System.out.println("This is a mutant class");
        } else {
            System.out.println("This is a mutant class");
        }

        switch (value) {
            case 1: System.out.println("This is a mutant class"); break;
            default: System.out.println("This is a mutant class");
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}