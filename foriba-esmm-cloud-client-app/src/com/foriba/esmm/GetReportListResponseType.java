
package com.foriba.esmm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getReportListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReportListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VKN_TCKN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SectionStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SectionEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CanceledDocumentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CanceledDocumentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GIBStatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GIBStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameters" type="{http://foriba.com/eSmm/}ParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportListResponseType", propOrder = {
    "uuid",
    "vkntckn",
    "type",
    "docType",
    "year",
    "month",
    "sectionStartDate",
    "sectionEndDate",
    "partNumber",
    "documentCount",
    "documentTotalAmount",
    "canceledDocumentCount",
    "canceledDocumentTotalAmount",
    "gibStatusCode",
    "gibStatusDesc",
    "parameters"
})
public class GetReportListResponseType {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "VKN_TCKN", required = true)
    protected String vkntckn;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "DocType", required = true)
    protected String docType;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "SectionStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sectionStartDate;
    @XmlElement(name = "SectionEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sectionEndDate;
    @XmlElement(name = "PartNumber")
    protected int partNumber;
    @XmlElement(name = "DocumentCount")
    protected int documentCount;
    @XmlElement(name = "DocumentTotalAmount", required = true)
    protected BigDecimal documentTotalAmount;
    @XmlElement(name = "CanceledDocumentCount")
    protected int canceledDocumentCount;
    @XmlElement(name = "CanceledDocumentTotalAmount", required = true)
    protected BigDecimal canceledDocumentTotalAmount;
    @XmlElement(name = "GIBStatusCode")
    protected int gibStatusCode;
    @XmlElement(name = "GIBStatusDesc", required = true)
    protected String gibStatusDesc;
    @XmlElement(name = "Parameters")
    protected List<ParametersType> parameters;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the vkntckn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKNTCKN() {
        return vkntckn;
    }

    /**
     * Sets the value of the vkntckn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKNTCKN(String value) {
        this.vkntckn = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the sectionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSectionStartDate() {
        return sectionStartDate;
    }

    /**
     * Sets the value of the sectionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSectionStartDate(XMLGregorianCalendar value) {
        this.sectionStartDate = value;
    }

    /**
     * Gets the value of the sectionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSectionEndDate() {
        return sectionEndDate;
    }

    /**
     * Sets the value of the sectionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSectionEndDate(XMLGregorianCalendar value) {
        this.sectionEndDate = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     */
    public void setPartNumber(int value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the documentCount property.
     * 
     */
    public int getDocumentCount() {
        return documentCount;
    }

    /**
     * Sets the value of the documentCount property.
     * 
     */
    public void setDocumentCount(int value) {
        this.documentCount = value;
    }

    /**
     * Gets the value of the documentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocumentTotalAmount() {
        return documentTotalAmount;
    }

    /**
     * Sets the value of the documentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocumentTotalAmount(BigDecimal value) {
        this.documentTotalAmount = value;
    }

    /**
     * Gets the value of the canceledDocumentCount property.
     * 
     */
    public int getCanceledDocumentCount() {
        return canceledDocumentCount;
    }

    /**
     * Sets the value of the canceledDocumentCount property.
     * 
     */
    public void setCanceledDocumentCount(int value) {
        this.canceledDocumentCount = value;
    }

    /**
     * Gets the value of the canceledDocumentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCanceledDocumentTotalAmount() {
        return canceledDocumentTotalAmount;
    }

    /**
     * Sets the value of the canceledDocumentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCanceledDocumentTotalAmount(BigDecimal value) {
        this.canceledDocumentTotalAmount = value;
    }

    /**
     * Gets the value of the gibStatusCode property.
     * 
     */
    public int getGIBStatusCode() {
        return gibStatusCode;
    }

    /**
     * Sets the value of the gibStatusCode property.
     * 
     */
    public void setGIBStatusCode(int value) {
        this.gibStatusCode = value;
    }

    /**
     * Gets the value of the gibStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIBStatusDesc() {
        return gibStatusDesc;
    }

    /**
     * Sets the value of the gibStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIBStatusDesc(String value) {
        this.gibStatusDesc = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersType }
     * 
     * 
     */
    public List<ParametersType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<ParametersType>();
        }
        return this.parameters;
    }

}
