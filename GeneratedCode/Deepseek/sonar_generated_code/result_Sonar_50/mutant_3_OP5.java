import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        
        applyConfiguration(configuration);
    }

    public static void applyConfiguration(Configuration configuration) {
        configuration.apply(); 

        int value = getValue(); 
        switch(value) {
            default:
                System.out.println("Default case in mutated code");
                break;
        }
    }

    public static int getValue() {
        return 0;
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