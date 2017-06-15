package fcu.oscar_chen.main;

import java.util.ArrayList;

import fcu.oscar_chen.data.Drink;

public class Init {

	public static ArrayList<Drink>getmenu(){
		ArrayList<Drink> drink=new ArrayList<Drink>();
		drink.add(new Drink("紅茶",20));
		drink.add(new Drink("綠茶",20));
		drink.add(new Drink("青茶",20));
		drink.add(new Drink("奶茶",20));
		return drink;
	}
}
