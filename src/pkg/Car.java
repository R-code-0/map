package pkg;

import java.util.Objects;

public class Car {
    private String id;

    public Car(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id + " ";
    }

    public void setId(String id) {
        this.id = id;
    }
}

