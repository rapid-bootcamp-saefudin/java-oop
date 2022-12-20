package polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        Employee employee = new Employee("Apud");
        Manager manager = new Manager("Saefudin");
        VicePresident vicePresident = new VicePresident("Muhammad");

        // call method
        //employee.sayHello();
        //manager.sayHello();
        //vicePresident.sayHello();

        sayHello(vicePresident);
        sayHello(manager);
        sayHello(employee);
    }

    public static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ manager.name);
        }else {
            System.out.println("Hello Employee "+ employee.name);
        }
    }
}


