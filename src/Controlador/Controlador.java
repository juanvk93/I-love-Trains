


public class Controlador {
	
	private Mundo mundo;
	private Principal vista;
	
	public Controlador(Mundo mundo, Principal vista){
		this.mundo = mundo;
		this.vista = vista;
	}
	
	/*
	public void eliminarTren(int id){
		mundo.elimnarTren(id);
	}
	
	public void modificarTren(int id, int numVagones){
		mundo.modificarTren(id, numVagones);
	}
	
	public void crearTren(int numVagones){
		mundo.crearTren(numVagones);
	}
	
	public void aņadirSeņal(Coordenada posicion, EstadoSenal estado){
		mundo.aņadirSeņal(posicion, estado);
	}	
	*/
	
	public Tren[] getTrenes(){
		return mundo.getTrenes();
	}
	
	public char[][] getEstadoMundo(){
		return mundo.getEstadoMundo();
	}
	
	public Senal[] getSenal(){
		return mundo.getSenales();
	}
	public void setTrenes(Tren tren, int i){
		mundo.setTren(tren, i);
	}
	
	public void setSenal (Senal senal, int i){
		mundo.setSenal(senal, i);
	}
	
	public void setEstadoMundo(char[][] nuevoEstadoMundo){
		mundo.setEstadoMundo(nuevoEstadoMundo);
	}
	public void recalcularEstadoTrenes(){
		mundo.recalcularEstadoTrenes();
	}
}
