package com.crichype.OrderService.service;


import com.crichype.OrderService.dto.InventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;


//@FeignClient(url = "http://localhost:8083",value = "Inventory-Client")
//@FeignClient(name = "INVENTORY-SERVICE") This is used for load balancing instead for finding port they try to find INVENTORY-SERVICE

@FeignClient(name = "INVENTORY-SERVICE")
public interface InventoryClient {

    @GetMapping("/api/inventory")
    List<InventoryResponse> isInStock(@RequestParam("skuCode") List<String> skuCodes);


}
