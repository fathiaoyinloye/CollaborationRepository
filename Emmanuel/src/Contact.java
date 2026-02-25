public class Contact {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;


    public void setName(String firstName, String lastName){
        this.name = firstName + " " + lastName;
    }
    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


    public String[] getNames(){
        String[] names = name.split(" ");
        return names;
    }


}
