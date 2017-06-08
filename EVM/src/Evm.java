public class Evm
{
	BU bu = new BU();
	CU cu = new CU();
	
	
	public void switchOn()
	{
		cu.switchOn();
		bu.switchOn();
		Factory f = new Factory();
		SwitchCommand sc=new On();
		
		
	}
	
}

