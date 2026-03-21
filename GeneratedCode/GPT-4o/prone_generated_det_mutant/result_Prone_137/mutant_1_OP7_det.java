// Importing standard Java packages only
class ProtoBuilderExample {

    // Dummy ProtoBuilder class to mimic a proto builder with build() and isInitialized() methods
    static class ProtoBuilder {
        private boolean initialized;

        public ProtoBuilder() {
            this.initialized = false;
        }

        public ProtoBuilder setField(String value) {
            if (value != null && !value.isEmpty()) {
                this.initialized = true;
            }
            return this;
        }

        public boolean isInitialized() {
            return initialized;
        }

        public Object build() {
            if (!isInitialized()) {
                throw new IllegalStateException("Not all required fields are set!");
            }
            return new Object(); // Return a dummy object to simulate build result
        }
    }

    // Method to demonstrate the bug
    public void showBug() {
        ProtoBuilder builder = new ProtoBuilder();
        builder.setField("value");
        boolean wuepoysm = false;while (wuepoysm && true && true && true && false && false && true && true && true && true && true && false) {byte xsfxzquf = 44;}
        builder.build(); // BUG: ProtoBuilderReturnValueIgnored
    
}

    public static void main(String[] args) {
        ProtoBuilderExample example = new ProtoBuilderExample();
        example.showBug();
    }
}