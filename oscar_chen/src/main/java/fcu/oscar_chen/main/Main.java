package fcu.oscar_chen.main;

import fcu.oscar_chen.data.Drink;
import fcu.oscar_chen.data.Order;
import fcu.oscar_chen.data.OrderDetail;

import java.util.ArrayList;

/**
 * Created by oscar on 2017/6/14.
 */
public class Main {


    public static void main(String args[]){
        int choice=1;
        boolean finish=false;
        Drink order_drink;
        ArrayList<Drink> menu=Init.getmenu();
        ArrayList<Order> orders=new ArrayList<Order>();

        do{
            System.out.println("1.新增訂單\n"+
                    "2.查詢現有訂單\n"+
                    "0.離開");
            switch (choice){
                case 0:
                    finish=false;
                    break;
                case 1:
                    menudisplay(menu);
                    break;
                default:
            }

        }while(finish);



    }
    private OrderDetail add(Drink drink,int ice,int sugar,int count) throws numberException{
        try{
            if(ice<0||sugar<0||count<=0) throw new numberException();
        }catch (numberException e){
            System.out.println(e);
        }
        return new OrderDetail(drink,ice,sugar,count);

    }
    private static void menudisplay(ArrayList<Drink> menu){
        int i=1;
        for (Drink e:menu) {
            System.out.print(i+":");
            System.out.println(e);
            i++;
        }
    }



}
class numberException extends Exception{
    public String toString(){
        return "數字不能小於0!!\n";
    }
}
