public class Employee extends Person{
    public String bankAccount;
    public double accountNo;
    public String ifsc;
    public String bankName;
   
    //Object for client class to show HAS-A relationship
    ClientClass clientObj = new ClientClass();

    //setters and getters for all attributes in employee class
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    public String getBankAccount() {
        return bankAccount;
    }
    
    public void setAccountNo(double accountNo) {
        this.accountNo = accountNo;
    }
    
    public double getAccountNo() {
        return accountNo;
    }
    
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
    
    public String getIfsc() {
        return ifsc;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    public String getBankName() {
        return bankName;
    }
    

    //Setters for client class details
    public void setClientCompany(String company){
       clientObj.setCompany(company);
    }
    
    public void setClientCompanyName(String name) {
        clientObj.setName(name);
    }
    
    public void setClientCompanyAddress(String address) {
        clientObj.setAddress(address);
    }
    
    // To print all the details of an employee including client details
    public void showEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("-----------------------");
        System.out.println("Name:" + getName());
        System.out.println("Mobile No:" + getmobileNo());
        System.out.println("Age:" + getAge());
        System.out.println("Address:" + getAddress());
        System.out.println("Plot No:" + getPlotNo());
        System.out.println("City:" + getCity());
        System.out.println("State:" + getState());
        System.out.println("Pincode:" + getPincode());
        System.out.println("Bank Account:" + getBankAccount());
        System.out.println("Account No:" + getAccountNo());
        System.out.println("IFSC:" + getIfsc());
        System.out.println("Bank Name:" + getBankName());
        clientObj.showClientDetails();
    }
   
}
