import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        applyConfiguration(configuration);

        if (1 == 0) {
            int mutant = 1;
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