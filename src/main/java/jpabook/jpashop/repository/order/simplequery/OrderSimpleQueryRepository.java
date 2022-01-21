package jpabook.jpashop.repository.order.simplequery;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * 용도에 맞게 별도 분리 하자(DTO 조회 전용 저장소)
 */
@Repository
@RequiredArgsConstructor
public class OrderSimpleQueryRepository {

    private final EntityManager em;

    /**
     * join 방안 원하는 컬럼만 선택 가능하다. (영속화되지 않으므로 조회가 아닌경우 데이터 변경할 수 없다.)
     * @return
     */
    public List<OrderSimpleQueryDto> findOrderDtos() {
        return em.createQuery(
                        "select new jpabook.jpashop.repository.order.simplequery.OrderSimpleQueryDto(o.id, m.name, o.orderedAt, o.status, d.address) " +
                                " from Order o" +
                                " join o.member m" +
                                " join o.delivery d", OrderSimpleQueryDto.class)
                .getResultList();
    }
}
