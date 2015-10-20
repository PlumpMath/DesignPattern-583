package factoryPattern;

//简单工厂变为抽象工厂
interface AbsCameraFactory{
	public abstract Camera getCameras(String brand);
}
