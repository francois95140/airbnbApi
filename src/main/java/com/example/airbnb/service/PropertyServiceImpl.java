package com.example.airbnb.service;

import com.example.airbnb.modele.Property;
import com.example.airbnb.repository.PropertyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }


    @Override
    public Property creat(Property property) {
        System.out.println("pop pop reta");
        return propertyRepository.save(property);
    }

    @Override
    public List<Property> propertyList() {
        return propertyRepository.findAll();
    }

    @Override
    public Property update(UUID id, Property property) {
//        return propertyRepository.findById(id).map(propertyRes-> {
//                    propertyRes.setPrice(property.getPrice());
//                    propertyRes.setName(property.getName());
//                    propertyRes.setDescription(property.getDescription());
//            return null;
//        }).orElseThrow(() -> new RuntimeException("Property not fund !!"));
        return null;
    }

    @Override
    public String delet(UUID id) {
        propertyRepository.deleteById(id);
        return "Property deleted ";
    }
}
