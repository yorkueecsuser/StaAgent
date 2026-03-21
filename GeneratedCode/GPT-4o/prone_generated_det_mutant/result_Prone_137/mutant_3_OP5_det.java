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
        int ihiyqzzq = 0;switch  (ihiyqzzq) {case 1:byte bkaxszeq = -122;break;default:char gwohptsq = 'o';break;}
        builder.build(); // BUG: ProtoBuilderReturnValueIgnored
    
}

    public static void main(String[] args) {
        ProtoBuilderExample example = new ProtoBuilderExample();
        example.showBug();
    }
}