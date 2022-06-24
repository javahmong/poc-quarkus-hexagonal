package ch.demo.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity
public class Company {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
}
