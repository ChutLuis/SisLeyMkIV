package sisley.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;

// TODO: Auto-generated Javadoc
/**
 * The Class Main_sisley.
 */
public class Main_sisley extends JFrame{

	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	User_Create create1 = new User_Create();
	User_eliminate delete1 = new User_eliminate();
	/**
	 * The main method.
	 *
	 * @param args the arguments
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
		setTitle("SisLeyMkIV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsuarios = new JMenu("Usuarios");
		menuBar.add(mnUsuarios);
		
		JMenuItem mntmCreate = new JMenuItem("Create");
		mntmCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create1.setVisible(true);
			}
		});
		mnUsuarios.add(mntmCreate);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mntmModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnUsuarios.add(mntmModificar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete1.setVisible(true);
			}
		});
		mnUsuarios.add(mntmEliminar);
		
		JMenu mnLeyes = new JMenu("Leyes");
		menuBar.add(mnLeyes);
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mnLeyes.add(mntmCrear);
		
		JMenuItem mntmModificar_1 = new JMenuItem("Modificar");
		mnLeyes.add(mntmModificar_1);
		
		JMenuItem mntmEliminar_1 = new JMenuItem("Eliminar");
		mnLeyes.add(mntmEliminar_1);
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		menuBar.add(mnSolicitudes);
		
		JMenuItem mntmPrestamoLey = new JMenuItem("Prestamo Ley");
		mnSolicitudes.add(mntmPrestamoLey);
		
		JMenuItem mntmPrestamoStack = new JMenuItem("Prestamo Stack");
		mnSolicitudes.add(mntmPrestamoStack);
		
		JMenu mnInformacion = new JMenu("Informacion");
		mnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnInformacion);
		
		JMenuItem mntmInfoLey = new JMenuItem("Info Ley");
		mnInformacion.add(mntmInfoLey);
		
		JMenuItem mntmInfoStack = new JMenuItem("Info Stack");
		mnInformacion.add(mntmInfoStack);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
