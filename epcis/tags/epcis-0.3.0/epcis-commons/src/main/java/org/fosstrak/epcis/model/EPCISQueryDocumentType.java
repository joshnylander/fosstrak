package org.accada.epcis.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

/**
 * <p>
 * Java class for EPCISQueryDocumentType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;EPCISQueryDocumentType&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base=&quot;{urn:epcglobal:xsd:1}Document&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;EPCISHeader&quot; type=&quot;{urn:epcglobal:epcis:xsd:1}EPCISHeaderType&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;EPCISBody&quot; type=&quot;{urn:epcglobal:epcis-query:xsd:1}EPCISQueryBodyType&quot;/&gt;
 *         &lt;element name=&quot;extension&quot; type=&quot;{urn:epcglobal:epcis-query:xsd:1}EPCISQueryDocumentExtensionType&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;any/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISQueryDocumentType", propOrder = { "epcisHeader", "epcisBody", "extension", "any" })
public class EPCISQueryDocumentType extends Document {

    @XmlElement(name = "EPCISHeader")
    protected EPCISHeaderType epcisHeader;
    @XmlElement(name = "EPCISBody", required = true)
    protected EPCISQueryBodyType epcisBody;
    protected EPCISQueryDocumentExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the epcisHeader property.
     * 
     * @return possible object is {@link EPCISHeaderType }
     */
    public EPCISHeaderType getEPCISHeader() {
        return epcisHeader;
    }

    /**
     * Sets the value of the epcisHeader property.
     * 
     * @param value
     *            allowed object is {@link EPCISHeaderType }
     */
    public void setEPCISHeader(EPCISHeaderType value) {
        this.epcisHeader = value;
    }

    /**
     * Gets the value of the epcisBody property.
     * 
     * @return possible object is {@link EPCISQueryBodyType }
     */
    public EPCISQueryBodyType getEPCISBody() {
        return epcisBody;
    }

    /**
     * Sets the value of the epcisBody property.
     * 
     * @param value
     *            allowed object is {@link EPCISQueryBodyType }
     */
    public void setEPCISBody(EPCISQueryBodyType value) {
        this.epcisBody = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return possible object is {@link EPCISQueryDocumentExtensionType }
     */
    public EPCISQueryDocumentExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *            allowed object is {@link EPCISQueryDocumentExtensionType }
     */
    public void setExtension(EPCISQueryDocumentExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element }
     * {@link Object }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
