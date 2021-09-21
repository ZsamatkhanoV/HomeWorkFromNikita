package java.lesson_6;

/*В классе Грузовой добавляется поле:
        - Грузоподъёмность(т)
Для грузового разработать метод который проверит можно ли загрузить в
него xxx груза Метод должен проверять если это кол-во груза помещается в грузовик то
выводит в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить
больше чем то которое может влезть в наш грузовик то выводим “Вам нужен грузовик побольше ”.
Такой же метод делаем для Гражданских самолётов, только проверяем вместимость пассажиров.*/

import java.util.Scanner;

public class Cargo extends LandTransport {
    int liftingCapacity;

    protected Cargo() {
        this.power = 150;
        this.maxSpeed = 140;
        this.weight = 4;
        this.logo = "Man";
        this.liftingCapacity = 5;
        this.wheelsHeavy = 6;
        this.consumptionHeavy = 13;
        this.kWatt = this.power * this.watt;
        System.out.println();
        System.out.println("Характеристики грузовой машины: ");
        System.out.println("Мощность: " + kWatt + " кВт");
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Масса: " + weight);
        System.out.println("Марка: " + logo);
        System.out.println("Грузоподъемность: " + liftingCapacity);
        System.out.println("Расход топлива: " + consumptionHeavy);
        System.out.println("Количество колес: " + wheelsHeavy);
    }
    public void cargoCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите груз: ");
        int cargo = scanner.nextInt();
        if (cargo <= liftingCapacity) {
            System.out.println("Грузовик загружен!");
        } else {
            System.out.println("Возьмите грузовик побольше!");
        }
    }
}

