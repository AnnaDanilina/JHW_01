package HW05;

public class Employee {

    private String fio;
    private String email;
    private String post;
    private int age;
    private int salary;
    private String phone;

    public int getAge() {
        return age;
    }

    public Employee(String fio, String email, String post, int age, int salary, String phone) {
        this.fio = fio;
        this.email = email;
        this.post = post;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }

    public String info() {
        return " FIO: " + fio + " Post: " + post + " Phone: " + phone + " Mail: " + email
                + " Age: " + age + " Sallary: " + salary;
    }

}
