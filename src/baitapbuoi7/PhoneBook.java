package baitapbuoi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PhoneBook extends Phone {

    Scanner sc = new Scanner(System.in);
    ArrayList<Phone> phoneList = new ArrayList<>();

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }

    public ArrayList<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "PhoneBook{" + "phoneList=" + phoneList + '}';
    }

    @Override
    public void insertPhone(String name, String phone) {
        boolean found = false;
        for (Phone phone1 : phoneList) {
            if (phone1.getName().equals(name)) {
                found = true;
                if (!phone1.getPhone().equals(phone)) {
                    System.out.println("Ban da cap nhap so dien thoai moi thanh cong" + phone1.getPhone());
                    phone1.setPhone(phone);
                    System.out.println(" : " + phone1.getPhone());
                }
                break; // Thoát vòng lặp sau khi tìm thấy và cập nhật
            }
        }
        if (!found) {
            Phone dth = new PhoneBook(name, phone);
            phoneList.add(dth);
            System.out.println("Ten nguoi dung nay chua co trong danh sach.\nBan da them nguoi dung moi thanh cong!");
        }
    }

    @Override
    public void removePhone(String name) {

        List<Phone> toRemove = new ArrayList<>(); // Danh sách tạm thời chứa các phần tử định xóa
        boolean removed = false;
        for (Phone phone1 : phoneList) {
            if (phone1.getName().equals(name)) {
                toRemove.add(phone1);
                removed = true; // phần tử được tìm thấy
                break;
            }
        }
        phoneList.removeAll(toRemove); // Xóa tất cả các phần tử trong danh sách tạm thời
        if (removed) {
            System.out.println("Ban da xoa thanh cong!");
        } else {
            System.out.println("Khong thay ten nguoi dung can xoa.");
        }

    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (Phone phone1 : phoneList) {
            if (phone1.getName().equals(name)) {
                phone1.setPhone(newPhone);
                System.out.println(phone1.getName() + " : da thay doi so dien thoai moi thanh cong : " + phone1.getPhone());

            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (Phone phone1 : phoneList) {
            if (phone1.getName().equals(name)) {
                System.out.println("So dien thoai ban dang tim la: " + phone1.getPhone());
            } else {
                System.out.println("Khong thay ten nguoi dung can tim.");
            }
        }

    }

    @Override
    public void sort() {
        Collections.sort(phoneList, Comparator.comparing(Phone::getName));
        System.out.println("Sap xep danh sach thanh cong!");
    }

}
