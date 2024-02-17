package Multi_Level_Inheritance;

// Country - State - City

public class Country {
	//Data member
	
		private int Population;
		private String countryName;
		private int code;
		private String Capital;
		public int getPopulation() {
			return Population;
		}
		public void setPopulation(int population) {
			Population = population;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getCapital() {
			return Capital;
		}
		public void setCapital(String capital) {
			Capital = capital;
		}
		@Override
		public String toString() {
			return "Country [Population=" + Population + ", countryName=" + countryName + ", code=" + code + ", Capital="
					+ Capital + "]";
		}
		
}
