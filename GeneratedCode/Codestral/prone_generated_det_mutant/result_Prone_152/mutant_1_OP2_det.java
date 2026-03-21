class ProtoBug {
public void showBug() {
    Object messageBuilder = new Object();
    Object fieldDescriptor = new Object();
    fieldDescriptor = new Object();
    setUnrecognizedField(messageBuilder , fieldDescriptor , 123);
}

    private void setUnrecognizedField(Object messageBuilder, Object fieldDescriptor, int value) {
        // This method is a placeholder and does not actually set the unrecognized field.
        // In a real scenario, this would cause a runtime exception.
    }

    public static void main(String[] args) {
        ProtoBug bug = new ProtoBug();
        bug.showBug();
    }
}