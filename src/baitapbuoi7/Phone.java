
package baitapbuoi7;

public abstract class Phone {
    
    protected String name, phone;

    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" + "name=" + name + ", phone=" + phone + '}';
    }
    
    
    public abstract void insertPhone(String name, String phone);
    
    public abstract void removePhone(String name);
    
    public abstract void updatePhone(String name, String newPhone);
    
    public abstract void searchPhone(String name);
    
    public abstract void sort();
   
}
