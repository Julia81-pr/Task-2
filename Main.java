import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 100; // начальный баланс клиента
        System.out.println("Ваша сумма: ");
        int summa = input.nextInt(); // вводим сумму пополнения
        int balance2 = balance+summa; //баланс после пополнения
        int bonus = summa/100; // расчет бонуса за каждые 100 руб
        if(summa >=1000){
            System.out.println(" Вам начислен бонус: "+ bonus);
        }

        System.out.println(" Ваш баланс: "+ balance2);



    }
}
