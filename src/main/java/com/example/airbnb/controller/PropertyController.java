package com.example.airbnb.controller;

import com.example.airbnb.modele.Property;
import com.example.airbnb.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
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
    public List<Property> allProperty(){
        return propertyService.propertyList();
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
