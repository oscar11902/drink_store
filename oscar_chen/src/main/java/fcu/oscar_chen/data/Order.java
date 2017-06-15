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
}
