package com.example.airbnb.controller;

import com.example.airbnb.modele.Property;
import com.example.airbnb.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("property")
@AllArgsConstructor()
public class PropertyController {


    private final PropertyService propertyService;



    @PostMapping("/create")
    public Property create (@RequestBody Property property){
        System.out.println(property);
        return propertyService.create(property);
    }

    @GetMapping()
    public Page<Property> allProperty(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size
    ){
        Pageable pageable = PageRequest.of(page, size);
        return propertyService.propertyList(pageable);
    }

    @PutMapping("/update/{id}")
    public Property update (@PathVariable UUID id, @RequestBody Property property){
        return propertyService.update(id, property);
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable UUID id){
        return propertyService.delete(id);
    }
}
