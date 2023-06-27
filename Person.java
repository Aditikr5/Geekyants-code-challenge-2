class Person{
    public String name;
    public String mobileNo;
    public int  age;
    public String address;
    public int  plotNo;
    public String city;
    public String state;
    public int pincode;

    public void setName(String name){
        this.name=name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setmobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public String getmobileNo() {
        return mobileNo;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }
    
    public int getPlotNo() {
        return plotNo;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }
    
    public void showPersonDetails(){
        System.out.println("Person Details:");
        System.out.println("-----------------------");
        System.out.println("Name:"+ getName());
        System.out.println("Mobile No:"+ getmobileNo());
        System.out.println("Age:"+ getAge());
        System.out.println("Address:"+ getAddress());
        System.out.println("Plot No:"+ getPlotNo());
        System.out.println("City:"+ getCity());
        System.out.println("State:"+ getState());
        System.out.println("Pincode:"+ getPincode());
    }

}