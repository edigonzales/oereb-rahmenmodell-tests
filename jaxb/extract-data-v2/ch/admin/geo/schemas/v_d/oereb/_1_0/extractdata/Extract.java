//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.16 at 01:25:39 PM CET 
//


package ch.admin.geo.schemas.v_d.oereb._1_0.extractdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for Extract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="2009-01-01T00:00:00.000"/>
 *               &lt;maxInclusive value="2999-12-31T23:59:59.000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConcernedTheme" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotConcernedTheme" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeWithoutData" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isReduced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="LogoPLRCadastre" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="LogoPLRCadastreRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="FederalLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="FederalLogoRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="CantonalLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="CantonalLogoRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="MunicipalityLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="MunicipalityLogoRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;element name="ExtractIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="QRCode" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="QRCodeRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;element name="GeneralInformation" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualMText" minOccurs="0"/>
 *         &lt;element name="BaseData" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualMText"/>
 *         &lt;element name="Glossary" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Glossary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RealEstate" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}RealEstate_DPR"/>
 *         &lt;element name="ExclusionOfLiability" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}ExclusionOfLiability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PLRCadastreAuthority" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Office"/>
 *         &lt;element name="Certification" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualMText" minOccurs="0"/>
 *         &lt;element name="CertificationAtWeb" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualUri" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extract", propOrder = {
    "creationDate",
    "concernedTheme",
    "notConcernedTheme",
    "themeWithoutData",
    "isReduced",
    "logoPLRCadastre",
    "logoPLRCadastreRef",
    "federalLogo",
    "federalLogoRef",
    "cantonalLogo",
    "cantonalLogoRef",
    "municipalityLogo",
    "municipalityLogoRef",
    "extractIdentifier",
    "qrCode",
    "qrCodeRef",
    "generalInformation",
    "baseData",
    "glossary",
    "realEstate",
    "exclusionOfLiability",
    "plrCadastreAuthority",
    "certification",
    "certificationAtWeb",
    "extensions"
})
public class Extract {

    @XmlElement(name = "CreationDate", required = true)
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "ConcernedTheme")
    protected List<Theme> concernedTheme;
    @XmlElement(name = "NotConcernedTheme")
    protected List<Theme> notConcernedTheme;
    @XmlElement(name = "ThemeWithoutData")
    protected List<Theme> themeWithoutData;
    protected boolean isReduced;
    @XmlElement(name = "LogoPLRCadastre")
    protected byte[] logoPLRCadastre;
    @XmlElement(name = "LogoPLRCadastreRef")
    @XmlSchemaType(name = "anyURI")
    protected String logoPLRCadastreRef;
    @XmlElement(name = "FederalLogo")
    protected byte[] federalLogo;
    @XmlElement(name = "FederalLogoRef")
    @XmlSchemaType(name = "anyURI")
    protected String federalLogoRef;
    @XmlElement(name = "CantonalLogo")
    protected byte[] cantonalLogo;
    @XmlElement(name = "CantonalLogoRef")
    @XmlSchemaType(name = "anyURI")
    protected String cantonalLogoRef;
    @XmlElement(name = "MunicipalityLogo")
    protected byte[] municipalityLogo;
    @XmlElement(name = "MunicipalityLogoRef")
    @XmlSchemaType(name = "anyURI")
    protected String municipalityLogoRef;
    @XmlElement(name = "ExtractIdentifier", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extractIdentifier;
    @XmlElement(name = "QRCode")
    protected byte[] qrCode;
    @XmlElement(name = "QRCodeRef")
    @XmlSchemaType(name = "anyURI")
    protected String qrCodeRef;
    @XmlElement(name = "GeneralInformation")
    protected MultilingualMText generalInformation;
    @XmlElement(name = "BaseData", required = true)
    protected MultilingualMText baseData;
    @XmlElement(name = "Glossary")
    protected List<Glossary> glossary;
    @XmlElement(name = "RealEstate", required = true)
    protected RealEstateDPR realEstate;
    @XmlElement(name = "ExclusionOfLiability")
    protected List<ExclusionOfLiability> exclusionOfLiability;
    @XmlElement(name = "PLRCadastreAuthority", required = true)
    protected Office plrCadastreAuthority;
    @XmlElement(name = "Certification")
    protected MultilingualMText certification;
    @XmlElement(name = "CertificationAtWeb")
    protected MultilingualUri certificationAtWeb;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the concernedTheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concernedTheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcernedTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Theme }
     * 
     * 
     */
    public List<Theme> getConcernedTheme() {
        if (concernedTheme == null) {
            concernedTheme = new ArrayList<Theme>();
        }
        return this.concernedTheme;
    }

    /**
     * Gets the value of the notConcernedTheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notConcernedTheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotConcernedTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Theme }
     * 
     * 
     */
    public List<Theme> getNotConcernedTheme() {
        if (notConcernedTheme == null) {
            notConcernedTheme = new ArrayList<Theme>();
        }
        return this.notConcernedTheme;
    }

    /**
     * Gets the value of the themeWithoutData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeWithoutData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeWithoutData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Theme }
     * 
     * 
     */
    public List<Theme> getThemeWithoutData() {
        if (themeWithoutData == null) {
            themeWithoutData = new ArrayList<Theme>();
        }
        return this.themeWithoutData;
    }

    /**
     * Gets the value of the isReduced property.
     * 
     */
    public boolean isIsReduced() {
        return isReduced;
    }

    /**
     * Sets the value of the isReduced property.
     * 
     */
    public void setIsReduced(boolean value) {
        this.isReduced = value;
    }

    /**
     * Gets the value of the logoPLRCadastre property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogoPLRCadastre() {
        return logoPLRCadastre;
    }

    /**
     * Sets the value of the logoPLRCadastre property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogoPLRCadastre(byte[] value) {
        this.logoPLRCadastre = value;
    }

    /**
     * Gets the value of the logoPLRCadastreRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoPLRCadastreRef() {
        return logoPLRCadastreRef;
    }

    /**
     * Sets the value of the logoPLRCadastreRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoPLRCadastreRef(String value) {
        this.logoPLRCadastreRef = value;
    }

    /**
     * Gets the value of the federalLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFederalLogo() {
        return federalLogo;
    }

    /**
     * Sets the value of the federalLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFederalLogo(byte[] value) {
        this.federalLogo = value;
    }

    /**
     * Gets the value of the federalLogoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalLogoRef() {
        return federalLogoRef;
    }

    /**
     * Sets the value of the federalLogoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalLogoRef(String value) {
        this.federalLogoRef = value;
    }

    /**
     * Gets the value of the cantonalLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCantonalLogo() {
        return cantonalLogo;
    }

    /**
     * Sets the value of the cantonalLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCantonalLogo(byte[] value) {
        this.cantonalLogo = value;
    }

    /**
     * Gets the value of the cantonalLogoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantonalLogoRef() {
        return cantonalLogoRef;
    }

    /**
     * Sets the value of the cantonalLogoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantonalLogoRef(String value) {
        this.cantonalLogoRef = value;
    }

    /**
     * Gets the value of the municipalityLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMunicipalityLogo() {
        return municipalityLogo;
    }

    /**
     * Sets the value of the municipalityLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMunicipalityLogo(byte[] value) {
        this.municipalityLogo = value;
    }

    /**
     * Gets the value of the municipalityLogoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityLogoRef() {
        return municipalityLogoRef;
    }

    /**
     * Sets the value of the municipalityLogoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityLogoRef(String value) {
        this.municipalityLogoRef = value;
    }

    /**
     * Gets the value of the extractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractIdentifier() {
        return extractIdentifier;
    }

    /**
     * Sets the value of the extractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractIdentifier(String value) {
        this.extractIdentifier = value;
    }

    /**
     * Gets the value of the qrCode property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQRCode() {
        return qrCode;
    }

    /**
     * Sets the value of the qrCode property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQRCode(byte[] value) {
        this.qrCode = value;
    }

    /**
     * Gets the value of the qrCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQRCodeRef() {
        return qrCodeRef;
    }

    /**
     * Sets the value of the qrCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQRCodeRef(String value) {
        this.qrCodeRef = value;
    }

    /**
     * Gets the value of the generalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualMText }
     *     
     */
    public MultilingualMText getGeneralInformation() {
        return generalInformation;
    }

    /**
     * Sets the value of the generalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualMText }
     *     
     */
    public void setGeneralInformation(MultilingualMText value) {
        this.generalInformation = value;
    }

    /**
     * Gets the value of the baseData property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualMText }
     *     
     */
    public MultilingualMText getBaseData() {
        return baseData;
    }

    /**
     * Sets the value of the baseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualMText }
     *     
     */
    public void setBaseData(MultilingualMText value) {
        this.baseData = value;
    }

    /**
     * Gets the value of the glossary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glossary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlossary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glossary }
     * 
     * 
     */
    public List<Glossary> getGlossary() {
        if (glossary == null) {
            glossary = new ArrayList<Glossary>();
        }
        return this.glossary;
    }

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateDPR }
     *     
     */
    public RealEstateDPR getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateDPR }
     *     
     */
    public void setRealEstate(RealEstateDPR value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the exclusionOfLiability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionOfLiability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionOfLiability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionOfLiability }
     * 
     * 
     */
    public List<ExclusionOfLiability> getExclusionOfLiability() {
        if (exclusionOfLiability == null) {
            exclusionOfLiability = new ArrayList<ExclusionOfLiability>();
        }
        return this.exclusionOfLiability;
    }

    /**
     * Gets the value of the plrCadastreAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getPLRCadastreAuthority() {
        return plrCadastreAuthority;
    }

    /**
     * Sets the value of the plrCadastreAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setPLRCadastreAuthority(Office value) {
        this.plrCadastreAuthority = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualMText }
     *     
     */
    public MultilingualMText getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualMText }
     *     
     */
    public void setCertification(MultilingualMText value) {
        this.certification = value;
    }

    /**
     * Gets the value of the certificationAtWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualUri }
     *     
     */
    public MultilingualUri getCertificationAtWeb() {
        return certificationAtWeb;
    }

    /**
     * Sets the value of the certificationAtWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualUri }
     *     
     */
    public void setCertificationAtWeb(MultilingualUri value) {
        this.certificationAtWeb = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
