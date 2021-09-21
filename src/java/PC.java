package java;
import java.util.Objects;
import java.util.Scanner;
public class PC {
    private int attempt;
    private boolean cpu;
    private boolean ram;
    private boolean hdd;
    private boolean isOn;
    private boolean burn;
    private int resource;
    private String activation = "On";

    public PC(int resource){
        this.resource = resource;
    }
    public void Description(){
        System.out.print("[" +cpu+ "," +ram+ "," +hdd+ "," +resource+ "]");
        System.out.println();
       /* System.out.print(ram + ",");
        System.out.print(hdd + ",");
        System.out.println(resource + "]");*/
    }
    private void On(){
        this.cpu = true;
        this.ram = true;
        this.hdd = true;
    }
    private void Off(){
        this.cpu = false;
        this.ram = false;
        this.hdd = false;
    }
    public void Check(){
        for (int i = 0; i < resource; i++) {
            attempt = new Scanner(System.in).nextInt();
            if(i == resource - 1){
                System.out.println("Количество превышено, PC сгорел");
                break;
            }
            if (burn){
                System.out.println("PC сгорел, вышел из строя");
                break;
            }
            int rand = (int)(Math.random() * 2);
            if(attempt == rand){
                if(Objects.equals(activation, "On")){
                    On();
                    Description();
                    activation = "Off";
                    System.out.println("PC включился");
                }
                else if (Objects.equals(activation, "Off")){
                    Off();
                    Description();
                    activation = "On";
                    System.out.println("PC включился");
                }
            }
        }
        burn =true;
        System.out.println("PC сгорел");
    }
}
