public class ContactDaTa {
    private String phonenumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String DateofBirth;
    private String Email;

    public ContactDaTa() {
    }

    public ContactDaTa(String phonenumber, String group, String name, String gender, String address, String dateofBirth, String email) {
        this.phonenumber = phonenumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        DateofBirth = dateofBirth;
        Email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return
                ":phonenumber:" + phonenumber + "|" +
                "group " + group + "|" +
                "name " + name + "|" +
                "gender " + gender + "|" +
                "address " + address + "|" +
                "DateofBirth " + DateofBirth + "|" +
                "Email " + Email + "|" ;
    }
}
