package com.example.src.bhavioural;

import com.example.behavioural.strategy.maps.FourWheelerStrategy;
import com.example.behavioural.strategy.maps.NavigationStrategy;
import com.example.behavioural.strategy.maps.Navigator;
import com.example.behavioural.strategy.maps.TwoWheelerStrategy;
import org.junit.jupiter.api.Test;

public class NavigatorTest {
    @Test
    void testBullet(){
        // HSR --> Indira Nagar
        TwoWheelerStrategy strategy=new TwoWheelerStrategy();
        Navigator navigator=new Navigator(strategy); // Dependency Injection
        System.out.println(navigator.navigate("HSR","Indira Nagar"));

        //Car
        NavigationStrategy fourwheeler = new FourWheelerStrategy();
        navigator.setNavigationStrategy(fourwheeler);
        System.out.println(navigator.navigate("Delhi","Mumbai"));

    }
}
