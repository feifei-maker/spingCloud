package com.whc.springcloud.springCloudClientAccount.modules.account.service;

import com.whc.springcloud.springCloudClientAccount.modules.account.entity.City;
import com.whc.springcloud.springCloudClientAccount.modules.account.service.impl.TestFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName: TestFeignClient <br/>
 * Description: <br/>
 * date: 2020/8/31 14:59<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@FeignClient(value = "CLIENT-TEST", fallback = TestFeignClientFallback.class)
@Primary
public interface TestFeignClient {
    /**
     *127.0.0.1:8762/api/cities/2 ----get
     */
    @GetMapping("/api/cities/{countryId}")
    List<City> getCitiesByCountryId(@PathVariable int countryId);
}

