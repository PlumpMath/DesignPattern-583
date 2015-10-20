package factoryPattern;

//简单工厂
public class CameraFactory {
	public static Camera createCamera(String brand){
		//会报错：The method createCamera cannot be declared static;
		//static methods can only be declared in a static or top level type
		Camera camera = null;
		if("nikon".equals(brand)){
			camera = new Nikon();
		} else if ("cannon".equals(brand)){
			camera = new Cannon();
		}
		return camera;
	}
}
