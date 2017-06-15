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
}
