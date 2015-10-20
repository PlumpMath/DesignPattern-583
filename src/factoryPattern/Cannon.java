package factoryPattern;

//具体产品2
class Cannon implements Camera{

	@Override
	public void takePhotos() {
		System.out.println("Cannon kaca kaca kaca ...");
	}
}
