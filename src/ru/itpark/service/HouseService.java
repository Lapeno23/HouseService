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
            String district,
            int price
    ) {
        House house = new House(name, 0, district, 0);
        repository.add(house);
    }

    public List<House> findAllByPrice(String price) {
        List<House> result = new ArrayList<House>();

        for (House house : result) {
            if (house.getPrice().)
        }

        return result;
    }
}
