package fcu.oscar_chen.data;

public class OrderDetail {
	Drink drink;
	int ice;
	int sugar;
	int count;

	public OrderDetail(Drink drink, int ice, int sugar, int count) {
		this.drink = drink;
		this.ice = ice;
		this.sugar = sugar;
		this.count = count;
	}
	public void display(){
		System.out.println(drink.name+" "+ice+"分冰 "+sugar+"分糖 "+count+"杯");
	}
	public int getPrice(){
		return drink.price*count;
	}

	public int getCount() {
		return count;
	}
}
