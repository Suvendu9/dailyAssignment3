package com.order.app.demo.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.order.app.demo.utils.OrderStatus;

@Document(collection = "orderCollection")
public class Order {
	@Id
	private String orderId;
	@Min(value = 0, message = "price should not be negative")
	private float totalAmount;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	private Date orderDate;
	
	private OrderStatus orderStatus;
	private List<OrderLine> listOfOrderLines;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<OrderLine> getListOfOrderLines() {
		return listOfOrderLines;
	}

	public void setListOfOrderLines(List<OrderLine> listOfOrderLines) {
		this.listOfOrderLines = listOfOrderLines;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
}
