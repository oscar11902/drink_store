package fcu.oscar_chen.data;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	Date createDate;
	ArrayList <OrderDetail> detail;

	public Order(ArrayList<OrderDetail> detail) {
		this.detail = detail;
		createDate=new Date();
	}
	public void display(){
		int sumcount=0,sumPrice=0;
		System.out.println(createDate);
		for (OrderDetail od:detail) {
			sumcount+=od.getCount();
			sumPrice+=od.getPrice();
			od.display();
		}
		System.out.println("共"+sumcount+"杯，"+sumPrice+"元");
	}
}
