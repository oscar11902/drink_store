package fcu.oscar_chen.main;

import fcu.oscar_chen.data.Drink;
import fcu.oscar_chen.data.Order;
import fcu.oscar_chen.data.OrderDetail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by oscar on 2017/6/14.
 */
public class Main {
    private static Scanner sc;


    public static void main(String args[]) throws InputMismatchException, numberException {
        boolean finish = true;
        ArrayList<Drink> menu = Init.getmenu();
        ArrayList<Order> orders = new ArrayList<Order>();
        sc = new Scanner(System.in);
        do {
            System.out.println(
                    "1.新增訂單\n" +
                            "2.查詢現有訂單\n" +
                            "0.離開");

            System.out.print("請輸入選擇：");
            switch (getChoice()) {
                case 0:
                    finish = false;
                    break;
                case 1:
                    ArrayList<OrderDetail> norder = new ArrayList<OrderDetail>();
                    int index;
                    int ice;
                    int sugar;
                    int count;
                    boolean quit = true;
                    while (quit) {
                        menudisplay(menu);
                        System.out.println("請輸入需要的飲料：");
                        index = getChoice();
                        System.out.println("請問要多少冰：");
                        ice = getChoice();
                        System.out.println("請問要幾分糖：");
                        sugar = getChoice();
                        System.out.println("要幾杯：");
                        count = getChoice();
                        norder.add(add(menu.get(index - 1), ice, sugar, count));
                        boolean nq = true;
                        while (nq) {
                            System.out.println("是否還要加點?\n" +
                                    "1.是\n" +
                                    "0.否");
                            switch (getChoice()) {
                                case 0:
                                    nq = false;
                                    quit = false;
                                    break;
                                case 1:
                                    break;
                                default:
                            }
                        }
                    }
                    orders.add(new Order(norder));
                    break;
                case 2:
                    for (Order o:
                         orders) {
                        o.display();
                    }
                default:
            }

        } while (finish);


    }

    private static OrderDetail add(Drink drink, int ice, int sugar, int count) throws numberException {
        try {
            if (ice < 0 || sugar < 0 || count <= 0) throw new numberException();
        } catch (numberException e) {
            System.out.println(e);
        }
        return new OrderDetail(drink, ice, sugar, count);

    }

    private static void menudisplay(ArrayList<Drink> menu) {
        int i = 1;
        for (Drink e : menu) {
            System.out.print(i + ":");
            System.out.println(e);
            i++;
        }
    }

    private static int getChoice() throws InputMismatchException {

        int choice;
        while (true) {
            try {
                choice = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("請輸入數字!!");
            }
        }
        return choice;
    }


}

class numberException extends Exception {
    public String toString() {
        return "數字不能小於0!!\n";
    }
}
