import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /////////PERSON/////////////////////
        Person person = new Person();
        System.out.println("Please Enter Your Name");
        person.setName(sc.next());
        System.out.println("Please Enter Your Mobile NO");
        person.setmobileNo(sc.next());
        System.out.println("Please Enter Your Age");
        person.setAge(sc.nextInt());
        System.out.println("Please Enter Your Address");
        person.setAddress(sc.next());
        System.out.println("Please Enter Your Plot No");
        person.setPlotNo(sc.nextInt());
        System.out.println("Please Enter Your City");
        person.setCity(sc.next());
        System.out.println("Please Enter Your State");
        person.setState(sc.next());
        System.out.println("Please Enter Your pincode");
        person.setPincode(sc.nextInt());
        person.showPersonDetails();  
        
        
        /////////EMPLOYEE 1 With CLIENT OBJECT//////////////
        Employee emp1 = new Employee();
      
        System.out.println("Please Enter Your Bank Account");
        emp1.setBankAccount(sc.next());
        System.out.println("Please Enter Your Bank Account Number");
        emp1.setAccountNo(sc.nextDouble());
        System.out.println("Please Enter Your IFSC");
        emp1.setIfsc(sc.next());
        System.out.println("Please Enter Your Bank Name");
        emp1.setBankName(sc.next());
        System.out.println("Please Enter Your Client Company");
        emp1.setClientCompany(sc.next());
        System.out.println("Please Enter Your Client Name");
        emp1.setClientCompanyName(sc.next());
        System.out.println("Please Enter Your Client Address");
        emp1.setClientCompanyAddress(sc.next());
        emp1.showEmployeeDetails();

        ////////////EMPLOYEE 2 With CLIENT OBJECT//////////////
        Employee emp2 = new Employee();
        System.out.println("Please Enter Your Bank Account");
        emp2.setBankAccount(sc.next());
        System.out.println("Please Enter Your Bank Account Number");
        emp2.setAccountNo(sc.nextDouble());
        System.out.println("Please Enter Your IFSC");
        emp2.setIfsc(sc.next());
        System.out.println("Please Enter Your Bank Name");
        emp2.setBankName(sc.next());
        System.out.println("Please Enter Your Client Company");
        emp1.setClientCompany(sc.next());
        System.out.println("Please Enter Your Client Name");
        emp1.setClientCompanyName(sc.next());
        System.out.println("Please Enter Your Client Address");
        emp1.setClientCompanyAddress(sc.next());
        emp2.showEmployeeDetails();
    }
    
}
