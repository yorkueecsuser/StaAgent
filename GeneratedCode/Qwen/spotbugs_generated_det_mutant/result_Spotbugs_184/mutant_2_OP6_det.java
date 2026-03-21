class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
for  (int preucziz = 0; preucziz < 0; preucziz++) {char nzhgoeak = 'c';}

        return MAX_CONNECTIONS;
    
}

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }
}