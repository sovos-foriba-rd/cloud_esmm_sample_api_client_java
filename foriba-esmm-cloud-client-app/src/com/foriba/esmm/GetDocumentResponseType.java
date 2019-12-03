
package com.foriba.esmm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustDocID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ViewType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getDocumentResponseType", propOrder = {
    "uuid",
    "id",
    "custDocID",
    "type",
    "docType",
    "viewType",
    "docData",
    "result",
    "resultDescription",
    "parameters"
})
public class GetDocumentResponseType {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "CustDocID", required = true)
    protected String custDocID;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "DocType", required = true)
    protected String docType;
    @XmlElement(name = "ViewType", required = true)
    protected String viewType;
    @XmlElement(name = "DocData", required = true)
    protected byte[] docData;
    @XmlElement(name = "Result")
    protected int result;
    @XmlElement(name = "ResultDescription")
    protected String resultDescription;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the custDocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDocID() {
        return custDocID;
    }

    /**
     * Sets the value of the custDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDocID(String value) {
        this.custDocID = value;
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
     * Gets the value of the viewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewType() {
        return viewType;
    }

    /**
     * Sets the value of the viewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewType(String value) {
        this.viewType = value;
    }

    /**
     * Gets the value of the docData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocData() {
        return docData;
    }

    /**
     * Sets the value of the docData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocData(byte[] value) {
        this.docData = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
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
