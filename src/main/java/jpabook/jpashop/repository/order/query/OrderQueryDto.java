package jpabook.jpashop.repository.order.query;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderQueryDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderedAt;
    private OrderStatus orderStatus;
    private Address address;
    private List<OrderItemQueryDto> orderItems = new ArrayList<>();

    public OrderQueryDto(Long orderId, String name, LocalDateTime orderedAt, OrderStatus orderStatus, Address address) {
        this.orderId = orderId;
        this.name = name;
        this.orderedAt = orderedAt;
        this.orderStatus = orderStatus;
        this.address = address;
    }

}
