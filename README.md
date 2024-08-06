# Java Debugging Assignment

## Objective
This assignment was to practice debugging skills using Java. The goal was to write a method that calculates the average of an array of integers and handle various exceptions and logic errors.

## Steps Followed

1. **Write the Method:**
    - Implemented `arrayAvg` to accept an array of integers and return the average as a `double`.

2. **Test the Method:**
    - Tested the method with an array containing the numbers `1, 2, 3, 4, 5` and verified the output is `3.0`.

3. **Introduce and Debug Exceptions:**
    - **Null Pointer Exception:**
        - Introduced at line: `numbers = null;`.
        - Fixed by adding a null check.
    - **Array Index Out of Bounds Exception:**
        - Introduced at line: `int test = numbers[10];`.
        - Fixed by ensuring array access is within bounds.

4. **Introduce and Fix a Logic Error:**
    - **Logic Error:**
        - Introduced at line: `return sum / (numbers.length + 1);`.
        - Fixed by correcting the division to `return sum / numbers.length;`.

## Debugging Notes
- Used breakpoints and stack traces to locate and fix exceptions.
- Stepped through the code to identify and resolve the logic error.

