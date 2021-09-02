package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private TextField textLU;
	private Date fecha;
	private SimpleDateFormat formatoFecha;
	private SimpleDateFormat formatoHora;
	
	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		setBackground(Color.WHITE);
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(null);
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(621, 270));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBounds(5, 5, 432, 200);
		tabbedPane.setBackground(Color.DARK_GRAY);
		tabInformation = new JPanel();
		tabInformation.setBackground(Color.DARK_GRAY);
		tabInformation.setPreferredSize(new Dimension(425, 270));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		tabbedPane.setForegroundAt(0, Color.DARK_GRAY);
		tabInformation.setLayout(null);
		
		textLU = new TextField();
		textLU.setEditable(false);
		textLU.setBounds(91, 20, 324, 22);
		textLU.setText(String.valueOf(studentData.getId()));;
		tabInformation.add(textLU);
		
		TextField textApellido = new TextField();
		textApellido.setEditable(false);
		textApellido.setBounds(91, 48, 324, 22);
		textApellido.setText(studentData.getLastName());
		tabInformation.add(textApellido);
		
		TextField textNombre = new TextField();
		textNombre.setEditable(false);
		textNombre.setBackground(Color.WHITE);
		textNombre.setBounds(91, 76, 324, 22);
		textNombre.setText(studentData.getFirstName());
		tabInformation.add(textNombre);
		
		TextField textMail = new TextField();
		textMail.setEditable(false);
		textMail.setBackground(Color.WHITE);
		textMail.setBounds(91, 104, 324, 22);
		textMail.setText(studentData.getMail());
		tabInformation.add(textMail);
		
		TextField textGithubURL = new TextField();
		textGithubURL.setEditable(false);
		textGithubURL.setBackground(Color.WHITE);
		textGithubURL.setBounds(91, 132, 324, 22);
		textGithubURL.setText(studentData.getGithubURL());
		tabInformation.add(textGithubURL);
		
		JLabel labelLU = new JLabel("LU");
		labelLU.setBackground(Color.LIGHT_GRAY);
		labelLU.setForeground(Color.LIGHT_GRAY);
		labelLU.setHorizontalAlignment(SwingConstants.LEFT);
		labelLU.setBounds(10, 20, 75, 22);
		tabInformation.add(labelLU);
		
		JLabel labelApellido = new JLabel("Apellido");
		labelApellido.setBackground(Color.LIGHT_GRAY);
		labelApellido.setForeground(Color.LIGHT_GRAY);
		labelApellido.setHorizontalAlignment(SwingConstants.LEFT);
		labelApellido.setBounds(10, 48, 75, 22);
		tabInformation.add(labelApellido);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBackground(Color.LIGHT_GRAY);
		labelNombre.setForeground(Color.LIGHT_GRAY);
		labelNombre.setHorizontalAlignment(SwingConstants.LEFT);
		labelNombre.setBounds(10, 76, 75, 22);
		tabInformation.add(labelNombre);
		
		JLabel labelMail = new JLabel("E-Mail");
		labelMail.setBackground(Color.LIGHT_GRAY);
		labelMail.setForeground(Color.LIGHT_GRAY);
		labelMail.setHorizontalAlignment(SwingConstants.LEFT);
		labelMail.setBounds(10, 104, 75, 22);
		tabInformation.add(labelMail);
		
		JLabel labelGithubURL = new JLabel("Github URL");
		labelGithubURL.setForeground(Color.LIGHT_GRAY);
		labelGithubURL.setHorizontalAlignment(SwingConstants.LEFT);
		labelGithubURL.setBounds(10, 132, 75, 22);
		tabInformation.add(labelGithubURL);
		contentPane.add(tabbedPane);
		
		fecha = new Date();
		formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		formatoHora = new SimpleDateFormat("hh:mm:ss");
		JLabel LabelFecha = new JLabel("Esta ventana fue generada el "+ formatoFecha.format(fecha) + " a las: " + formatoHora.format(fecha) );
		LabelFecha.setBounds(5, 216, 432, 14);
		contentPane.add(LabelFecha);
		
		JLabel labelFoto = new JLabel("");
		labelFoto.setBounds(444, 39, 150, 152);
		contentPane.add(labelFoto);
		labelFoto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/student_img.jpg")));
		labelFoto.setBackground(Color.DARK_GRAY);
	}
}
