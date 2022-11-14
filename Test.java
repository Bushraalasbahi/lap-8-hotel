public class Test {
    public static void main(String[] args) {
        Employee e=new Employee(1,"mazn",15,773199493,300000);
        System.out.println(e);
        System.out.println(e.calculatevalue());
        Customer c=new Customer(1,"mazn",15,773199493,10000,3);
        System.out.println(c);
        System.out.println(c.calculatevalue());
    }
}
