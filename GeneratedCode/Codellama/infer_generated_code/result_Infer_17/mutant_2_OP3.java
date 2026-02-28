// BUG: INTEGER_OVERFLOW_L2
class IntegerOverL2 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}

// Mutant 1: Unreachable if statement
class IntegerOverL2Mutant1 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    // Unreachable if statement
    public static void unreachableIf() {
        if (false) {
            System.out.println("This code is unreachable");
        }
    }
}

// Mutant 2: Unreachable while loop
class IntegerOverL2Mutant2 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    // Unreachable while loop
    public static void unreachableWhile() {
        while (false) {
            System.out.println("This code is unreachable");
        }
    }
}

// Mutant 3: Unreachable for loop
class IntegerOverL2Mutant3 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    // Unreachable for loop
    public static void unreachableFor() {
        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }
    }
}

// Mutant 4: Unreachable if-else statement
class IntegerOverL2Mutant4 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    // Unreachable if-else statement
    public static void unreachableIfElse() {
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is also unreachable");
        }
    }
}

// Mutant 5: Unreachable switch statement
class IntegerOverL2Mutant5 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    // Unreachable switch statement
    public static void unreachableSwitch() {
        int x = 1;
        switch (x) {
            case 0:
                System.out.println("This code is unreachable");
                break;
            case 1:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}