package com.braindata.model1;

public class Doctor {
	protected int did;
	protected String dname;
	protected String hname;
	protected String haddr;
	protected long dmobno;
	protected double dsal;
 
	public void setDid(int did)
	{
		this.did=did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	
	public void setHname(String hname)
	{
		this.hname=hname;
	}
	public void setHaddr(String hsddr)
	{
		this.haddr=haddr;
	}
	public void setDmobno(long dmobno)
	{
		this.dmobno=dmobno;
	}
	public void setDsal(double dsal)
	{
		this.dsal=dsal;
	}
	
	
	public int getDid()
	{
		return did;
	}
	public String getDname()
	{
		return dname;
	}
	public String getHname()
	{
		return hname;
	}
	public String getHaddr()
	{
		return haddr;
	}

	public Long getDmobno()
	{
		return dmobno;
	}
	public double getDsal()
	{
		return dsal;
	}


}
