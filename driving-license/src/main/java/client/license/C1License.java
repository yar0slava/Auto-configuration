package client.license;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import starter.vehicles.Lorry;

@Component
@ConditionalOnBean(Lorry.class)
public class C1License implements License{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("C1License");
    }
}
