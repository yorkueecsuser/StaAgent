import java.util.Vector;

class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private Vector<Object> vector = new Vector<>();

    public void lockAThenB() {
        synchronized(lockA) {
            synchronized(lockB) {
                // do something with both resources
            }
        }
    }

    public void lockBThenA() {
        synchronized(lockB) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void lockAThenAddToVector() {
        synchronized(lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void showBug() {
        lockAThenB();
        lockBThenA();
        lockAThenAddToVector();
        lockVectorThenA();
    }
}

// Mutant 1: Unreachable if statement
// Original code:
if (false) {
    // do something
}

// Mutated code:
if (getCondition()) {
    // do something
} else {
    // do something else
}

// Mutant 2: Unreachable while loop
// Original code:
while (false) {
    // do something
}

// Mutated code:
boolean condition = getCondition();
while (condition) {
    // do something
}

// Mutant 3: Unreachable for loop
// Original code:
for (int i = 0; false; i++) {
    // do something
}

// Mutated code:
int value = getValue();
for (int i = 0; i < value; i++) {
    // do something
}

// Mutant 4: Unreachable if-else statement
// Original code:
if (false) {
    // do something
} else {
    // do something else
}

// Mutated code:
boolean shouldRun = getCondition();
if (shouldRun) {
    // do something
} else {
    // do something else
}

// Mutant 5: Unreachable switch statement
// Original code:
switch (0) {
    case 1:
        // do something
        break;
}

// Mutated code:
int value = getValue();
switch(value) {
    case 1:
        // do something
        break;
}