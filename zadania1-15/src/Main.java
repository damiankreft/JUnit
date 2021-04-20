import Lab3.Enums.Engine;
import Lab3.Enums.Payload;
import Lab3.Vehicle.Vehicle;
import Lab3.LawnMower;
import Lab3.Locomotive;
import Zadania.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Lab1();
//         Lab2 can be tested by running unit tests.
        Lab3();
    }

    private static void Lab1() {
        var scanner = new Scanner(System.in);
        var exercises = new ArrayList<IZadanie>() {{
            add(new Zadanie1(scanner));
            add(new Zadanie2(scanner));
            add(new Zadanie3(scanner));
            add(new Zadanie4(scanner));
            add(new Zadanie5(scanner));
            add(new Zadanie6(scanner));
            add(new Zadanie7(scanner));
            add(new Zadanie8(scanner));
            add(new Zadanie9(scanner));
            add(new Zadanie10(scanner));
            add(new Zadanie11(scanner));
            add(new Zadanie12(scanner));
            add(new Zadanie13(scanner));
            add(new Zadanie14());
            add(new Zadanie15());
        }};

        for (var exercise : exercises) {
            exercise.execute();
        }
    }

    private static void Lab3() {
        var loco1 = new Locomotive("Honda", "QWERTY", Engine.Diesel, 10_000,
                20, Payload.Cargo);
        loco1.DisplayInfo();
        System.out.println("");
        var lawnMower = new LawnMower("Toyota", "YTREWQ", Engine.Gasoline, 100, 3,
                true, true);
        lawnMower.DisplayInfo();
        System.out.println("");
        var car = new Vehicle("Toyota", "MR2", Engine.Gasoline, 2_000, 163, 8_000);
        car.DisplayInfo();

        System.out.println("");
        var car2 = new Vehicle("Toyota", "MR2", Engine.Gasoline, 3_000, 163, 8_000);
        car2.DisplayInfo();
    }
}



