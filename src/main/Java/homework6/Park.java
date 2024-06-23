package homework6;

/*
Задание 3
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
времени их работы и стоимости
 */
public class Park {

    public class Attraction{
        private String name;
        private String timetable;
        private int price;

        public Attraction(String name, String timetable, int price){
            this.name=name;
            this.timetable=timetable;
            this.price=price;
        }

        public void getName(){
            System.out.println(this.name);
        }
        public void getTimetable(){
            System.out.println(this.timetable);
        }
        public void getPrice(){
            System.out.println(this.price);
        }
    }
}
