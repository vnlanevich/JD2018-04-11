//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.06.17 at 11:14:04 AM EET 
//


package by.it.krivenkova.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Route complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepTown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrTown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Price" type="{http://jd02_09.krivenkova.it.by}Price"/&gt;
 *         &lt;element name="NumTickets" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "depTown",
    "depDate",
    "depTime",
    "arrTown",
    "price",
    "numTickets"
})
public class Route {

    @XmlElement(name = "DepTown", required = true)
    protected String depTown;
    @XmlElement(name = "DepDate", required = true)
    protected String depDate;
    @XmlElement(name = "DepTime", required = true)
    protected String depTime;
    @XmlElement(name = "ArrTown", required = true)
    protected String arrTown;
    @XmlElement(name = "Price", required = true)
    protected Price price;
    @XmlElement(name = "NumTickets", required = true)
    protected BigInteger numTickets;

    /**
     * Gets the value of the depTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTown() {
        return depTown;
    }

    /**
     * Sets the value of the depTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTown(String value) {
        this.depTown = value;
    }

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepDate(String value) {
        this.depDate = value;
    }

    /**
     * Gets the value of the depTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTime() {
        return depTime;
    }

    /**
     * Sets the value of the depTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTime(String value) {
        this.depTime = value;
    }

    /**
     * Gets the value of the arrTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTown() {
        return arrTown;
    }

    /**
     * Sets the value of the arrTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTown(String value) {
        this.arrTown = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the numTickets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumTickets() {
        return numTickets;
    }

    /**
     * Sets the value of the numTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumTickets(BigInteger value) {
        this.numTickets = value;
    }

}
