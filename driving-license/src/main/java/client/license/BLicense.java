package client.license;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;
import starter.vehicles.Lorry;

@Component
@ConditionalOnMissingBean(Lorry.class)
public class BLicense implements License{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BLicense");
    }
}
