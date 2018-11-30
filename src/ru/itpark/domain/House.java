package ru.itpark.domain;

public class House {
    private int id;
    private String name;
    private int price;
    private String district;

    public House(String name, int price, String district, int id) {
        this.name = name;
        this.price = price;
        this.district = district;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDistrict(String district) {
        this.district = district;


    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", district='" + district + '\'' +
                '}';
    }
}
