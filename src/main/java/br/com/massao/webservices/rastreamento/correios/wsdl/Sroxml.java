//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.11.07 às 09:51:26 PM BRT 
//


package br.com.massao.webservices.rastreamento.correios.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sroxml complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sroxml"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="versao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoPesquisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}objeto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sroxml", propOrder = {
    "versao",
    "qtd",
    "tipoPesquisa",
    "tipoResultado",
    "objeto"
})
public class Sroxml {

    protected String versao;
    protected String qtd;
    @XmlElement(name = "TipoPesquisa")
    protected String tipoPesquisa;
    @XmlElement(name = "TipoResultado")
    protected String tipoResultado;
    //@XmlElement(namespace = "http://resource.webservice.correios.com.br/")
    protected List<Objeto> objeto;

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade qtd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtd() {
        return qtd;
    }

    /**
     * Define o valor da propriedade qtd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtd(String value) {
        this.qtd = value;
    }

    /**
     * Obtém o valor da propriedade tipoPesquisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPesquisa() {
        return tipoPesquisa;
    }

    /**
     * Define o valor da propriedade tipoPesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPesquisa(String value) {
        this.tipoPesquisa = value;
    }

    /**
     * Obtém o valor da propriedade tipoResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoResultado() {
        return tipoResultado;
    }

    /**
     * Define o valor da propriedade tipoResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoResultado(String value) {
        this.tipoResultado = value;
    }

    /**
     * Gets the value of the objeto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objeto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjeto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objeto }
     * 
     * 
     */
    public List<Objeto> getObjeto() {
        if (objeto == null) {
            objeto = new ArrayList<Objeto>();
        }
        return this.objeto;
    }

}