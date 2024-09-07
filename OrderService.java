package com.parthiv.service;

import java.util.List;

import com.parthiv.domain.OrderType;
import com.parthiv.model.Coin;
import com.parthiv.model.Order;
import com.parthiv.model.OrderItem;
import com.parthiv.model.User;
import com.parthiv.request.CreateOrderRequest;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
