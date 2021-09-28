package java.lesson_6;

/*В классе Гражданский добавляются поля:
        - Кол-во пассажиров
        - Наличие бизнес класса (true/false)*/

import java.util.Scanner;

public class Civil extends AirTransport {
    int numberPass;
    boolean business;

    public Civil() {
        this.numberPass = 160;
        this.business = true;
        this.power = 600;
        this.maxSpeed = 700;
        this.weight = 180;
        this.logo = "Boeing";
        this.wingSpanCivil = 45;
        this.kWatt = this.power * this.watt;
        System.out.println();
        System.out.println("Характерисики Гражданского самолета: ");
        System.out.println("Мощность: " + kWatt + " кВт");
        System.out.println("Максимальная Скорость: " + maxSpeed + " км/ч");
        System.out.println("Масса: " + weight + " тонны");
        System.out.println("Марка: " + logo);
        System.out.println("Размах крыльев: " + wingSpanCivil);
        System.out.println("Количество пассажиров: " + numberPass);
        System.out.println("Наличие бизнес класса: " + true);
    }
    public void passengerCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров: ");
        int passengers = scanner.nextInt();
        if (passengers <= numberPass) {
            System.out.println("Самолет взлетит");
        } else {
            System.out.println("Нужен самолет с большей вместимостью");
        }
    }
}
