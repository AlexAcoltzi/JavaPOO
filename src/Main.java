import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables a utilizar
		String marca, modelo;
		int capacidad, año, numPuertas, menu, subMenu, indice;

		// Creamos el escanner
		Scanner read = new Scanner(System.in);

		// Creamos el espacio en memoria de la clase
		Automovil auto = null;

		// Creamos la instanmcia de la clase que implementa metodos
		ImpMetodos imp = new ImpMetodos();

		do {
			System.out.println("\t\t Menu Principal");
			System.out.println("1.- Autos");
			System.out.println("2.- Salir");
			menu = read.nextInt();
			read.nextLine();

			switch (menu) {
			case 1:

				do {
					System.out.println("Menu Auto");
					System.out.println("1.- Alta");
					System.out.println("2.- Editar");
					System.out.println("3.- Buscar");
					System.out.println("4.- Eliminar");
					System.out.println("5.- Mostrar");
					System.out.println("6.- Regresar");
					subMenu = read.nextInt();
					read.nextLine();

					switch (subMenu) {
					case 1:

						System.out.println("Ingresa la marca del auto");
						marca = read.next();
						read.nextLine();

						System.out.println("Ingresa el modelo del auto");
						modelo = read.next();
						read.nextLine();

						System.out.println("Ingresa la capacidad del auto");
						capacidad = read.nextInt();
						read.nextLine();

						System.out.println("Ingresa el numero de puertas del auto");
						numPuertas = read.nextInt();
						read.nextLine();

						System.out.println("Ingresa el año del auto");
						año = read.nextInt();
						read.nextLine();

						try {
							auto = new Automovil(marca, modelo, capacidad, numPuertas, año);
							imp.guardar(auto);

							System.out.println("\nSe guardo el auto correctamente");
						} catch (Exception e) {
							System.out.println("\nHubo un error al agregar el auto " + e);
						}

						break;

					case 2:

						imp.mostrar();

						System.out.println("\nIngresa el indice a editar");
						indice = read.nextInt();
						read.nextLine();

						try {
							auto = (Automovil) imp.Buscar(indice);

							System.out.println("Ingresa el nuevo año del auto");
							año = read.nextInt();
							read.nextLine();

							auto.setAño(año);
							imp.editar(indice, auto);

						} catch (Exception e) {
							System.out.println("Hubo un problema " + e);
						}

						break;

					case 3:

						imp.mostrar();

						System.out.println("\nIngresa el indice a buscar");
						indice = read.nextInt();
						read.nextLine();

						try {
							auto = (Automovil) imp.Buscar(indice);
							System.out.println("Se encontro el auto " + auto);
						} catch (Exception e) {
							System.out.println("Hubo un problema " + e);
						}

						break;

					case 4:

						imp.mostrar();

						System.out.println("\nIngresa el indice a buscar");
						indice = read.nextInt();
						read.nextLine();

						try {
							imp.eliminar(indice);
							System.out.println("Se elimino el auto con exito ");
						} catch (Exception e) {
							System.out.println("Hubo un problema " + e);
						}

						break;

					case 5:
						
						imp.listar();

						break;

					case 6:

						break;

					}

				} while (subMenu < 6);

				break;

			case 2:
				break;
			}

		} while (menu < 2);

	}

}
