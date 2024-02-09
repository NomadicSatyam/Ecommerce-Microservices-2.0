package com.crichype.InventoryService.util;

import com.crichype.InventoryService.model.Inventory;
import com.crichype.InventoryService.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final InventoryRepository inventoryRepository;
    @Override
    public void run(String... args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.setSkuCode("mackbook");
        inventory.setQuantity(100);

        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("mackbook_pro");
        inventory1.setQuantity(1);

        inventoryRepository.save(inventory);
        inventoryRepository.save(inventory1);
    }
}
