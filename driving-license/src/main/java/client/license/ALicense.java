package client.license;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import starter.vehicles.Motorcycle;

@Component
@ConditionalOnBean(Motorcycle.class)
public class ALicense implements License{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ALicense");
    }
}
