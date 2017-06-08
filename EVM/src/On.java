public class On extends SwitchCommand 
{

	@Override
	public void working(Lamp lamp)
	{
		lamp.on(lamp.getClass().getSimpleName());
		
	}

}