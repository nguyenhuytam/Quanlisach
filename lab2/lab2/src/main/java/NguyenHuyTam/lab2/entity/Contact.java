package NguyenHuyTam.lab2.entity;
public class Contact {
    //Khai báo các thuộc tính
    private String name;
    private String email;
    private String message;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Contact(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }
    public Contact() {

    }
//Phương thức getters, setters, khởi tạo, tự tạo (SV tự hoàn thiện)
}
