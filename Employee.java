import java.util.Objects;

public class Employee extends Person{

    private Double salary;

    public Employee(int id, String name, int aga, int phon,double salary) {
        super(id, name, aga,phon);
        this.salary=salary;
    }
    public double calculatevalue() {return salary/12;}
    public Double getSalary() {return salary;}
    public void setSalary(Double salary) {this.salary = salary;}
    public String toString() {
        return super.toString()+"Employee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;

    }
}
