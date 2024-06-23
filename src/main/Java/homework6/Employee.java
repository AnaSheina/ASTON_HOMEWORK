package homework6;

/*
Задание 1
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

Задание 2
Создать массив из 5 сотрудников.
Пример:
// вначале объявляем массив объектов
Person[] persArray = new Person[5];
// потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer",
               "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...persArray[4] = new Person(...);
*/
public class Employee{
    public String FIO;
    public String Position;
    public String Email;
    public String Phone;
    public int Salary;
    public int age;


    public Employee(String FIO, String Position, String Email, String Phone, int Salary, int age){
        this.FIO = FIO;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.age = age;
    }
    public void info (){
        System.out.println("Сотрудник\n"+"ФИО: " + FIO + "\nДолжность: " + Position + "\nEmail: " + Email + "\nТелефон: " + Phone + "\nЗарплата: " + Salary + "\nВозраст: " + age);
    }
}

