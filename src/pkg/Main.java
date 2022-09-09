package pkg;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,Car_detail> cars = new HashMap<>();
        cars.put(new Car("12345F"),new Car_detail(2002,9999,"Red","Audi"));
        cars.put(new Car("K1316F"),new Car_detail(2019,12345,"White","BMW"));
        cars.put(new Car("N001"),new Car_detail(2290,5,"White","Cardboard"));
        cars.put(new Car("15F730"),new Car_detail(2030,795000,"Black","Tesla"));
        for (Car car : cars.keySet()) {
            System.out.println(car.getId() + cars.get(car));
        }
    }
}