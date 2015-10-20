package factoryPattern;

public class FactoryTest {

	public static void main(String[] args){
		
		//简单工厂调用
		Camera c1 = CameraFactory.createCamera("nikon");
		c1.takePhotos();

		//抽象工厂调用
		AbsCameraFactory acf = new CannonFactory();
		Camera c2 = acf.getCameras("cannon");
		c2.takePhotos();
	}
}
