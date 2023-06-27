public class ClientClass {
    public String company;
    public String name;
    public String address;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyAddress() {
        return address;
    }

    public void showClientDetails() {
        System.out.println("Client Details:");
        System.out.println("-----------------------");
        System.out.println("Company:" + getCompany());
        System.out.println("Company Name:" + getCompanyName());
        System.out.println("Company Address:" + getCompanyAddress());
    }
}
