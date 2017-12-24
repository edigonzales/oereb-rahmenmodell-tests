//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.16 at 01:25:39 PM CET 
//


package ch.admin.geo.schemas.v_d.oereb._1_0.extractdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DocumentBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="LegalProvision"/>
 *               &lt;enumeration value="Law"/>
 *               &lt;enumeration value="Hint"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextAtWeb" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualUri" minOccurs="0"/>
 *         &lt;element name="Lawstatus" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Lawstatus"/>
 *         &lt;element ref="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentBase", propOrder = {
    "documentType",
    "textAtWeb",
    "lawstatus",
    "extensions"
})
@XmlSeeAlso({
    Article.class,
    Document.class
})
public class DocumentBase {

    @XmlElement(name = "DocumentType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String documentType;
    @XmlElement(name = "TextAtWeb")
    protected MultilingualUri textAtWeb;
    @XmlElement(name = "Lawstatus", required = true)
    protected Lawstatus lawstatus;
    protected Extensions extensions;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the textAtWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualUri }
     *     
     */
    public MultilingualUri getTextAtWeb() {
        return textAtWeb;
    }

    /**
     * Sets the value of the textAtWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualUri }
     *     
     */
    public void setTextAtWeb(MultilingualUri value) {
        this.textAtWeb = value;
    }

    /**
     * Gets the value of the lawstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Lawstatus }
     *     
     */
    public Lawstatus getLawstatus() {
        return lawstatus;
    }

    /**
     * Sets the value of the lawstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lawstatus }
     *     
     */
    public void setLawstatus(Lawstatus value) {
        this.lawstatus = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
