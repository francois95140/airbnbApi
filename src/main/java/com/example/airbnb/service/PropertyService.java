package com.example.airbnb.service;

import com.example.airbnb.modele.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface PropertyService {
    Property create(Property property);

    Page<Property> propertyList(Pageable pageable);

    Property update (UUID id,Property property);

    String delete (UUID id);
}
