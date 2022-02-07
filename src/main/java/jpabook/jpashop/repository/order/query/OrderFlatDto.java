package jpabook.jpashop.repository.order.query;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderFlatDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderedAt;
    private OrderStatus orderStatus;
    private Address address;

    private String itemName;
    private int orderPrice;
    private int orderCount;

    public OrderFlatDto(Long orderId, String name, LocalDateTime orderedAt, OrderStatus orderStatus, Address address, String itemName, int orderPrice, int orderCount) {
        this.orderId = orderId;
        this.name = name;
        this.orderedAt = orderedAt;
        this.orderStatus = orderStatus;
        this.address = address;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.orderCount = orderCount;
    }
}
