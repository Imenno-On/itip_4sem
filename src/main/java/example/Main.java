package example;

public class Main {
    public static void main(String[] args) {
        Employee admin = new Administrator("Alice");
        Employee programmer = new Programmer("Bob");
        Employee manager = new Manager("Charlie");

        admin.work();
        programmer.work();
        manager.work();
    }
}
