//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.13 at 08:50:26 PM IST 
//


package in.karthifairhawn.emp;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.karthifairhawn.emp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.karthifairhawn.emp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeDetailsRequest }
     * 
     */
    public GetEmployeeDetailsRequest createGetEmployeeDetailsRequest() {
        return new GetEmployeeDetailsRequest();
    }

    /**
     * Create an instance of {@link GetEmployeeDetailsResponse }
     * 
     */
    public GetEmployeeDetailsResponse createGetEmployeeDetailsResponse() {
        return new GetEmployeeDetailsResponse();
    }

    /**
     * Create an instance of {@link EmpDetails }
     * 
     */
    public EmpDetails createEmpDetails() {
        return new EmpDetails();
    }

    /**
     * Create an instance of {@link DeleteEmployeeDetailsRequest }
     * 
     */
    public DeleteEmployeeDetailsRequest createDeleteEmployeeDetailsRequest() {
        return new DeleteEmployeeDetailsRequest();
    }

    /**
     * Create an instance of {@link DeleteEmployeeDetailsResponse }
     * 
     */
    public DeleteEmployeeDetailsResponse createDeleteEmployeeDetailsResponse() {
        return new DeleteEmployeeDetailsResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployeeDetailsRequest }
     * 
     */
    public GetAllEmployeeDetailsRequest createGetAllEmployeeDetailsRequest() {
        return new GetAllEmployeeDetailsRequest();
    }

    /**
     * Create an instance of {@link GetAllEmployeeDetailsResponse }
     * 
     */
    public GetAllEmployeeDetailsResponse createGetAllEmployeeDetailsResponse() {
        return new GetAllEmployeeDetailsResponse();
    }

}
