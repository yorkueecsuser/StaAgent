class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    }
}

// Mutant 1: Duplicate the assignment statement for x
int x = 100;
int y = 32;
int z = x << y; // BUG: BadShiftAmount
System.out.println(z);
int x = 100;

// Mutant 2: Duplicate the assignment statement for y
int x = 100;
int y = 32;
int z = x << y; // BUG: BadShiftAmount
System.out.println(z);
int y = 32;

// Mutant 3: Duplicate the assignment statement for z
int x = 100;
int y = 32;
int z = x << y; // BUG: BadShiftAmount
System.out.println(z);
int z = x << y;