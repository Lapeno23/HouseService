package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public void add(
            String name,
            String district
    ) {
        House house = new House(name, 0, district, 0);
        repository.add(house);
    }

    public List<House> findAllByName(String name) {
        List<House> result = new ArrayList<House>();

        name = name.toLowerCase();

        for (House house : repository.getAll()) {
            if (house.getName().toLowerCase().contains(name)) {
                result.add(house);
            }
        }
        return result;
    }
}
