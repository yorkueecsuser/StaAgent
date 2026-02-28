import java.util.logging.Logger;

class MixedDescriptorsExample {

    private static final Logger logger = Logger.getLogger(MixedDescriptorsExample.class.getName());

    // Simulating a Descriptor class for demonstration purposes
    public static class Descriptor {
        public FieldDescriptor findFieldByNumber(int fieldNumber) {
            // Simulated method to find a field by its number
            if (fieldNumber == 1) {
                return new FieldDescriptor("FieldA");
            } else if (fieldNumber == 2) {
                return new FieldDescriptor("FieldB");
            }
            return null;
        }
    }

    // Simulating a FieldDescriptor class for demonstration purposes
    public static class FieldDescriptor {
        private String name;

        public FieldDescriptor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Simulating a Foo class with a Descriptor and field numbers
    public static class Foo {
        public static final int ID_FIELD_NUMBER = 1;
        public static Descriptor getDescriptor() {
            return new Descriptor();
        }
    }

    // Simulating a Bar class with a Descriptor and field numbers
    public static class Bar {
        public static final int ID_FIELD_NUMBER = 2;
        public static Descriptor getDescriptor() {
            return new Descriptor();
        }
    }

    public String showBug() {
        // Intentionally mixing Descriptors and field numbers to demonstrate the bug
        FieldDescriptor field = Foo.getDescriptor().findFieldByNumber(Bar.ID_FIELD_NUMBER); // BUG: MixedDescriptors
        if (field!= null) {
            return field.getName();
        }
        return "Field not found";

        // Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            logger.info("This is a reachable block.");
        } else {
            // This block is unreachable because shouldRun is always false
            logger.info("This is an unreachable block due to the condition.");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        MixedDescriptorsExample example = new MixedDescriptorsExample();
        logger.info(example.showBug());
    }
}