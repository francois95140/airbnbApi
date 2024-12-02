package com.example.airbnb.service;

import com.example.airbnb.modele.Property;
import com.example.airbnb.repository.PropertyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
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
    public Page<Property> propertyList(Pageable pageable) {
        return propertyRepository.findAll(pageable);
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
    public Property getOne(UUID id) {
        return propertyRepository.findById(id).orElseThrow(() -> new RuntimeException("Property not fund !!"));
    }


    @Override
    public String delete(UUID id) {
        propertyRepository.deleteById(id);
        return "Property deleted ";
    }
}
