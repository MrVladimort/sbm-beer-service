package mrvladimort.pet.sbmbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mrvladimort.pet.sbmbeerservice.web.model.enums.BeerStyleEnum;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String name;
    private BeerStyleEnum style;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
