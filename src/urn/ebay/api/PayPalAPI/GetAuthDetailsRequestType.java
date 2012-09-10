package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * A timestamped token, the value of which was returned by
 * SetAuthFlowParam Response. RequiredCharacter length and
 * limitations: 20 single-byte characters
 */
public class GetAuthDetailsRequestType extends AbstractRequestType {


	/**
	 * A timestamped token, the value of which was returned by
	 * SetAuthFlowParam Response. RequiredCharacter length and
	 * limitations: 20 single-byte characters	  
	 *@Required	 
	 */ 
	private String Token;

	

	/**
	 * Constructor with arguments
	 */
	public GetAuthDetailsRequestType (String Token){
		this.Token = Token;
	}	

	/**
	 * Default Constructor
	 */
	public GetAuthDetailsRequestType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(Token != null) {
			sb.append("<urn:Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(Token));
			sb.append("</urn:Token>");
		}
		return sb.toString();
	}

}