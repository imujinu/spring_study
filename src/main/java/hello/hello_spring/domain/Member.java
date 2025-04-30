package hello.hello_spring.domain;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

}
