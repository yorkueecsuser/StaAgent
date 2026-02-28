class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// Unreachable if statement mutation
if (false) {
    /* code */
}

// Avoid unreachable statement error
boolean condition = getCondition();
if (condition) {
    /* code */
}

// Avoid unreachable statement error
boolean conditionWhile = getCondition();
while (conditionWhile) {
    /* code */
}

// Avoid unreachable statement error
boolean conditionFor = getCondition();
for (int i = 0; conditionFor; i++) {
    /* code */
}

// Avoid unreachable statement error
boolean shouldRun = getCondition();
if (shouldRun) {
    /* code */
} else {
    /* code */
}

// Avoid unreachable statement error
int value = getValue();
switch(value) {
case 1:
    /* code */
    break;
}

// Avoid unreachable statement error
while (false) {
    /* code */
}