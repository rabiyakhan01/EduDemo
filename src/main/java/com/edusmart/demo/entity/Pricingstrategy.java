package com.edusmart.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pricingstrategy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String strategykey;
    private String strategyvalue;

    public Pricingstrategy() {
    }

    public Pricingstrategy(String strategykey, String strategyValue) {
        this.strategykey = strategykey;
        this.strategyvalue = strategyValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrategykey() {
        return strategykey;
    }

    public void setStrategykey(String strategykey) {
        this.strategykey = strategykey;
    }

    public String getStrategyvalue() {
        return strategyvalue;
    }

    public void setStrategyvalue(String strategyvalue) {
        this.strategyvalue = strategyvalue;
    }

    @Override
    public String toString() {
        return "Pricingstrategy{" +
                "strategykey='" + strategykey + '\'' +
                ", strategyvalue='" + strategyvalue + '\'' +
                '}';
    }
}

