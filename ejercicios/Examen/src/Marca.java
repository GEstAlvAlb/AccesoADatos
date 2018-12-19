import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Marca implements ActionListener {
	Vista vista;
	private HashMap<String, Ejer1> ejer1 = new HashMap<String, Ejer1>();

	public Marca(Vista vista) {
		this.vista = vista;
		addListeners();
		refrescarLista();

	}

	private void addListeners() {
		vista.btnNuevo.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ejer1 ejer = new Ejer1();
		switch (arg0.getActionCommand()) {
		case "Nuevo":
			String modelo = vista.txModelo.getText();
			String marca = vista.txMarca.getText();
			String precio = vista.txPrecio.getText();
			String fecha = vista.txFecha.getText();
			ejer.setNodelo(modelo);
			ejer.setMarca(marca);
			ejer.setFecha(fecha);
			ejer.setPrecio(precio);

			try {
				guardar(ejer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			vista.mLista.addElement(ejer);
			refrescarLista();
		}

	}

	private void refrescarLista() {
		
		vista.mLista.removeAllElements();
		for (Ejer1 ejer : getLista()) {
			
			vista.mLista.addElement(ejer );
		
		}
	}

	private ArrayList<Ejer1> getLista() {
		
		return new ArrayList<Ejer1>(ejer1.values());

	}
	public void guardar(Ejer1 ejer) throws IOException {
		
		ejer1.put(ejer.getNodelo(), ejer);
		
		
	}

}
