import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        
        applyConfiguration(configuration);

        // Start of mutated code
        if (false) {
            // Unreachable if-else branch
            System.out.println("This code will never be executed");
        } else {
            // This code will be executed
            System.out.println("This code will always be executed");
        }
        // End of mutated code
    }

    public static void applyConfiguration(Configuration configuration) {
        configuration.apply(); 

        // Start of mutated code
        if (false) {
            // Unreachable if-else branch
            System.out.println("This code will never be executed");
        } else {
            // This code will be executed
            System.out.println("This code will always be executed");
        }
        // End of mutated code
    }

    public static class Configuration {
        private boolean comparingPrivateFields = false;

        public void setComparingPrivateFields(boolean comparingPrivateFields) {
            this.comparingPrivateFields = comparingPrivateFields;
        }

        public void apply() {
            System.out.println("Configuration applied: " + this.toString());
        }

        @Override
        public String toString() {
            return "Configuration{" +
                    "comparingPrivateFields=" + comparingPrivateFields +
                    '}';
        }
    }
}