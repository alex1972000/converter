package aardwark.zadanie.celsiumtofafahrenheit.constants;

import java.util.function.Function;

public class ConversionConstants {

    public static final Function<Double, Double> FahrenheitToCelsium = a -> (a - 32) / 1.8;
    public static final Function<Double, Double> CelsiumToFahrenheit = a -> a * 1.8 + 32;
}
