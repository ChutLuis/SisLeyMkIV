package sisley.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class User_eliminate.
 */
public class User_eliminate extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
User_Create us1= new User_Create();
int i = 0;
	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_eliminate frame = new User_eliminate();
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
	public User_eliminate() {
		setTitle("Eliminar Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
				comboBox.addItem(us1.getParlamentario(0));
			}
		});
		comboBox.setBounds(152, 88, 160, 20);
		contentPane.add(comboBox);		
		
			
		
		
		
		
	}
}
