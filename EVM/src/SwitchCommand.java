public abstract class SwitchCommand
{
	BU bu = new BU();
	Lamp lamp;
	
	public abstract void working(Lamp lamp);
}