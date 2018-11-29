package ru.itpark.domain;

public class House {
    private String house;
    private int price;
    private String district;

    public House(String house, int price, String district) {
        this.house = house;
        this.price = price;
        this.district = district;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "House{" +
                "house=" + house +
                ", price=" + price +
                ", district='" + district + '\'' +
                '}';
    }
}
