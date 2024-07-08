package baitapbuoi7;

import java.util.Scanner;

public class ManagePhoneBook {

    public ManagePhoneBook() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      PhoneBook phoneBook = new PhoneBook("", "");

        while (true) {    
            System.out.println("-----Menu-----");
            System.out.print("1. Insert Phone\n2. Remove Phone\n3. Update Phone\n4. Search Phone\n5. Sort\n6. Exit\nYour choice: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            System.out.println("");

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap sdt: ");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    System.out.print("Nhap ten: ");
                    name = sc.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    System.out.print("Nhap ten: ");
                    name = sc.nextLine();
                    System.out.print("Nhap sdt ban muon doi: ");
                    String newPhone = sc.nextLine();
                    phoneBook.updatePhone(name, newPhone);
                    break;
                case 4:
                    System.out.print("Nhap ten: ");
                    name = sc.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sort();
                    break;
                case 6:
                    System.out.println("Tam biet!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong hop le. Vui long nhap lai.");

            }
        }
    }
}
