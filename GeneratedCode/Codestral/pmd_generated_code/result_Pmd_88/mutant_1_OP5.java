synchronized void buggyMethod() {
    boolean unreachableCondition = false;
    switch (unreachableCondition? 1 : 0) {  // This switch statement is unreachable
        case 1:
            // This code will never be executed
            break;
    }
    if (!sharedData.contains("bar")) {
        sharedData.add("bar");
    }
}