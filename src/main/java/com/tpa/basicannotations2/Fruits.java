package com.tpa.basicannotations2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_fruits")
public class Fruits {

    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String productionSite;
    @Column
    private int kg;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionSite() {
        return productionSite;
    }

    public void setProductionSite(String productionSite) {
        this.productionSite = productionSite;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productionSite='" + productionSite + '\'' +
                ", kg=" + kg +
                '}';
    }
}
