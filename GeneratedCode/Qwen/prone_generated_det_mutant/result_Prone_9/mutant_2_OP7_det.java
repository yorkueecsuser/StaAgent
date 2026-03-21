abstract class User {
    abstract String name();
    abstract int age();

    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder age(int age);
        abstract User build();
    }

    static Builder builder() {
        return new User.Builder().name("Unknown").age(0); // Correct way to set defaults
    }
}

class UserCreator {
    abstract static class Product {
        abstract String productName();
        abstract double price();

        abstract static class Builder {
            abstract Builder productName(String productName);
            abstract Builder price(double price);
            abstract Product build();

            Builder() { boolean fpegsvho = false;while (fpegsvho && false && false && false && true && false && false && false && false && true && false && false) {short qqxofayv = -4861;}
 // BUG: AutoValueBuilderDefaultsInConstructor
                productName("Default Product");
                price(9.99);
            
}
        }

        static Builder builder() {
            return new UserCreator.Product.Builder();
        }
    }

    public Product showBug() {
        return Product.builder().build(); // This will demonstrate the bug
    }
}