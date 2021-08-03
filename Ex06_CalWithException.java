package com.company;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 & 9";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class DivideByZero extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxMultiplicationInput extends Exception {
    @Override
    public String toString() {
        return "Cannot multiply over 7000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxInputReached extends Exception {
    @Override
    public String toString() {
        return "Max limit of input is 10000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class CustomCal {
    public int add(int a, int b) throws InvalidInputException, MaxInputReached {
        if (a==8 && b==9) {
            throw new InvalidInputException();
        }
        if (a>10000 && b>10000) {
            throw new MaxInputReached();
        }
        return a+b;
    }
    public int sub(int a, int b) throws MaxInputReached {
        if (a>10000 && b>10000) {
            throw new MaxInputReached();
        }
        return a-b;
    }
    public int mul(int a, int b) throws MaxInputReached, MaxMultiplicationInput {
        if (a>10000 && b>10000) {
            throw new MaxInputReached();
        }
        if (a>7000 || b>7000) {
            throw new MaxMultiplicationInput();
        }
        return a*b;
    }
    public int div(int a, int b) throws MaxInputReached, DivideByZero {
        if (a>10000 && b>10000) {
            throw new MaxInputReached();
        }
        if (b==0) {
            throw new DivideByZero();
        }
        return a/b;
    }
}

public class Ex06_CalWithException {
    public static void main(String[] args) throws InvalidInputException, MaxInputReached, MaxMultiplicationInput, DivideByZero{
        CustomCal c = new CustomCal();
        System.out.println(c.add(7,9));
        System.out.println(c.div(8,4));
        System.out.println(c.mul(45,63));
        System.out.println(c.sub(45,45));

    }
}
