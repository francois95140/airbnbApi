package com.example.airbnb.service;

import com.example.airbnb.modele.Property;

import java.util.List;
import java.util.UUID;

public interface PropertyService {
    Property create(Property property);

    List<Property> propertyList();

    Property update (UUID id,Property property);

    String delete (UUID id);
}
