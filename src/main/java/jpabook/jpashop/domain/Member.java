package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @JsonIgnore // 양방향 연관관계인 경우 순환참조가 되지 않도록 ignore 처리 해주어야 한다.
    @OneToMany(mappedBy = "member") // mappedBy 읽기전용 설정
    private List<Order> orders = new ArrayList<>();

}
