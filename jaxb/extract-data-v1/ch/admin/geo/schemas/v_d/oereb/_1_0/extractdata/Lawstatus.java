//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.16 at 12:11:56 PM CET 
//


package ch.admin.geo.schemas.v_d.oereb._1_0.extractdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lawstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lawstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}LawstatusCode"/>
 *         &lt;element name="Text" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}LocalisedText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lawstatus", propOrder = {
    "code",
    "text"
})
public class Lawstatus {

    @XmlElement(name = "Code", required = true)
    @XmlSchemaType(name = "string")
    protected LawstatusCode code;
    @XmlElement(name = "Text", required = true)
    protected LocalisedText text;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link LawstatusCode }
     *     
     */
    public LawstatusCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link LawstatusCode }
     *     
     */
    public void setCode(LawstatusCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link LocalisedText }
     *     
     */
    public LocalisedText getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisedText }
     *     
     */
    public void setText(LocalisedText value) {
        this.text = value;
    }

}
