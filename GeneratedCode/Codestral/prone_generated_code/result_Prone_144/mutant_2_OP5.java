public MyProto showBug(MyProto copy) {
    boolean condition = false; // This condition is always false

    if (condition) {
        int value = getValue();
        switch(value) {
            case 1:
                /* This case is unreachable */
                break;
        }
    }

    return MyProto.newBuilder()
     .setFoo(copy.getFoo()) // correct value
     .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
     .build();
}

// This method always returns a value that is not 1, making the switch unreachable
private int getValue() {
    return 0;
}