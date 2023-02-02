public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee e = new Employee(50_000,100);
        int hours = e.calculateWage(100);
        System.out.println(hours);
        e.calculateWage();
    }
}