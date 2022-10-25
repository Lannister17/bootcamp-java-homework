package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
//        customer.
        Employee employee = new Employee();
//        employee.
        Person person = new Person();
//        person.

        CustomerManager customerManager = new CustomerManager();
        customerManager.List();
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee();
        PersonManager personManager = new PersonManager();
        personManager.Add();

    }
}
