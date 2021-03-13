package starter.vehicles;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.vehicle",havingValue = "lorry")
public class Lorry implements Vehicle{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Lorry");
    }
}
