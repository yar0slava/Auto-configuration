package starter.vehicles;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.vehicle",havingValue = "car")
public class Car implements Vehicle{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car");
    }
}
