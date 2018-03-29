package com.shop.mongodbdemo.sys.dao;

import com.shop.mongodbdemo.sys.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Order findById(long id){
        Query query=new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query,Order.class);
    }

    /**
     * 功能描述：保存订单数据
     * @param entity
     */
    public void saveOrder(Order entity){
        mongoTemplate.save(entity);
    }


    /**
     * 功能描述：更新订单中的订单明细
     * @param entity
     */
    public void updateOrderDetail(Order entity){
        Query query=new Query(Criteria.where("id").is(entity.getId()));
        Update update= new Update().set("orderDetailList", entity.getOrderDetailList());
        mongoTemplate.updateFirst(query,update,Order.class);
    }

}
