public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int AmAm) {
        if (AmAm <= food) {
            food -= AmAm;
        }
    }

    public void increaseFood(int AmAm) {
        if (AmAm > 0) {
            food += AmAm;
        }
    }


    public void info() {
        System.out.println("количество еды в тарелке = " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        }
    }
}