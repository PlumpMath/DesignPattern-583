package factoryPattern;

//具体工厂
class CannonFactory implements AbsCameraFactory{

	@Override
	public Camera getCameras(String brand) {
		return new Cannon();
	}
}
