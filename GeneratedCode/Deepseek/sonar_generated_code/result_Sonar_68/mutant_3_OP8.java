import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean newCondition;  // Renamed the variable 'condition' to 'newCondition'.
        if (b == 0) {
            newCondition = doOneMoreThing();
        } else {
            newCondition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;  // Renamed the variable 'bValue' to 'newBValue'.

        boolean newSwitchCondition;  // Renamed the variable'switchCondition' to 'newSwitchCondition'.
        switch (i) {
            case 1:
                newSwitchCondition = doSomething();
                break;
            case 2:
                newSwitchCondition = doSomething();
                break;
            case 3:
                newSwitchCondition = doSomething();
                break;
            default:
                newSwitchCondition = doSomething();
        }

        return true;
    }

    private boolean doOneMoreThing() {
        System.out.println("Doing one more thing");
        return true;
    }

    private boolean doSomething() {
        System.out.println("Doing something");
        return true;
    }
}