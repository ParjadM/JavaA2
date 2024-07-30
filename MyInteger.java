public class MyInteger {
    private int value;

    //no arg constructor
    public MyInteger() {
        this.value = 0;
    }

    //constructor that takes an int value
    public MyInteger(int newValue) {

        this.value = newValue;
    }

    //getter method
    public int getValue() {
        return this.value;
    }

    //method to check if the value is even
    public boolean isEven() {
        return this.value % 2 == 0;
    }

    //method to check if the value is odd
    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    //static method to check if is even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    //Static method to check if is odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    //Static method to check if the value in a specified MyInteger object is even
    public static boolean isEven(MyInteger myInteger) {
        return (myInteger.isEven());
    }

    //static method to check if the value in a specified MyInteger object is odd
    public static boolean isOdd(MyInteger myInteger) {
        return (myInteger.isOdd());
    }

    //method to check if the value in this object is equal to a specified int value
    public boolean equals(int value) {
        return (this.value == value);
    }

    //method to check if the value in this object is equal to the value in a specified MyInteger object
    public boolean equals(MyInteger myInteger) {
        return (this.value == myInteger.getValue());
    }

    // Main method for testing
    public static void main(String[] args) {
        //creating object
        MyInteger myInt1 = new MyInteger(10);
        MyInteger myInt2 = new MyInteger(15);

        MyInteger myInt3 = new MyInteger(20);
        MyInteger myInt4 = new MyInteger(20);

        MyInteger myInt5 = new MyInteger(50);
        MyInteger myInt6 = new MyInteger(100);

        //display output
        System.out.println("myInt1 is even: " + myInt1.isEven());
        System.out.println("myInt2 is odd: " + myInt2.isOdd());
        System.out.println("15 is odd: " + MyInteger.isOdd(15));
        System.out.println("myInt1 is equal to 10: " + myInt1.equals(10));
        System.out.println("myInt1 is equal to myInt2: " + myInt1.equals(myInt2));
        //second output
        System.out.println("myInt3 is even: " + myInt3.isEven());
        System.out.println("myInt4 is odd: " + myInt4.isOdd());
        System.out.println("20 is odd: " + MyInteger.isOdd(20));
        System.out.println("myInt3 is equal to 20: " + myInt3.equals(20));
        System.out.println("myInt3 is equal to myInt4: " + myInt3.equals(myInt4));
        //third output
        System.out.println("myInt5 is even: " + myInt5.isEven());
        System.out.println("myInt6 is odd: " + myInt6.isOdd());
        System.out.println("100 is odd: " + MyInteger.isOdd(100));
        System.out.println("myInt5 is equal to 50: " + myInt5.equals(50));
        System.out.println("myInt5 is equal to myInt6: " + myInt5.equals(myInt6));
    }
}