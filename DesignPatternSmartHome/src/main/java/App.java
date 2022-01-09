
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartHome smartHomeSystem = new SmartHome
			    .SmartHomeBuilder()
			    .withName("SmartHome")
			    .withSerialNumber(8080)
			    .withAddressName("Casablanca")
			    .withAddressName("14a")
			    .inCity("Casablanca")
			    .inCountry("Maroc")
			    .withPostalCode("1300")
			    .withDoor1PortNum(342)
			    .withDoor2PortNum(343)
			    .withLight1PortNum(211)
			    .withLight2PortNum(212)
			    .withMicrowavePortNum(11)
			    .withTvPortNum(12)
			    .withWaterHeaterPortNum(13)
			    .build();

		
		
			System.out.println(smartHomeSystem.toString());
		}
	}

}
