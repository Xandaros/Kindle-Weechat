package xandaros.weechat;

public class Channel
{
	private String name;

	public Channel(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public String toString()
	{
		return this.getName();
	}
}
