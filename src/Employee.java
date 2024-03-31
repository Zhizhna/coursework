import java.util.Objects;
public class Employee{

    private String fullName;
    private short department;
    private double salary;
    private int id;
    private static int idCounter = 0;
    public Employee(String fullName, short department, double salary){
        this.id = ++idCounter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public short getDepartment() {
        return department;
    }

    public void setDepartment(short department) {
        if (department > 5){
            throw new IllegalArgumentException("Department can't be more than 5)");
        }
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return "id=" + id + ", fullName='" + fullName + ", department=" + department + ", salary=" + salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
