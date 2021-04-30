package com.izgnod.dubbo.provider;


import com.izgnod.dubbo.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: izgnod.
 * @date: 2021/4/30
 * @description:
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String word) {
        return "say :" + word;
    }
}
