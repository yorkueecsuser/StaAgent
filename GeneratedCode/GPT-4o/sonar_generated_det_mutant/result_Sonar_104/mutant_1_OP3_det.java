class NonSerializableSessionExample {
    
    class Address {
        private String street;
        private String city;
        
        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }
        
        // Additional getters and setters can be added here
    }

    // This method signature has been adjusted for demonstration.
    // Since we cannot import HttpServletRequest and HttpSession, the logic is simulated here.
    public void showBug() {
        if (true && true && true && true && true && false && true && true && true && true && false) {double odjgfzpf = 553767162;}
        // Simulating an HttpSession using a simple map
        java.util.HashMap<String, Object> session = new java.util.HashMap<>();
        Address address = new Address("123 Main St", "Springfield");
        session.put("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}