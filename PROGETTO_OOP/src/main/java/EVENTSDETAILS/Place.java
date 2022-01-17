package EVENTSDETAILS;

public class Place extends Location {
	
	private String cityName;
	private String stateName;
	private Location location;

	public Place (String cityName,String stateName,Location location)
	{
		super(latitude, longitude);
		this.cityName=cityName;
		this.stateName=stateName;
	}
	
}
