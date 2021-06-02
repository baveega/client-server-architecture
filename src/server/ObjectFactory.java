
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _GetAllDoubleSamplesAboveResponse_QNAME = new QName("http://server/", "getAllDoubleSamplesAboveResponse");
    private final static QName _GetLargestDoubleResponse_QNAME = new QName("http://server/", "getLargestDoubleResponse");
    private final static QName _LongestString_QNAME = new QName("http://server/", "longestString");
    private final static QName _GetLargestDouble_QNAME = new QName("http://server/", "getLargestDouble");
    private final static QName _AddDoubleOnServer_QNAME = new QName("http://server/", "addDoubleOnServer");
    private final static QName _AddDoubleOnServerResponse_QNAME = new QName("http://server/", "addDoubleOnServerResponse");
    private final static QName _TestConnection_QNAME = new QName("http://server/", "testConnection");
    private final static QName _SafeLongestString_QNAME = new QName("http://server/", "safeLongestString");
    private final static QName _TestConnectionResponse_QNAME = new QName("http://server/", "testConnectionResponse");
    private final static QName _Hello_QNAME = new QName("http://server/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://server/", "helloResponse");
    private final static QName _LongestStringResponse_QNAME = new QName("http://server/", "longestStringResponse");
    private final static QName _GetAllDoubleSamplesAbove_QNAME = new QName("http://server/", "getAllDoubleSamplesAbove");
    private final static QName _SafeLongestStringResponse_QNAME = new QName("http://server/", "safeLongestStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddDoubleOnServer }
     * 
     */
    public AddDoubleOnServer createAddDoubleOnServer() {
        return new AddDoubleOnServer();
    }

    /**
     * Create an instance of {@link AddDoubleOnServerResponse }
     * 
     */
    public AddDoubleOnServerResponse createAddDoubleOnServerResponse() {
        return new AddDoubleOnServerResponse();
    }

    /**
     * Create an instance of {@link TestConnection }
     * 
     */
    public TestConnection createTestConnection() {
        return new TestConnection();
    }

    /**
     * Create an instance of {@link GetLargestDouble }
     * 
     */
    public GetLargestDouble createGetLargestDouble() {
        return new GetLargestDouble();
    }

    /**
     * Create an instance of {@link GetAllDoubleSamplesAboveResponse }
     * 
     */
    public GetAllDoubleSamplesAboveResponse createGetAllDoubleSamplesAboveResponse() {
        return new GetAllDoubleSamplesAboveResponse();
    }

    /**
     * Create an instance of {@link GetLargestDoubleResponse }
     * 
     */
    public GetLargestDoubleResponse createGetLargestDoubleResponse() {
        return new GetLargestDoubleResponse();
    }

    /**
     * Create an instance of {@link LongestString }
     * 
     */
    public LongestString createLongestString() {
        return new LongestString();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SafeLongestStringResponse }
     * 
     */
    public SafeLongestStringResponse createSafeLongestStringResponse() {
        return new SafeLongestStringResponse();
    }

    /**
     * Create an instance of {@link GetAllDoubleSamplesAbove }
     * 
     */
    public GetAllDoubleSamplesAbove createGetAllDoubleSamplesAbove() {
        return new GetAllDoubleSamplesAbove();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link LongestStringResponse }
     * 
     */
    public LongestStringResponse createLongestStringResponse() {
        return new LongestStringResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SafeLongestString }
     * 
     */
    public SafeLongestString createSafeLongestString() {
        return new SafeLongestString();
    }

    /**
     * Create an instance of {@link TestConnectionResponse }
     * 
     */
    public TestConnectionResponse createTestConnectionResponse() {
        return new TestConnectionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoubleSamplesAboveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllDoubleSamplesAboveResponse")
    public JAXBElement<GetAllDoubleSamplesAboveResponse> createGetAllDoubleSamplesAboveResponse(GetAllDoubleSamplesAboveResponse value) {
        return new JAXBElement<GetAllDoubleSamplesAboveResponse>(_GetAllDoubleSamplesAboveResponse_QNAME, GetAllDoubleSamplesAboveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLargestDoubleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLargestDoubleResponse")
    public JAXBElement<GetLargestDoubleResponse> createGetLargestDoubleResponse(GetLargestDoubleResponse value) {
        return new JAXBElement<GetLargestDoubleResponse>(_GetLargestDoubleResponse_QNAME, GetLargestDoubleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongestString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "longestString")
    public JAXBElement<LongestString> createLongestString(LongestString value) {
        return new JAXBElement<LongestString>(_LongestString_QNAME, LongestString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLargestDouble }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLargestDouble")
    public JAXBElement<GetLargestDouble> createGetLargestDouble(GetLargestDouble value) {
        return new JAXBElement<GetLargestDouble>(_GetLargestDouble_QNAME, GetLargestDouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addDoubleOnServer")
    public JAXBElement<AddDoubleOnServer> createAddDoubleOnServer(AddDoubleOnServer value) {
        return new JAXBElement<AddDoubleOnServer>(_AddDoubleOnServer_QNAME, AddDoubleOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addDoubleOnServerResponse")
    public JAXBElement<AddDoubleOnServerResponse> createAddDoubleOnServerResponse(AddDoubleOnServerResponse value) {
        return new JAXBElement<AddDoubleOnServerResponse>(_AddDoubleOnServerResponse_QNAME, AddDoubleOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "testConnection")
    public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
        return new JAXBElement<TestConnection>(_TestConnection_QNAME, TestConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeLongestString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeLongestString")
    public JAXBElement<SafeLongestString> createSafeLongestString(SafeLongestString value) {
        return new JAXBElement<SafeLongestString>(_SafeLongestString_QNAME, SafeLongestString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "testConnectionResponse")
    public JAXBElement<TestConnectionResponse> createTestConnectionResponse(TestConnectionResponse value) {
        return new JAXBElement<TestConnectionResponse>(_TestConnectionResponse_QNAME, TestConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongestStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "longestStringResponse")
    public JAXBElement<LongestStringResponse> createLongestStringResponse(LongestStringResponse value) {
        return new JAXBElement<LongestStringResponse>(_LongestStringResponse_QNAME, LongestStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoubleSamplesAbove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllDoubleSamplesAbove")
    public JAXBElement<GetAllDoubleSamplesAbove> createGetAllDoubleSamplesAbove(GetAllDoubleSamplesAbove value) {
        return new JAXBElement<GetAllDoubleSamplesAbove>(_GetAllDoubleSamplesAbove_QNAME, GetAllDoubleSamplesAbove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeLongestStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeLongestStringResponse")
    public JAXBElement<SafeLongestStringResponse> createSafeLongestStringResponse(SafeLongestStringResponse value) {
        return new JAXBElement<SafeLongestStringResponse>(_SafeLongestStringResponse_QNAME, SafeLongestStringResponse.class, null, value);
    }

}
