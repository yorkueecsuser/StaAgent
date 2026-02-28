class ZeroDenominatorBug {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (unknown()) {
            //..
            denominator = 3;
        } else {
            //..
        }

        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    }

    public static boolean unknown() {
        return true;
    }
}

// Unreachable switch statement mutant
int value = getValue();
switch(value) {
    case 1:
        //..
        break;
    default:
        //..
        break;
}

// Additional code to avoid unreachable statement error
boolean condition1 = getCondition();
if (condition1) {
    //..
} else {
    //..
}

boolean condition2 = getCondition();
while (condition2) {
    //..
}

boolean condition3 = getCondition();
for (int i = 0; condition3; i++) {
    //..
}

boolean condition4 = getCondition();
if (condition4) {
    //..
} else {
    //..
}

int value2 = getValue();
switch(value2) {
    case 1:
        //..
        break;
    default:
        //..
        break;
}