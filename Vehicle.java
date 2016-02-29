public class Vehicle
	{
		private String license;
		private String chassisNumber;
		private String color;
		private short  numberOfwheels;

		public enum VehicleTypes {
					BICYCLE, MOTORBIKE, CAR, TRUCK, BOAT,
					TRAIN, TRAILER, AIRPLANE;
					}
	}
		public Vehicle(String license, String chassisNum, VehicleTypes vt, 					String color,short numWheels){
			this.license = license;
			chassisNumber = chassisNum;
			vehicleType = vt;
			this.color = color;
			numberOfWheels = numWheels;
		
		public void setLicense(String license){
				this.license = license;
			}

		public void setChassisNumber(String chassisNumber)
		{
		this.chassisNumber = chassisNumber;
		}
		
		public Vehicle(){
		System.out.println("I am a Vehicle!");

}
//public static void main(String[] args) {
//	Vehicle v01 = new Vehicle();}


