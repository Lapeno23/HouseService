package ru.itpark.repository;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<House> houses = new ArrayList<>();

    public void add(House item) {
        houses.add(item);
    }

    public List<House> getAll() {
        return houses;
    }
}