package aardwark.zadanie.celsiumtofafahrenheit.controllers;

import aardwark.zadanie.celsiumtofafahrenheit.models.Converter;
import aardwark.zadanie.celsiumtofafahrenheit.services.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/convertion" )
public class ConverterController {

    @Autowired
    private ConverterService converterService;

    @RequestMapping(method= RequestMethod.POST)
    public Map<String, Double> Convert(@RequestBody Converter converter){
        Map<String, Double> mapOfConvert = new HashMap<String, Double>();
        Double result = converterService.convert(converter.getType(), converter.getValue());
        mapOfConvert.put("result", result);
        return mapOfConvert;
    }
}
