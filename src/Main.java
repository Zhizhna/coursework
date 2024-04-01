public class Main {
            private static final Employee[] employees = new Employee[10];
            public static void main(String[] args) {
                // Примеры создания сотрудников для тестирования
                employees[0] = new Employee("Teo Scherbet", (short) 1, 250000);
                employees[1] = new Employee("Richard Tyler", (short) 2, 3000000);
                printAllEmployees();
                System.out.println("Total monthly salary expenses: " + calculateTotalSalaryExpenses());
                System.out.println("Employee with minimum salary: " + findEmployeeWithMinSalary());
                System.out.println("Employee with maximum salary: " + findEmployeeWithMaxSalary());
                System.out.println("Average salary: " + calculateAverageSalary());
            }
            public static void printAllEmployees() {
                for (Employee employee : employees) {
                    if (employee != null) {
                        System.out.println(employee);
                    }
                }
            }
            public static double calculateTotalSalaryExpenses() {
                double totalSalary = 0;
                for (Employee employee : employees) {
                    if (employee != null) {
                        totalSalary += employee.getSalary();
                    }
                }
                return totalSalary;
            }
            public static Employee findEmployeeWithMinSalary() {
                Employee minSalaryEmployee = null;
                for (Employee employee : employees) {
                    if (employee != null) {
                        if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                            minSalaryEmployee = employee;
                        }
                    }
                }
                return minSalaryEmployee;
            }
            public static Employee findEmployeeWithMaxSalary() {
                Employee maxSalaryEmployee = null;
                for (Employee employee : employees) {
                    if (employee != null) {
                        if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                            maxSalaryEmployee = employee;
                        }
                    }
                }
                return maxSalaryEmployee;
            }
            public static double calculateAverageSalary() {
                double totalSalary = calculateTotalSalaryExpenses();
                int numberOfEmployees = 0;
                for (Employee employee : employees) {
                    if (employee != null) {
                        numberOfEmployees++;
                    }
                }
                return totalSalary / numberOfEmployees;
            }
        }