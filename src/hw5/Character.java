package hw5;

public class Character {
    public static void main(String[] args) {
        CharacterInfo[] company = new CharacterInfo[5];
        company[0] = new CharacterInfo("Иванов Димон", "Инженер", "ivivan@mailbox.com", "892312312", 70000, 41);
        company[1] = new CharacterInfo("Ишутин Даниил", "Маркетолог", "dendi@mailbox.com", "892312314", 50000, 32);
        company[2] = new CharacterInfo("Дашкевич Александр", "Администратор", "xboct@mailbox.com", "892312315", 10000, 43);
        company[3] = new CharacterInfo("Путин Владимир", "Управляющий", "thief@mailbox.com", "892312316", 500000, 55);
        company[4] = new CharacterInfo("Навальный Алексей", "Креативный директор", "shtab@mailbox.com", "892312317", 200000, 41);

        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < company.length; i++) {
            if (company[i].getAge() > 40)
                company[i].printInfo();
        }
    }
}

class CharacterInfo {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public CharacterInfo(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Должность: " + position + ", Email: " + email + ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
