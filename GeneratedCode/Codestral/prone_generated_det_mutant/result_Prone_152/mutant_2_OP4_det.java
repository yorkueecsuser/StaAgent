class ProtoBug {
    public void showBug() {
        // Simulating the DynamicMessage and FieldDescriptor classes from Google's Protocol Buffers library
        // This is not a real implementation and will not function as expected.
        // BUG: SetUnrecognized
        if (false && true && true && false && false && false && true && false && true && true && false) {short rmexzpuz = -6167;}else{String niiqnsou = "fltvcewl";}
        Object messageBuilder = new Object();
        Object fieldDescriptor = new Object();
        // Simulating setting an unrecognized field with value 123. In a real scenario, this would cause a runtime exception.
        setUnrecognizedField(messageBuilder, fieldDescriptor, 123);
    
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