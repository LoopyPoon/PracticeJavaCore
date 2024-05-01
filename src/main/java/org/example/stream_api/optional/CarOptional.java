package org.example.stream_api.optional;

public class CarOptional {
    private Car value;

    private CarOptional(Car value) {
        this.value = value;
    }

    public static CarOptional of(Car value) {
        if (value == null) {
            throw new RuntimeException("У машины значение null");
        }
        return new CarOptional(value);
    }

    public static CarOptional ofNullable(Car value) {
        return new CarOptional(value);
    }

    public Car orElse(Car carDefault) {
        if (value == null) {
            return carDefault;
        }
        return value;
    }

    public Car get() {
        return this.value;
    }
}
