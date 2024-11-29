package com.example.airbnb.service;

import com.example.airbnb.modele.Property;
import com.example.airbnb.repository.PropertyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;


    @Override
    public Property create(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public List<Property> propertyList() {
        return propertyRepository.findAll();
    }

    @Override
    public Property update(UUID id, Property property) {
        return propertyRepository.findById(id).map(propertyRes -> {
            propertyRes.setPricePerNight(property.getPricePerNight());
            propertyRes.setName(property.getName());
            propertyRes.setDescription(property.getDescription());
            return propertyRepository.save(propertyRes);
        }).orElseThrow(() -> new RuntimeException("Property not fund !!"));
    }

    @Override
    public String delete(UUID id) {
        propertyRepository.deleteById(id);
        return "Property deleted ";
    }
}
