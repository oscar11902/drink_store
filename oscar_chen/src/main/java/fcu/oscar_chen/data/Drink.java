package fcu.oscar_chen.data;

public class Drink {
	String name;
	int price;

	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String toString(){
		return "品名："+name+" 價格："+price+"\n";
	}
}
