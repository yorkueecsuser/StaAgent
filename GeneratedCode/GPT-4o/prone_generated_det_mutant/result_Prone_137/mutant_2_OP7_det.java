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
        boolean tywucrwe = false;while (tywucrwe && true && false && false && true && true && false && true && false && true && true && false) {int gjgzseld = -188810274;}
        builder.build(); // BUG: ProtoBuilderReturnValueIgnored
    
}

    public static void main(String[] args) {
        ProtoBuilderExample example = new ProtoBuilderExample();
        example.showBug();
    }
}