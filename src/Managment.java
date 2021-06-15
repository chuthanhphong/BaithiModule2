import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Managment {
    Validate validate = new Validate();
    Scanner sc = new Scanner(System.in);
    public static  List<ContactDaTa> phoneList;
    private ReadAndWriteFile readAndWriteFile;
    private String numberFind = " ";
    public Managment(){
        readAndWriteFile = new ReadAndWriteFile();
        phoneList = readAndWriteFile.read();
    }
    public void InputPhonenumber(){
        System.out.print("Nhập SĐT: ");
        numberFind = sc.nextLine();
    }
    public String inputNumber() {
        String number=null;
        System.out.print("Nhập SĐT: ");
        do {
            number = sc.nextLine();
            if (!validate.Check(Validate.REGEXPHONENUMBER, number)) {
                System.out.println("Nhập Theo đúng định dạng 0xxxxxxxxxx");

            }
        } while (!validate.Check(Validate.REGEXPHONENUMBER, number));
        return number;
    }
    private String inputName(){
        System.out.print("Nhập tên: ");
        return sc.nextLine();
    }
    private String inputDateOfbirth(){
        System.out.print("Nhập ngày tháng năm sinh: ");
        String  dateofbrith = sc.nextLine();
        return dateofbrith;
            }

    private String inputContact(){
        System.out.print("Nhập nhóm: ");
        return sc.nextLine();
    }
    private String InputGender(){
        System.out.print("Nhập giới tính: ");
        return sc.nextLine();
    }
    private String inputAddress(){
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        return address;
    }
    private String inputEmail(){
        String email=null;
        System.out.print("Nhập Email: ");
        do {
            email = sc.nextLine();
            if (!validate.Check(Validate.REGEXEMAIL,email )) {
                System.out.println("Nhập Theo đúng định dạng abcabc@gmail.com");
            }
        } while (!validate.Check(Validate.REGEXPHONENUMBER, email));
        return emai
    public void add(){
        String contact = inputContact();
        String name = inputName();
        String number = inputNumber();
        String gender = InputGender();
        String address = inputAddress();
       String dateofbirth = inputDateOfbirth();
        String email = inputEmail();
        ContactDaTa phone = new ContactDaTa(number,name,contact,gender,address,dateofbirth,email);
        phoneList.add(phone);
        readAndWriteFile.write(phoneList);
    }
    public void delete(String number){
        ContactDaTa contactDaTa = null;
        int size = phoneList.size();
        for (int i = 0; i < size;i++){
            if (phoneList.get(i).getPhonenumber().equals(number)) {
                contactDaTa = phoneList.get(i);
                break;
            }
        }
        if (contactDaTa != null){
            String chose;
            System.out.println("Nhập lựa chọn để xóa \n" +
                    "ấn y để xóa " + " ấn n để không xóa");
            chose = sc.nextLine();
            switch (chose){
                case "y":
                    phoneList.remove(contactDaTa);
                    readAndWriteFile.write(phoneList);
                    System.out.println("Xóa thành công");
                    break;
                case "n":
                    System.out.println("bạn chưa xóa gì cả");
                    break;
            }
        }else {
            System.out.println("SĐT: " + number + " không có");
        }
    }
    public void edit(String number){
        boolean isExisted = false;
        int size = phoneList.size();
        for (int i =0; i < size;i++){
            if (phoneList.get(i).getPhonenumber().equals(number)){
                isExisted = true;
                phoneList.get(i).setGroup(inputContact());
                phoneList.get(i).setName(inputName());
                phoneList.get(i).setGender(InputGender());
                phoneList.get(i).setDateofBirth(inputDateOfbirth());
                phoneList.get(i).setAddress(inputAddress());
                phoneList.get(i).setEmail(inputEmail());
                break;
            } else {
                System.out.println("SĐT không hợp lệ");
            }
        }
    }
    public void write(){
        readAndWriteFile.write(phoneList);
    }
    public void show(){
       for(ContactDaTa contactDaTa:phoneList){
           System.out.println(contactDaTa +"\n");
        }
        }
        public ContactDaTa findContact(String phonenumber){
            for(int i=0;i<phoneList.size();i++){
                if(phoneList.get(i).getPhonenumber().equals(phonenumber)){
                     return  phoneList.get(i);
                }
            }
return new ContactDaTa();
        }
    }
