package com.izgnod.dubbo.provider;


import com.izgnod.dubbo.api.ProviderService;

/**
 * @author: izgnod.
 * @date: 2021/4/30
 * @description:
 */
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String word) {
        return "say :" + word;
    }
}
