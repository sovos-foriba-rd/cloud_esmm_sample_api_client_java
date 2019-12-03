
package com.foriba.esmm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VKN_TCKN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GetDocDetails" type="{http://foriba.com/eSmm/}getDocumentRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vkntckn",
    "getDocDetails"
})
@XmlRootElement(name = "getDocumentRequest")
public class GetDocumentRequest {

    @XmlElement(name = "VKN_TCKN", required = true)
    protected String vkntckn;
    @XmlElement(name = "GetDocDetails", required = true)
    protected List<GetDocumentRequestType> getDocDetails;

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
     * Gets the value of the getDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetDocumentRequestType }
     * 
     * 
     */
    public List<GetDocumentRequestType> getGetDocDetails() {
        if (getDocDetails == null) {
            getDocDetails = new ArrayList<GetDocumentRequestType>();
        }
        return this.getDocDetails;
    }

}
