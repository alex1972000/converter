package aardwark.zadanie.celsiumtofafahrenheit.services;


import aardwark.zadanie.celsiumtofafahrenheit.constants.ConversionConstants;
import aardwark.zadanie.celsiumtofafahrenheit.exceptions.ConversionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("converterService")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class ConverterServiceImpl implements ConverterService{

    @Override
    public Double convert(String type, double value) {
        if("FahrenheitToCelsium".equals(type)){
            return ConversionConstants.FahrenheitToCelsium.apply(value);
        }else if("CelsiumToFahrenheit".equals(type)){
            return ConversionConstants.CelsiumToFahrenheit.apply(value);
        }
        throw new ConversionException("Convertion not sucessful");
    }
}
