import java.util.Scanner;

public class MainPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chose;
        boolean exit = false;
        Managment managment = new Managment();
        Managment.phoneList.add(new ContactDaTa("0123456789","Codegym","Chương","Nam","Nam Định","19/05/1999","chuong@gmail.com"));
        Managment.phoneList.add(new ContactDaTa("0987654321","Codegym","Chiến","Nam","Nam Định","19/05/1999","chuong@gmail.com"));
        Managment.phoneList.add(new ContactDaTa("0933444555","Codegym","Tuyền","Nam","Nam Định","19/05/1999","chuong@gmail.com"));
        Managment.phoneList.add(new ContactDaTa("0978445553","Codegym","Hùng","Nam","Nam Định","19/05/1999","chuong@gmail.com"));
        String phoneNumber;
        showMenu();
        while (true){
            chose = sc.nextInt();
            switch (chose){
                case 1:
                    managment.add();
                    System.out.println("Thêm Thành Công");
                    break;
                case 2:
                    phoneNumber = managment.inputNumber();
                    managment.delete(phoneNumber);

                    break;
                case 3:
                    phoneNumber = managment.inputNumber();
                    managment.edit(phoneNumber);
                    break;
                case 4:
                    System.out.println("Danh Sách Số điện thoại là : ");
                    managment.show();
                    break;
                case 5:
                    phoneNumber=managment.inputNumber();
                    System.out.println("Thông tin bạn cần tìm là :");
                    System.out.println( managment.findContact(phoneNumber));
                    break;
                case 6:
                    System.out.println("Ghi vào File thành công");
                    managment.write();
                    break;
                case 0:
                    System.out.println("Thoát");
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ \n" +
                            "Mời chọn lại: ");
                    break;
            }
            if (exit){
                break;
            }
            showMenu();
        }
    }
    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Thêm SĐT");
        System.out.println("2. Xóa SĐT");
        System.out.println("3. Sửa SĐT");
        System.out.println("4. Xem danh sách SĐT");
        System.out.println("5. Tìm Kiếm Theo Số Điện Thoại");
        System.out.println("6. Ghi danh sách sang dạng csv");
        System.out.println("0. Thoát.");
        System.out.print("Nhập: ");
    }
    }
