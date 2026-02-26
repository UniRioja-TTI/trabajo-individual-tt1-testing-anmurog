package servicios;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service
public class SimuladorService implements InterfazContactoSim {
	
	
	private DatosSolicitud sol;

	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		// TODO Auto-generated method stub
		this.sol = sol;
		Random r = new Random();
		return r.nextInt(10000)+1;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entidad> getEntities() {
		// TODO Auto-generated method stub
		Entidad e1 = new Entidad();
	    e1.setName("A");
	    e1.setId(0);

	    Entidad e2 = new Entidad();
	    e2.setName("B");
	    e2.setId(1);

	    Entidad e3 = new Entidad();
	    e3.setName("C");
	    e3.setId(2);

	    return Arrays.asList(e1, e2, e3);
	}

	@Override
	public boolean isValidEntityId() {
		// TODO Auto-generated method stub
		return true;
		
	}

}
