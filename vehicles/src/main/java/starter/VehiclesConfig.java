package starter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import starter.vehicles.Vehicle;

@Configuration
@ComponentScan(basePackageClasses = Vehicle.class)
public class VehiclesConfig {
}
