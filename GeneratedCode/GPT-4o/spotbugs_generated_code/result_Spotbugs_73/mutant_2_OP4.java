class EqualsUnrelatedTypes {

    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Animal animal = (Animal) obj;
            return name != null ? name.equals(animal.name) : animal.name == null;
        }
    }

    public static class Plant {
        private String species;

        public Plant(String species) {
            this.species = species;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Plant plant = (Plant) obj;
            return species != null ? species.equals(plant.species) : plant.species == null;
        }
    }

    public boolean showBug(Animal animal, Plant plant) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable because unreachableCondition is always false
            System.out.println("This is an unreachable block");
        } else {
            // Reachable block
            return animal.equals(plant); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        }
        return false; // This is just to ensure method returns a boolean
    }

    // Method to simulate a condition that is always false for the unreachable if block
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        Plant plant = new Plant("Rose");
        
        EqualsUnrelatedTypes example = new EqualsUnrelatedTypes();
        boolean result = example.showBug(animal, plant);
        System.out.println("Result of equals call: " + result);
    }
}