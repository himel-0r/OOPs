package OOPs.Inheritance.Basics;

public class Prac_1 {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.company = "BMW";
        honda.print();

        Engine fantastic = new Engine();
        fantastic.capacity = 25;
        fantastic.cap_calc(10);
        fantastic.cap_pr();

        fantastic.print();
    }
}

class Car {
    String company;

    void print () {
        System.out.println("company name: " + company);
    }
}

class Engine extends Car {
    int capacity;

    void cap_calc (int mul) {
        System.out.println("Capacity: " + (capacity * mul));
    }

    void cap_pr () {
        System.out.println("Cap : " + capacity);
    }
}
