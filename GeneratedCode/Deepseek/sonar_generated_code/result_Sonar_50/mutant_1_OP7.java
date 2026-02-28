import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        
        applyConfiguration(configuration);
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
            
            boolean unreachable = false;
            int i = 0;
            while (unreachable == true) {
                // Unreachable code
                i++;
            }
        }

        @Override
        public String toString() {
            return "Configuration{" +
                    "comparingPrivateFields=" + comparingPrivateFields +
                    '}';
        }
    }
}