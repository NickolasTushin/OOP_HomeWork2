public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void FillThePlate(int addFood) {
        if (addFood >= 0) {
            this.food += addFood;
        }
    }

}
