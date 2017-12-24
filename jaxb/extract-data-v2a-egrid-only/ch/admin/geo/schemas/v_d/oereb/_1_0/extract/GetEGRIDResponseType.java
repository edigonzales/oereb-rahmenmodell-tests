//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.16 at 01:42:49 PM CET 
//


package ch.admin.geo.schemas.v_d.oereb._1_0.extract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEGRIDResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEGRIDResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="egrid" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="identDN" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEGRIDResponseType", propOrder = {
    "egridAndNumberAndIdentDN"
})
public class GetEGRIDResponseType {

    @XmlElementRefs({
        @XmlElementRef(name = "identDN", namespace = "http://schemas.geo.admin.ch/V_D/OeREB/1.0/Extract", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "egrid", namespace = "http://schemas.geo.admin.ch/V_D/OeREB/1.0/Extract", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "number", namespace = "http://schemas.geo.admin.ch/V_D/OeREB/1.0/Extract", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> egridAndNumberAndIdentDN;

    /**
     * Gets the value of the egridAndNumberAndIdentDN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egridAndNumberAndIdentDN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEgridAndNumberAndIdentDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getEgridAndNumberAndIdentDN() {
        if (egridAndNumberAndIdentDN == null) {
            egridAndNumberAndIdentDN = new ArrayList<JAXBElement<String>>();
        }
        return this.egridAndNumberAndIdentDN;
    }

}
