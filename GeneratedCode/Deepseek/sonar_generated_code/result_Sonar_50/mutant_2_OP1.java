import java.util.Arrays;
import java.util.Random;

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
        }

        @Override
        public String toString() {
            String deadStore = generateRandomString(); // Dead Store Mutation 
            return "Configuration{" +
                    "comparingPrivateFields=" + comparingPrivateFields +
                    '}';
        }

        public String generateRandomString() {
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 8;
            Random random = new Random();
            String generatedString = random.ints(leftLimit, rightLimit + 1)
                   .limit(targetStringLength)
                   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                   .toString();
            return generatedString;
        }
    }
}