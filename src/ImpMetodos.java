import java.util.ArrayList;
import java.util.List;

public class ImpMetodos implements Metodos{

	List<Object> list = new ArrayList<Object>();

	@Override
	public void guardar(Object obj) {
		list.add(obj);
		
	}

	@Override
	public void editar(int index, Object obj) {
		list.set(index, obj);
		
	}

	@Override
	public Object Buscar(int index) {
		return list.get(index);
	}

	@Override
	public void eliminar(int index) {
		list.remove(index);
		
	}

	@Override
	public void listar() {
		System.out.println(list);
	}
	
	public void mostrar() {
		//Imprimimos una explicación
		System.out.println("Posicion y descripcion de la lista de objetos");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getClass().equals(Automovil.class)) {
				Automovil auto = (Automovil) list.get(i);
				System.out.printf("\n[%d] se encontro el auto del año " + auto.getAño(), i);
			}
		}
	}

}
