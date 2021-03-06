/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_HSLEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_HSLEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="hue" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveFixedAngle" default="0" />
 *       &lt;attribute name="sat" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_FixedPercentage" default="0" />
 *       &lt;attribute name="lum" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_FixedPercentage" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_HSLEffect")
public class CTHSLEffect {

    @XmlAttribute
    protected Integer hue;
    @XmlAttribute
    protected Integer sat;
    @XmlAttribute
    protected Integer lum;

    /**
     * Gets the value of the hue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHue() {
        if (hue == null) {
            return  0;
        } else {
            return hue;
        }
    }

    /**
     * Sets the value of the hue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHue(Integer value) {
        this.hue = value;
    }

    /**
     * Gets the value of the sat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSat() {
        if (sat == null) {
            return  0;
        } else {
            return sat;
        }
    }

    /**
     * Sets the value of the sat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSat(Integer value) {
        this.sat = value;
    }

    /**
     * Gets the value of the lum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLum() {
        if (lum == null) {
            return  0;
        } else {
            return lum;
        }
    }

    /**
     * Sets the value of the lum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLum(Integer value) {
        this.lum = value;
    }

}
