//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.11.07 às 12:09:13 PM BRT 
//


package br.com.massao.webservices.cep.correios.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoEmbalagem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoEmbalagem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="PD"/&gt;
 *     &lt;enumeration value="RL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoEmbalagem")
@XmlEnum
public enum TipoEmbalagem {

    DE,
    PD,
    RL;

    public String value() {
        return name();
    }

    public static TipoEmbalagem fromValue(String v) {
        return valueOf(v);
    }

}
