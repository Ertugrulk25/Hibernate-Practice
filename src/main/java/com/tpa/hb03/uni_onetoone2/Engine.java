package com.tpa.hb03.uni_onetoone2;

import javax.persistence.*;

@Entity
@Table(name = "t_engine")
public class Engine {

    @Id
    private Integer id;
    @Column
    private String engineName;

    private int power;

    @OneToOne
    private Car car;

    public Engine() {
    }

    public Engine(Integer id, String engineName, int power) {
        this.id = id;
        this.engineName = engineName;
        this.power = power;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", engineName='" + engineName + '\'' +
                ", power=" + power  +
                '}';
    }
}
