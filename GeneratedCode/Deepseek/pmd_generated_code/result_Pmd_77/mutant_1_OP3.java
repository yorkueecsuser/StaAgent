class Car {
    public static void main(String[] args) {
    // do something
    boolean condition = getCondition();
    if (condition) {
        /* code */
    }
    boolean conditionWhile = getCondition(); 
    while (conditionWhile) {
        /* code */
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        /* code */
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
        /* code */
    } else {
        /* alternative code */
    }
    int value = getValue();
    switch(value) {
        case 1: /* code */ break;
    }
    }
    public static boolean getCondition(){
        return false;
    }
    public static int getValue(){
        return 0;
    }
}