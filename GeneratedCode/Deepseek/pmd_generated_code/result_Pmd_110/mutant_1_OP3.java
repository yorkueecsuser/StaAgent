import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    }

    public boolean getCondition() {
        return false;
    }

    public void unreachableIfStatements() {
        if (getCondition()) {
            // Unreachable code
        }
        if (false) {
            // Unreachable code
        }
        if (false == true) {
            // Unreachable code
        }
    }

    public void unreachableWhileLoop() {
        while (getCondition()) {
            // Unreachable code
        }
        while (false) {
            // Unreachable code
        }
        while (false == true) {
            // Unreachable code
        }
    }

    public void unreachableForLoop() {
        for (int i = 0; getCondition(); i++) {
            // Unreachable code
        }
        for (int i = 0; false; i++) {
            // Unreachable code
        }
        for (int i = 0; false == true; i++) {
            // Unreachable code
        }
    }

    public void unreachableIfElseStatements() {
        if (getCondition()) {
            // Reachable code
        } else {
            // Unreachable code
        }
        if (false) {
            // Unreachable code
        } else {
            // Unreachable code
        }
        if (false == true) {
            // Unreachable code
        } else {
            // Unreachable code
        }
    }

    public void unreachableSwitchStatements() {
        int value = 0;
        switch(value) {
            case 1:
                // Unreachable code
                break;
            default:
                // Reachable code
                break;
        }
        switch(0) {
            case 1:
                // Unreachable code
                break;
            default:
                // Unreachable code
                break;
        }
    }
}