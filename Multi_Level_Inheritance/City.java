package Multi_Level_Inheritance;

public class City extends State{
	private String cityName;
	private float area;
	private double populationCity;
	
	
	//getter and setter
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public double getPopulationCity() {
		return populationCity;
	}
	public void setPopulationCity(double populationCity) {
		this.populationCity = populationCity;
	}
	
	//toString
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", populationCity=" + populationCity
				+ ", getStateName()=" + getStateName() + ", getLanguage()=" + getLanguage() + ", getCountryName()="
				+ getCountryName() + ", getCode()=" + getCode() + "]";
	}
	
}
