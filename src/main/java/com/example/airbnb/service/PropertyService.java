package com.example.airbnb.service;

import com.example.airbnb.modele.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface PropertyService {
    Property create(Property property);

    Page<Property> propertyList(Pageable pageable);

    Property update (UUID id,Property property);

    Property getOne (UUID id);

    String delete (UUID id);
}
