package Multi_Level_Inheritance;

public class State extends Country {
	//Data members
		private String StateName;
		private String language;
		public String getStateName() {
			return StateName;
		}
		public void setStateName(String stateName) {
			StateName = stateName;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		@Override
		public String toString() {
			return "State [StateName=" + StateName + ", language=" + language + ", getPopulation()=" + getPopulation()
					+ ", getCountryName()=" + getCountryName() + ", getCode()=" + getCode() + ", getCapital()="
					+ getCapital() + "]";
		}
}
