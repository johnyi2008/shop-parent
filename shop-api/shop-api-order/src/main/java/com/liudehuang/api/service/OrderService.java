package com.liudehuang.api.service;

import com.liudehuang.base.ResponseBase;
import com.liudehuang.entity.OrderEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liudehuang
 * @date 2019/1/16 14:56
 */
@RequestMapping("/order")
public interface OrderService {
    @RequestMapping("/updateOrder")
    ResponseBase updateOrder(@RequestParam("isPay") Long isPay, @RequestParam("payId") String payId, @RequestParam("orderNumber") String orderNumber);


}
