package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;

import java.math.BigDecimal;

public class Bedroom implements Floor {

    BigDecimal width;

    @Override
    public BigDecimal getArea() {
        return width.pow(2);
    }
}
