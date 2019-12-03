
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
 *         &lt;element name="getReportList" type="{http://foriba.com/eSmm/}getReportListResponseType" maxOccurs="unbounded"/>
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
    "getReportList"
})
@XmlRootElement(name = "getReportListResponse")
public class GetReportListResponse {

    @XmlElement(required = true)
    protected List<GetReportListResponseType> getReportList;

    /**
     * Gets the value of the getReportList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getReportList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetReportList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetReportListResponseType }
     * 
     * 
     */
    public List<GetReportListResponseType> getGetReportList() {
        if (getReportList == null) {
            getReportList = new ArrayList<GetReportListResponseType>();
        }
        return this.getReportList;
    }

}
