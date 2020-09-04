package com.akandrewkoch.testApp.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Thing {

    @Id
    private Integer thingNumber;

    public Thing (){}

    public Thing(Integer thingNumber){
        this.thingNumber=thingNumber;
    }

    public Integer getThingNumber() {
        return thingNumber;
    }

    public void setThingNumber(Integer thingNumber) {
        this.thingNumber = thingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing)) return false;
        Thing thing = (Thing) o;
        return Objects.equals(getThingNumber(), thing.getThingNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getThingNumber());
    }

    @Override
    public String toString() {
        return "Thing{" + "thingNumber=" + thingNumber + '}';
    }
}
