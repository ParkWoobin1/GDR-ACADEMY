package com.shop.repository;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import com.shop.shop.ShopApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;


@SpringBootTest(classes = ShopApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties")
class ItemRepositoryTest {

    @MockBean
    @Autowired(required = false)
    ItemRepository itemRepository;


    @Test
    //@DisplayName("상품저장 테스트")
    public void createItemTest(){

        Item item = new Item();
        item.setItemNm("테스트상품");
        item.setPrice(10000);
        item.setItemDetail("테스트상품 상세 설명");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStockNumber(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());

        System.out.println(item.toString());
        Item ad = itemRepository.saveAndFlush(item);





    }

}