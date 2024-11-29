package com.example.airbnb.modele;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "PROPERTY")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NonNull
    private String name;
    @NonNull
    private String description;

    private Double pricePerNight;

    @CreationTimestamp
    private LocalDateTime creatAt ;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
