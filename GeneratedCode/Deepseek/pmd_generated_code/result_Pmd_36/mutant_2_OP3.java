class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}

class Mutant1 {
    // Mutant code: Unreachable if statement
    public void showBug() {
        boolean condition = false;
        if (condition) {
            System.exit(0); // Mutated line
        }
    }

    public static void main(String[] args) {
        Mutant1 m = new Mutant1();
        m.showBug();
    }
}

class Mutant2 {
    // Mutant code: Unreachable while loop
    public void showBug() {
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.exit(0); // Mutated line
        }
    }

    public static void main(String[] args) {
        Mutant2 m = new Mutant2();
        m.showBug();
    }
}

class Mutant3 {
    // Mutant code: Unreachable for loop
    public void showBug() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.exit(0); // Mutated line
        }
    }

    public static void main(String[] args) {
        Mutant3 m = new Mutant3();
        m.showBug();
    }
}

class Mutant4 {
    // Mutant code: Unreachable if-else statement
    public void showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            System.exit(0); // Mutated line
        } else {
            // Unreachable branch
        }
    }

    public static void main(String[] args) {
        Mutant4 m = new Mutant4();
        m.showBug();
    }
}

class Mutant5 {
    // Mutant code: Unreachable switch statement
    public void showBug() {
        int value = 0;
        switch(value) {
            case 1:
                System.exit(0); // Mutated line
                break;
        }
    }

    public static void main(String[] args) {
        Mutant5 m = new Mutant5();
        m.showBug();
    }
}