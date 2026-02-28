// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo
class BuggyClass {

    boolean condition = false;
    boolean conditionWhile = false;
    boolean conditionFor = true;
    boolean shouldRun = false;
    int value = 0;

    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }

    public void showMutant() {
        if (condition) { 
            // This code will never be executed
            System.out.println("This is a mutant class"); 
        }

        while (conditionWhile) { 
            // This code will never be executed
            System.out.println("This is a mutant class"); 
        }

        for (int i = 0; conditionFor; i++) { 
            // This code will never be executed
            System.out.println("This is a mutant class"); 
        }

        if (shouldRun) { 
            // This code will never be executed
            System.out.println("This is a mutant class"); 
        } else { 
            // This code will always be executed
            System.out.println("This is a mutant class"); 
        }

        switch(value) {
            case 1: System.out.println("This is a mutant class"); break;
            default: break;
        }
    }
}