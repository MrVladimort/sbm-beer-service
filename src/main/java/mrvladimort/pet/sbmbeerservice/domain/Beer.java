package mrvladimort.pet.sbmbeerservice.domain;

import lombok.*;
import mrvladimort.pet.sbmbeerservice.domain.enums.BeerStyleEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
public class Beer extends AbstractAuditingEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private BeerStyleEnum style;
    
    @Column(unique = true)
    private Long upc;

    private BigDecimal price;

    @Column(name = "min_on_hand")
    private Integer minOnHand;

    @Column(name = "quantity_on_hand")
    private Integer quantityOnHand;
}
