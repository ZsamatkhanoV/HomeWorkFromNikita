package java.lesson_6;

/*В классе Военный добавляются поля:
        - Наличие системы катапультирования (true/false)
        - Кол-во ракет на борту
Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет
не равно 0 то выводим на консоль “ Ракета пошла...”, если 0 то “Боеприпасы отсутствуют”.
А так же метод катапультирование, который проверит если наличие системы
катапультирования true, то выводим “Катапультирование прошло успешно”, если false,то “У вас нет такой системы ”*/

import java.util.Random;
import java.util.Scanner;

public class Military extends AirTransport {
    boolean bailout;
    int rockets;

    public Military() {
        this.bailout = true;
        this.rockets = 8;
        this.power = 1500;
        this.maxSpeed = 1000;
        this.weight = 25;
        this.logo = "Истребитель";
        this.wingSpanMilitary = 50;
        this.kWatt = this.power * this.watt;
        System.out.println();
        System.out.println("Характеристики Военного самолета: ");
        System.out.println("Мощность: " + kWatt + " кВт");
        System.out.println("Максимальная Скорость: " + maxSpeed + " км/ч");
        System.out.println("Масса: " + weight + " тонны");
        System.out.println("Марка: " + logo);
        System.out.println("Размах крыльев: " + wingSpanMilitary);
        System.out.println("Катапультирование: " + true);
        System.out.println("Ракеты: " + rockets);
    }
    public void shot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ракет: ");
        int ammunition = scanner.nextInt();
        if (ammunition <= rockets) {
            System.out.println("Ракета(ы) пошла(и)!");
        } else {
            System.out.println("Боеприпасы отсуствуют!");
        }
    }
    public void setBailout() {
        Random random = new Random();
        this.bailout = random.nextBoolean();
        if (bailout) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }
}
