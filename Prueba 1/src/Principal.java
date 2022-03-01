import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField codigoDep;
	private JTextField nombreDep;
	private JTextField localidadDep;
	private JButton insertarDatos;
	private JButton limpiarDatos;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 41, 414, 164);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo Departamento: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(39, 11, 131, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(39, 49, 138, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(39, 82, 148, 14);
		panel.add(lblNewLabel_3);

		codigoDep = new JTextField();
		codigoDep.setBackground(Color.GRAY);
		codigoDep.setBounds(205, 11, 69, 20);
		panel.add(codigoDep);
		codigoDep.setColumns(10);

		nombreDep = new JTextField();
		nombreDep.setBounds(205, 46, 148, 20);
		panel.add(nombreDep);
		nombreDep.setColumns(10);

		localidadDep = new JTextField();
		localidadDep.setBounds(205, 79, 148, 20);
		panel.add(localidadDep);
		localidadDep.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Selecciona País", "Espa\u00F1a", "Italia", "Portugal", "Alemania" }));
		comboBox.setBounds(205, 110, 148, 20);
		panel.add(comboBox);

		JLabel lblNewLabel_4 = new JLabel("Selecciona el pa\u00EDs:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(39, 113, 108, 14);
		panel.add(lblNewLabel_4);

		JRadioButton siRadio = new JRadioButton("Si");
		buttonGroup.add(siRadio);
		siRadio.setBounds(205, 137, 54, 23);
		panel.add(siRadio);

		JRadioButton noRadio = new JRadioButton("No");
		buttonGroup.add(noRadio);
		noRadio.setBounds(264, 137, 54, 23);
		panel.add(noRadio);

		JLabel lblNewLabel_5 = new JLabel("Empleado: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(39, 138, 108, 14);
		panel.add(lblNewLabel_5);

		insertarDatos = new JButton("Insertar Datos");
		insertarDatos.setBounds(76, 210, 126, 23);
		contentPane.add(insertarDatos);

		limpiarDatos = new JButton("Limpiar Datos");
		limpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR");

				codigoDep.setText("");
				nombreDep.setText("");
				localidadDep.setText("");
				comboBox.setSelectedIndex(0);
				textArea.setText("");

			}
		});
		limpiarDatos.setBounds(233, 210, 126, 23);
		contentPane.add(limpiarDatos);

		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setBounds(123, 11, 181, 23);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 244, 400, 80);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JButton dialogo1 = new JButton("Dialogo");
		dialogo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Dialogo1 dialog = new Dialogo1();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		dialogo1.setBounds(176, 335, 89, 23);
		contentPane.add(dialogo1);
		insertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR");

				System.out.println("Codigo tecleado: " + codigoDep.getText());
				System.out.println("Nombre tecleado: " + nombreDep.getText());
				System.out.println("Localidad tecleada: " + localidadDep.getText());
				System.out.println("Posicion: " + comboBox.getSelectedIndex());
				System.out.println("Contenido: " + comboBox.getSelectedItem());
				ButtonModel si = siRadio.getModel();
				ButtonModel no = noRadio.getModel();

				if (buttonGroup.getSelection() != null) {
					if (buttonGroup.getSelection().equals(si))
						System.out.println("Pulsaste Sí");
					if (buttonGroup.getSelection().equals(no))
						System.out.println("Pulsaste No");

				}
				System.out.println("Comentario: " + textArea.getText());

			}
		});
	}
}
