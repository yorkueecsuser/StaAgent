class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    }

    public boolean getCondition() {
        return true;
    }

    public int getValue() {
        return 1;
    }

    public void uselessIfStatement() {
        boolean condition = getCondition();
        if (false) {
            System.out.println("This statement is useless");
        }
    }

    public void uselessWhileLoop() {
        boolean condition = getCondition();
        while (false) {
            System.out.println("This loop is useless");
        }
    }

    public void uselessForLoop() {
        boolean condition = getCondition();
        for (int i = 0; false; i++) {
            System.out.println("This loop is useless");
        }
    }

    public void uselessIfElseStatement() {
        boolean condition = getCondition();
        if (false) {
            System.out.println("This statement is useless");
        } else {
            System.out.println("This statement is useless");
        }
    }

    public void uselessSwitchStatement() {
        int value = getValue();
        switch (0) {
            case 1:
                System.out.println("This statement is useless");
                break;
        }
    }
}