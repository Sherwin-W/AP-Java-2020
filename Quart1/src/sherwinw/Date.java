package sherwinw;

public class Date 
{
	String monthNames = "January  Feburary March    April    May      June     July     August   SeptemberOctober  November December ";
	
	private int y,a,b,c,d,e,g,h,j,k,m,r,n,p;
	
	public Date (int y)
	{
		this.y = y;
	}
	
	public String getMonth ()
	{
		a = this.y%19;
		b = this.y/100;
		c = this.y%100;
		d = b/4;
		e = b%4;
		g = (8*b+13)/25;
		h = (19*a+b-d-g+15)%30;
		j = c/4;
		k = c%4; 
		m = (a+11*h)/319;
		r = (2*e+2*j-k-h+m+32)%7;
		n = (h-m+r+90)/25;
		
		String month = this.monthNames.substring((n-1)*9, n*9);
		return month;
	}
	
	public int getDay()
	{
		p = (h-m+r+n+19)%32;
		return p;
	}

}
