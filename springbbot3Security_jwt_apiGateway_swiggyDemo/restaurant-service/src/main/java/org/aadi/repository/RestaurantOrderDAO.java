package org.aadi.repository;

import org.aadi.dto.OrderResponseDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class RestaurantOrderDAO {

    public OrderResponseDTO getOrders(String orderId) {
        return generateRandomOrders().get(orderId);
    }

    //I have hard coded few menu items with orders in HashMap.
    private Map<String, OrderResponseDTO> generateRandomOrders() {
        Map<String, OrderResponseDTO> orderMap = new HashMap<>();
        orderMap.put("765j5c", new OrderResponseDTO("765j5c", "FULL-VEG-THALI", 1, 199, new Date(), "READY", 15));
        orderMap.put("866h1k", new OrderResponseDTO("866h1k", "CHICKEN-THALI", 3, 299, new Date(), "PREPARING", 59));
        orderMap.put("90161al", new OrderResponseDTO("90161al", "SPECIAL BIRYANI", 2, 399, new Date(), "DELIVERED", 0));
        return orderMap;
    }

}
