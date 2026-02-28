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
        // Unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This should never be printed.");
        } else {
            // Original code with the bug
            return animal.equals(plant); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        }
        return false; // In case of an unreachable if-else statement, ensure all paths return a value
    }

    private boolean getUnreachableCondition() {
        // Always returns false to ensure the condition is unreachable at runtime
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