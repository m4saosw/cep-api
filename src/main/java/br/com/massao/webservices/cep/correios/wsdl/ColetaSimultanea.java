//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.11.07 às 12:09:13 PM BRT 
//


package br.com.massao.webservices.cep.correios.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de coletaSimultanea complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="coletaSimultanea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coleta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaSimultanea", propOrder = {
    "obj",
    "obs"
})
public class ColetaSimultanea
    extends Coleta
{

    protected String obj;
    protected String obs;

    /**
     * Obtém o valor da propriedade obj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObj() {
        return obj;
    }

    /**
     * Define o valor da propriedade obj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObj(String value) {
        this.obj = value;
    }

    /**
     * Obtém o valor da propriedade obs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Define o valor da propriedade obs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

}
