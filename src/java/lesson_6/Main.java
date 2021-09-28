package java.lesson_6;

public class Main {
    public static void main(String[] args) {
      LightCar lightCar = new LightCar();
      lightCar.timeDistance();
      Cargo heavy = new Cargo();
      heavy.cargoCapacity();
      Civil civil = new Civil();
      civil.passengerCapacity();
      Military military = new Military();
      military.shot();
      military.setBailout();
    }
}
