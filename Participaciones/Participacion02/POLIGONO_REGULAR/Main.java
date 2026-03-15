package POLIGONO_REGULAR;

public class Main {

	public static void main(String[] args) {
		//PRIMER OBJETO
		PoligonoRegular pr1 = new PoligonoRegular();
		System.out.println("El perímetro es: " + pr1.getPerimetro());
		System.out.println("El área es: " + pr1.getArea());
		
		//SEGUNDO OBJETO
		System.out.println("----------------------------------------------");
		PoligonoRegular pr2 = new PoligonoRegular(6, 4);
		System.out.println("El perímetro es: " + pr2.getPerimetro());
		System.out.println("El área es: " + pr2.getArea());
		
		//TERCER OBJETO
		System.out.println("----------------------------------------------");
		PoligonoRegular pr3 = new PoligonoRegular(10, 4, 5.6, 7.8);
		System.out.println("El perímetro es: " + pr3.getPerimetro());
		System.out.println("El área es: " + pr3.getArea());


	}

}
