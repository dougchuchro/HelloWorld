
public class User {
	private String name;
	private String emailAddr;
	
	public void	setName(String name)	{this.name = name;}
	public String getName()				{return this.name;}
	
	public void	setEmailAddr(String emailAddr)	{this.emailAddr = emailAddr;}
	public String getEmailAddr()				{return this.emailAddr;}
	
	public static User getRandomUser(String id)	{
		User myUser = new User();
		myUser.setName("Doug");
		myUser.setName("doug@chuchro.net");		
		return myUser;
	}
}
