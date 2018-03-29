package com.shop.mongodbdemo.sys.controller;

import com.shop.mongodbdemo.sys.dao.OrderDao;
import com.shop.mongodbdemo.sys.entity.Order;
import com.shop.mongodbdemo.sys.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @RequestMapping(value = "/updateOrderDetail",method = RequestMethod.POST)
    public void updateOrderDetail(long id,long detailId){
        Order order = orderDao.findById(id);
        List<OrderDetail> orderDetails = order.getOrderDetailList();
        List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
        for(OrderDetail o:orderDetails){
            if(o.getId()!=detailId){
                orderDetailList.add(o);
            }
        }
        order.setOrderDetailList(orderDetailList);
        orderDao.updateOrderDetail(order);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save(long id){
        List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
        Order entity = new Order();
        entity.setId(id);
        entity.setNote("备注"+id);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(1);
        orderDetail.setPrice("50");
        orderDetailList.add(orderDetail);
        orderDetail = new OrderDetail();
        orderDetail.setId(2);
        orderDetail.setPrice("60");
        orderDetailList.add(orderDetail);
        orderDetail = new OrderDetail();
        orderDetail.setId(3);
        orderDetail.setPrice("20");
        orderDetailList.add(orderDetail);
        entity.setOrderDetailList(orderDetailList);
        orderDao.saveOrder(entity);
    }

}
