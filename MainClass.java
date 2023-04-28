import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();

        cat cat1 = new cat("Мурзик", 25, true);
        cat cat2 = new cat("Барсик", 15, true);
        cat cat3 = new cat("Рыжик", 30, true);
        cat cat4 = new cat("Серик", 36, true);
        cat cat5 = new cat("Пират", 38, true);

        cat[] cats = new cat[] { cat1, cat2, cat3, cat4, cat5 };

        for (cat cat : cats) {
            while (true) {
                if (cat.eat(cat.getAppetite(), plate.getFood()) & cat.getHunger()) {
                    plate.setFood(cat.whatLeftOnThePlate(cat.getAppetite(), plate.getFood()));
                    cat.setHunger(false);
                    System.out.printf("%s доволен.\n", cat.getName());
                    plate.info();
                    break;
                } else {
                    System.out.printf("%sу не доложили мяса.\n", cat.getName());
                    System.out.println("\n добавить еды на тарелку?\n" +
                            "    нажмите 1, чтобы добавить продукты\n" +
                            "    нажмите 2, чтобы оставить все как есть");
                    Scanner sn = new Scanner(System.in);
                    int choice = sn.nextInt();
                    if (choice != 1)
                        break;
                    else {
                        System.out.println("Выведите количество добавляемых продуктов");
                        plate.FillThePlate(sn.nextInt());
                        plate.info();
                    }
                }
            }

        }

        for (cat cat : cats) {
            if (cat.getHunger())
                System.out.printf("%s очень тобой не доволен - " +
                        " %s тебе отомстит;).\n", cat.getName(), cat.getName());
        }

    }
}