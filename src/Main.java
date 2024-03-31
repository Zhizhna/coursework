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
                indexSalary(10);
                System.out.println("New Salaries");
                printAllEmployees();
                System.out.println("Employee with minimum salary: in department 1" + findEmployeeWithMinSalaryByDepartment(1));
                System.out.println("Employee with maximum salary: in department 1" + findEmployeeWithMaxSalaryByDepartment(1));
                System.out.println("Total monthly salary expenses: in department 1" + calculateTotalSalaryExpensesByDepartment(1));
                System.out.println("Average salary: in department 1" + calculateAverageSalaryByDepartment(1));
                indexSalaryByDepartment(1,5);
                printEmployeesByDepartment(1);
                double salaryToCompare = 250000;
                printEmployeesWithSalaryAboveOrEqual(salaryToCompare);
                printEmployeesWithSalaryBelow(salaryToCompare);
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
            public static void indexSalary(double percent) {
                for (Employee employee : employees) {
                if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
                 }
             }
            }
            public static void printEmployeesByDepartment(int department) {
                 for (Employee employee : employees) {
                    if (employee != null && employee.getDepartment() == department) {
                            System.out.println(employee.getFullName() + ", salary: " + employee.getSalary());
                    }
                }
            }
            public static Employee findEmployeeWithMinSalaryByDepartment(int department) {
             Employee minSalaryEmployee = null;
             for (Employee employee : employees) {
                   if (employee != null && employee.getDepartment() == department) {
                          if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                          minSalaryEmployee = employee;
                     }
                   }
               }
                return minSalaryEmployee;
    }

           public static Employee findEmployeeWithMaxSalaryByDepartment(int department) {
                Employee maxSalaryEmployee = null;
             for (Employee employee : employees) {
                 if (employee != null && employee.getDepartment() == department) {
                      if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                            maxSalaryEmployee = employee;
                     }
                  }
              }
               return maxSalaryEmployee;
            }

            public static double calculateTotalSalaryExpensesByDepartment(int department) {
                double totalSalary = 0;
              for (Employee employee : employees) {
                    if (employee != null && employee.getDepartment() == department) {
                        totalSalary += employee.getSalary();
                    }
               }
                return totalSalary;
            }

         public static double calculateAverageSalaryByDepartment(int department) {
                double totalSalary = 0;
                int numberOfEmployees = 0;
                for (Employee employee : employees) {
                    if (employee != null && employee.getDepartment() == department) {
                        totalSalary += employee.getSalary();
                     numberOfEmployees++;
                    }
                }
             return totalSalary / numberOfEmployees;
         }

            public static void indexSalaryByDepartment(int department, double percent) {
                for (Employee employee : employees) {
                    if (employee != null && employee.getDepartment() == department) {
                     double newSalary = employee.getSalary() * (1 + percent / 100);
                     employee.setSalary(newSalary);
                    }
              }
         }

            public static void printEmployeesWithSalaryBelow(double salary) {
             for (Employee employee : employees) {
                 if (employee != null && employee.getSalary() < salary) {
                System.out.println("Id: " + employee.getId() + ", Name: " + employee.getFullName() + ", Salary: " + employee.getSalary());
                 }
                }
            }

         public static void printEmployeesWithSalaryAboveOrEqual(double salary) {
             for (Employee employee : employees) {
                    if (employee != null && employee.getSalary() >= salary) {
                        System.out.println("Id: " + employee.getId() + ", Name: " + employee.getFullName() + ", Salary: " + employee.getSalary());
                }
                }
            }
        }