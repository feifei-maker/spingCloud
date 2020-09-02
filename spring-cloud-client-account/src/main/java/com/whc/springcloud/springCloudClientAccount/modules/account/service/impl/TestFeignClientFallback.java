package com.whc.springcloud.springCloudClientAccount.modules.account.service.impl;
import com.whc.springcloud.springCloudClientAccount.modules.account.entity.City;
import com.whc.springcloud.springCloudClientAccount.modules.account.service.TestFeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/**
 * ClassName: TestFeignClientFallback <br/>
 * Description: <br/>
 * date: 2020/8/31 15:00<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@Component
public class TestFeignClientFallback implements TestFeignClient {

    @Override
    public List<City> getCitiesByCountryId(int countryId)    {
        return new ArrayList<>();
    }
}

