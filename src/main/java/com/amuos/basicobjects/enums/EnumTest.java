package com.amuos.basicobjects.enums;

import org.junit.Test;

/**
 * Created by juan.wang on 2/27/18.
 */
public class EnumTest {

    @Test
    public void testPlanet() {
        Planet earth = Planet.EARTH;
        System.out.println(
                String.format("Earth mass is %s; Earth radius is %s; Earch surface gravity is %s.", earth.mass(),
                        earth.radius(), earth.surfaceGravity()));


        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(p.mass()));
        }
    }

}
