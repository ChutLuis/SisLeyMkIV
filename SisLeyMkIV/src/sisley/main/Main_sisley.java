package sisley.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Main_sisley extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_sisley frame = new Main_sisley();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_sisley() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsuarios = new JMenu("Usuarios");
		menuBar.add(mnUsuarios);
		
		JMenu mnCreacion = new JMenu("Creacion");
		mnUsuarios.add(mnCreacion);
		
		JMenu mnModificacion = new JMenu("Modificacion");
		mnUsuarios.add(mnModificacion);
		
		JMenu mnEliminacion = new JMenu("Eliminacion");
		mnUsuarios.add(mnEliminacion);
		
		JMenu mnLeyes = new JMenu("Leyes");
		menuBar.add(mnLeyes);
		
		JMenu mnCreacion_1 = new JMenu("Creacion");
		mnLeyes.add(mnCreacion_1);
		
		JMenu mnModificacion_1 = new JMenu("Modificacion");
		mnLeyes.add(mnModificacion_1);
		
		JMenu mnEliminacion_1 = new JMenu("Eliminacion");
		mnLeyes.add(mnEliminacion_1);
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		menuBar.add(mnSolicitudes);
		
		JMenu mnPrestamoLey = new JMenu("Prestamo Ley");
		mnSolicitudes.add(mnPrestamoLey);
		
		JMenu mnPrestamoStack = new JMenu("Prestamo Stack");
		mnSolicitudes.add(mnPrestamoStack);
		
		JMenu mnInformacion = new JMenu("Informacion");
		menuBar.add(mnInformacion);
		
		JMenu mnPorLey = new JMenu("Por Ley");
		mnInformacion.add(mnPorLey);
		
		JMenu mnPorStack = new JMenu("Por Stack");
		mnInformacion.add(mnPorStack);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
