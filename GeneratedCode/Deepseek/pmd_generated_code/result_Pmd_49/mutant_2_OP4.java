// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public void unreachableCode() {
        if (false) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is unreachable.");
        }

        while (false) {
            System.out.println("This code is unreachable.");
        }

        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable.");
        }

        switch (0) {
            case 1: System.out.println("This code is unreachable.");
            break;
        }
    }
}