package java.lesson_6;

/*В классе Легковой добавляются поля:
        - Тип кузова
        - Кол-во пассажиров
Для легкового разработать метод который будет принимать время и считать
сколько километров проедет машина двигаясь с максимальной скоростью и
сколько топлива она израсходует за это время, результат вывести в консоль,
расчёт израсходуемого топлива вынести в отдельный метод private.
Результат работы метода должен вывести такую строчку: За время (ваше введённое время) ч, автомобиль (марка автомобиля) двигаясь с максимальной
скоростью (ваша максимальная скорость) км/ч проедет (xxx) км и израсходует (xxx)литров топлива.
Пример: За время 2.5 ч, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч проедет 575 км и израсходует 46 литров топлива*/

import java.util.Scanner;

public class LightCar extends LandTransport {
    String bodyType;
    int numberPassengers;
    int distance;
    int time;

    public LightCar() {
        this.power = 100;
        this.maxSpeed = 180;
        this.weight = 2;
        this.logo = "Toyota";
        this.bodyType = "Седан";
        this.numberPassengers = 5;
        this.wheelsLight = 4;
        this.consumptionLight = 7;
        this.kWatt = this.power * this.watt;
        System.out.println();
        System.out.println("Характеристики легковой машины: ");
        System.out.println("Мощность: " + kWatt + " кВт");
        System.out.println("Максимальная Скорость: " + maxSpeed + " км/ч");
        System.out.println("Масса: " + weight + " тонны");
        System.out.println("Марка: " + logo);
        System.out.println("Тип корпуса: " + bodyType);
        System.out.println("Количество пассажиров: " + numberPassengers);
        System.out.println("Количество колес: " + wheelsLight);
        System.out.println("Расход топлива: " + consumptionLight);
    }
    public void timeDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время: ");
        int time = scanner.nextInt();
        int distance = time * maxSpeed;
        System.out.println("Дистанция с максимальной скоростью " + distance + " км");
        this.distance = distance;
        this.time = time;
        fuelConsumption();
    }
    private void fuelConsumption() {
        int consumption = distance / consumptionLight;
        System.out.println("За время " + time + " ч, автомобиль " + logo + " двигаясь со максимальной скоростью " + maxSpeed + " км/ч проедет " + distance + " км и израсходует " + consumption + " литров топлива");
    }
}