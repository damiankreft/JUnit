package Zadania;

import java.util.Scanner;

public class Zadanie5 extends ZadanieBase{
    public Zadanie5(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 5.");
        var error = "BŁĄD";
        var input = 0;

        try {
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    displayMonthInfo("Styczeń 31");
                    break;
                case 2:
                    displayMonthInfo("Luty 28");
                    break;
                case 3:
                    displayMonthInfo("Marzec 31");
                    break;
                case 4:
                    displayMonthInfo("Kwiecień 30");
                    break;
                case 5:
                    displayMonthInfo("Maj 31");
                    break;
                case 6:
                    displayMonthInfo("Czerwiec 30");
                    break;
                case 7:
                    displayMonthInfo("Lipiec 31");
                    break;
                case 8:
                    displayMonthInfo("Sierpień 31");
                    break;
                case 9:
                    displayMonthInfo("Wrzesień 30");
                    break;
                case 10:
                    displayMonthInfo("Październik 31");
                    break;
                case 11:
                    displayMonthInfo("Listopad 30");
                    break;
                case 12:
                    displayMonthInfo("Grudzień 31");
                    break;
                default: System.out.println(error); break;
            }
        }
        catch (Exception ex) {
            System.out.println(error);
        }
    }

    private void displayMonthInfo(String input) {
        System.out.println(input + " dni");
    }
}
