int primitiveInt = 0;
Integer boxedInt = Integer.valueOf(0);
double d = 1.0;

boolean condition = getCondition();
if (condition == false) { 
    int dIntValue = Double.valueOf(d).intValue();
}

boolean condition2 = getCondition2();
if (condition2 == false) {
    examinePrimitiveInt(boxedInt.intValue());
    examinePrimitiveInt(Integer.valueOf(primitiveInt));

    examineBoxedInteger(Integer.valueOf(primitiveInt));
    examineBoxedInteger(boxedInt.intValue());
}