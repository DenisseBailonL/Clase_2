package TELEVISOR;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTelevisor extends JFrame {

	private JPanel contentPane;
	private JTextField textVolumen;
	private JTextField textCanal;
	Televisor tv1= new Televisor(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTelevisor frame = new FrmTelevisor();
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
	public FrmTelevisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEncender = new JButton("Encender");
		btnEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tv1.encender();
				System.out.println("Televisor Encendido");
			}
		});
		btnEncender.setBounds(335, 37, 89, 23);
		contentPane.add(btnEncender);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tv1.apagar();
				System.out.println("Televisor Apagado");
			}
		});
		btnApagar.setBounds(335, 71, 89, 23);
		contentPane.add(btnApagar);
		
		JButton btnVolumen = new JButton("Volumen +");
		btnVolumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tv1.SubirVolumen();
				textVolumen.setText("Volumen: "+tv1.obtenerVolumen()+"");		
			}
		});
		btnVolumen.setBounds(335, 182, 89, 23);
		contentPane.add(btnVolumen);
		
		JButton btnVolumen_1 = new JButton("Volumen -");
		btnVolumen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tv1.BajarVolumen();
				textVolumen.setText("Volumen: "+tv1.obtenerVolumen()+"");	
			}
		});
		btnVolumen_1.setBounds(335, 216, 89, 23);
		contentPane.add(btnVolumen_1);
		
		JButton btnCanal = new JButton("Canal +");
		btnCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tv1.CambiarCanalArriba();
				textCanal.setText("Canal: "+tv1.obtenerCanal()+"");
			}
		});
		btnCanal.setBounds(22, 182, 89, 23);
		contentPane.add(btnCanal);
		
		JButton btnCanal_1 = new JButton("Canal -");
		btnCanal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tv1.CambiarCanalAbajo();
				textCanal.setText("Canal: "+tv1.obtenerCanal()+"");
			}
		});
		btnCanal_1.setBounds(22, 216, 89, 23);
		contentPane.add(btnCanal_1);
		
		textVolumen = new JTextField();
		textVolumen.setBounds(109, 27, 200, 23);
		contentPane.add(textVolumen);
		textVolumen.setColumns(10);
		
		textCanal = new JTextField();
		textCanal.setBounds(109, 63, 200, 23);
		contentPane.add(textCanal);
		textCanal.setColumns(10);
	}
}
