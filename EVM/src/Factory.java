public class Factory
{
	Lamp lamp;

	public Lamp getLamp(String type)
	{
		
		
		 if(type.equalsIgnoreCase("Candidate Lamp"))
			lamp = new CandidateLamp();
		
		return lamp;
	}

	public void setLamp(Lamp lamp)
	{
		this.lamp = lamp;
	}
	
	
}