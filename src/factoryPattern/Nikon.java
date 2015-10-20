package factoryPattern;

//具体产品1
class Nikon implements Camera{

	@Override
	public void takePhotos() {
		System.out.println("Nikon kaca kaca kaca ...");
	}
}
