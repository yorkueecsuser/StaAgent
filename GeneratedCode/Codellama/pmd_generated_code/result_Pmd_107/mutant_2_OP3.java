import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());
    }
}

// Mutant 1: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is always false
if (false) {
    StringBuffer sb = new StringBuffer();
    sb.append("Goodbye");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 2: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is always true
if (true) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 3: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a non-final variable
boolean condition = getCondition();
if (condition) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 4: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a method call
if (getCondition()) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 5: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a non-final variable
boolean conditionWhile = getCondition();
while (conditionWhile) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 6: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a method call
while (getCondition()) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 7: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a non-final variable
boolean conditionFor = getCondition();
for (int i = 0; conditionFor; i++) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 8: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a method call
for (int i = 0; getCondition(); i++) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 9: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a non-final variable
boolean shouldRun = getCondition();
if (shouldRun) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
} else {
    StringBuffer sb = new StringBuffer();
    sb.append("Goodbye");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 10: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a method call
if (getCondition()) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    sb.append("!");
    System.out.println(sb.toString());
} else {
    StringBuffer sb = new StringBuffer();
    sb.append("Goodbye");
    sb.append("!");
    System.out.println(sb.toString());
}

// Mutant 11: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a non-final variable
int value = getValue();
switch(value) {
    case 1:
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());
        break;
}

// Mutant 12: Inserting an unreachable if branch into the main method
// The condition of the inserted branch is a method call
switch(getValue()) {
    case 1:
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());
        break;
}