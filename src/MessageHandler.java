
public class MessageHandler {
	public String message;
	public String statusCode;
	
	public String writeMessage ()	{
		System.out.println(this.message);
		this.statusCode = "good";
		return this.statusCode;
	}
	

}
