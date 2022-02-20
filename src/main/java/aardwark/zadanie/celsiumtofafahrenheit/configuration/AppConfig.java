package aardwark.zadanie.celsiumtofafahrenheit.configuration;

import aardwark.zadanie.celsiumtofafahrenheit.services.ConverterService;
import aardwark.zadanie.celsiumtofafahrenheit.services.ConverterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean(name = "getConverterService")
    public ConverterService getConverterService(){
        return new ConverterServiceImpl();
    }
}

