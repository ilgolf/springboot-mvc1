package hello.itemService.domain.item;

import lombok.Data;

@Data // 사실 위험함 @Getter @Setter를 사용해야함
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private int quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
