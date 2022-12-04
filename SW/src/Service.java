
public abstract class Service {
public Payment_behaviour p;
 
String name;
String get_name() {
	return name;
}
abstract Service_provider create(int type);


}
