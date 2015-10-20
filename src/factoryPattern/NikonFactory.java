package factoryPattern;

//具体工厂
class NikonFactory implements AbsCameraFactory{

	@Override
	public Camera getCameras(String brand) {
		return new Nikon();
	}
}
