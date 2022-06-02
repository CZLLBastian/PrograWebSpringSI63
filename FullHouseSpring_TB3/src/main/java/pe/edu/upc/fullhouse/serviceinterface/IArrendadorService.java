package pe.edu.upc.fullhouse.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.fullhouse.entities.Arrendador;

public interface IArrendadorService {
	
	public void insert(Arrendador arrendador);
	List<Arrendador> list();
	public void delete(int idArrendador);
	Optional<Arrendador> listId(int idArrendador);
	public void update(Arrendador arrendador);

}
