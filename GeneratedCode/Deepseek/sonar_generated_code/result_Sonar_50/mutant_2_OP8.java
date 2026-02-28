import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setComparingFields(true);
        
        applyConfiguration(configuration);
    }

    public static void applyConfiguration(Configuration configuration) {
        configuration.apply(); 
    }

    public static class Configuration {
        private boolean comparingFields = false;

        public void setComparingFields(boolean comparingFields) {
            this.comparingFields = comparingFields;
        }

        public void apply() {
            System.out.println("Configuration applied: " + this.toString());
        }

        @Override
        public String toString() {
            return "Configuration{" +
                    "comparingFields=" + comparingFields +
                    '}';
        }
    }
}