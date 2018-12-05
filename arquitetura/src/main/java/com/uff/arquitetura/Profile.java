package com.uff.arquitetura;

public enum Profile {
	BLUE,
	GREEN,
	YELLOW,
	ORANGE,
	RED;
	
	
	public static Profile getProfileById(int id)
	{
		Profile p = null;
		
		switch(id)
		{
		case 1:	p = BLUE;	break;
		case 2:	p = GREEN;	break;
		case 3:	p = YELLOW;	break;
		case 4:	p = BLUE;	break;
		case 5:	p = RED;	break;
		}
		
		return p;
	}
}
