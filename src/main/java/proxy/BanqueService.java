
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.edu.abenali/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://ws.edu.abenali/", className = "proxy.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://ws.edu.abenali/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws.edu.abenali/BanqueService/convertRequest", output = "http://ws.edu.abenali/BanqueService/convertResponse")
    public double convert(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://ws.edu.abenali/", className = "proxy.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://ws.edu.abenali/", className = "proxy.GetComptesResponse")
    @Action(input = "http://ws.edu.abenali/BanqueService/getComptesRequest", output = "http://ws.edu.abenali/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.edu.abenali/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.edu.abenali/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws.edu.abenali/BanqueService/getCompteRequest", output = "http://ws.edu.abenali/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
