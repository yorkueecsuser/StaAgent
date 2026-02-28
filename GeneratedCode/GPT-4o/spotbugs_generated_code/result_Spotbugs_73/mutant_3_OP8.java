class EqualsUnrelatedTypes {

    public static class Animal {
        private String m; // Renamed from 'name'

        public Animal(String name) {
            this.m = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Animal animal = (Animal) obj;
            return m != null ? m.equals(animal.m) : animal.m == null;
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
        return animal.equals(plant); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
    }

    public static void main(String[] args) {
        Animal a = new Animal("Lion"); // Renamed from 'animal'
        Plant p = new Plant("Rose"); // Renamed from 'plant'
        
        EqualsUnrelatedTypes example = new EqualsUnrelatedTypes();
        boolean result = example.showBug(a, p);
        System.out.println("Result of equals call: " + result);
    }
}