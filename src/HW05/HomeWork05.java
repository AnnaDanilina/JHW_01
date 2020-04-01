package HW05;

public class HomeWork05 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Ivanov", "ivanov@mail.ru", "worker", 21, 50000, "111-11-11-11");
        emp[1] = new Employee("Petrov", "ipetrov@mail.ru", "boss", 44, 200000, "211-11-11-11");
        emp[2] = new Employee("Sidorov", "sidorov@mail.ru", "super worker", 92, 80000, "311-11-11-11");
        emp[3] = new Employee("Stepanov", "stepanov@mail.ru", "worker", 31, 60000, "411-11-11-11");
        emp[4] = new Employee("Antonov", "antonov@mail.ru", "worker", 68, 70000, "511-11-11-11");

        System.out.println("Age > 40");

        for (int i = 0; i < emp.length; i++) {
            if (ageMore40(emp[i])) System.out.println(emp[i].info());

        }
    }

    public static boolean ageMore40(Employee e) {
        return (e.getAge() > 40);
    }

}
