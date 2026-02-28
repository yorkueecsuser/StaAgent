import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        
        applyConfiguration(configuration);

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
    }

    public static void applyConfiguration(Configuration configuration) {
        configuration.apply(); 
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