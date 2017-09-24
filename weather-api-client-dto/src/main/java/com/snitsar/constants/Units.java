package com.snitsar.constants;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public enum Units {
    METRIC("metric"),
    IMPERIAL("imperial");

    private String unit;

    Units(String unit) {
        this.unit = unit;
    }


    @Override
    public String toString() {
        return unit;
    }
}
