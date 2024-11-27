package com.example.airbnb.controller;

import com.example.airbnb.modele.Property;
import com.example.airbnb.service.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("property")
public class PropertyController {


    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping("/create")
    public Property creat (@RequestBody Property property){
        System.out.println(property);
        return propertyService.creat(property);
    }

    @GetMapping()
    public List<Property> allProperty(){
        return propertyService.propertyList();
    }

    public String delet (@PathVariable UUID id){
        return propertyService.delet(id);
    }
}
