package ch.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CompanyDTO {
    private Long id;
    private String code;
    private String name;
}
