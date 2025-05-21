package sist.backend.domain.shop.dto.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemRequestDTO {
    private Long productIdx;
    private Integer quantity;
    private BigDecimal price;
    
    // getItemIdx() 메서드 추가 - productIdx와 매핑
    public Long getItemIdx() {
        return this.productIdx;
    }
}