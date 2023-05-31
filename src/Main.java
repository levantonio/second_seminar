public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
        new Cat("Барсик", 12),
        new Cat("Мурка", 22),
        new Cat("Боб", 52),
        new Cat("Пух", 33)
        };
        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isSatiety()){
                System.out.println(cat.getName() + " сыт!!") ;
        }else{
                System.out.println(cat.getName() + " остался голоден");
            }
        }
        plate.info();
    }

}