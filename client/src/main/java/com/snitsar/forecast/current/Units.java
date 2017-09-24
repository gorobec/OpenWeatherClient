
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for units.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="units">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="METRIC"/>
 *     &lt;enumeration value="IMPERIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "units")
@XmlEnum
public enum Units {

    METRIC,
    IMPERIAL;

    public String value() {
        return name();
    }

    public static Units fromValue(String v) {
        return valueOf(v);
    }

}
