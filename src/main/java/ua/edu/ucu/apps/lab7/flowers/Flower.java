package ua.edu.ucu.apps.lab7.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@Getter
@Entity
@NoArgsConstructor
public class Flower {
    @Id
    private Integer id;
    private FlowerColor colour;
    private double price;
    private double sepallength;
}
