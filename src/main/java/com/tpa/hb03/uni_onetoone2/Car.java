package com.tpa.hb03.uni_onetoone2;

import javax.persistence.*;

@Entity
@Table(name = "t_car")
public class Car {

    @Id
    private Integer id;
    @Column
    private String model;
    private int productionYear;



    public Car() {
    }

    public Car(Integer id, String model, int productionYear) {
        this.id = id;
        this.model = model;
        this.productionYear = productionYear;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear  +
                '}';
    }
}
