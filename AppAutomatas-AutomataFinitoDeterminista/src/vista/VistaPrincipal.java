package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.Automata;

public class VistaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCadena;
	private Automata automata = new Automata();
	private PanelDibujo panelDibujo;
	private JButton btnCalcular;
	private JPanel panel_1;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
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
	public VistaPrincipal() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		panelDibujo = new PanelDibujo();
		panelDibujo.setBorder(new EmptyBorder(15, 15, 15, 15));
		panelDibujo.setBackground(new Color(19, 42, 62));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(19, 42, 62));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 476, 0 };
		gbl_contentPane.rowHeights = new int[] { 64, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(19, 42, 62));
		panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 176, 135, 0 };
		gbl_panel.rowHeights = new int[] { 32, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		txtCadena = new JTextField();
		txtCadena.setBorder(
				new TitledBorder(null, "INGRESE LA CADENA", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		txtCadena.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtCadena = new GridBagConstraints();
		gbc_txtCadena.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCadena.anchor = GridBagConstraints.NORTH;
		gbc_txtCadena.insets = new Insets(0, 0, 5, 5);
		gbc_txtCadena.gridx = 0;
		gbc_txtCadena.gridy = 0;
		panel.add(txtCadena, gbc_txtCadena);
		txtCadena.setFont(new Font("Product Sans", Font.BOLD, 24));
		txtCadena.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() != 'A' && e.getKeyChar() != 'a' && e.getKeyChar() != 'B' && e.getKeyChar() != 'b'
						&& e.getKeyChar() != 'C' && e.getKeyChar() != 'c' && e.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
					JOptionPane.showMessageDialog(null, "INGRESE CARACTERES DEL ALFABETO {a,b,c}");
					e.consume();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if (!txtCadena.getText().equals("")) {
					btnCalcular.doClick();
				}else {
					panelDibujo.setResultados(new ArrayList<>());
					panelDibujo.repaint();
					lblResultado.setText("------------------------");
					panel_1.setBackground(new Color(246, 107, 14));

				}
			}
		});
		txtCadena.setColumns(10);

		panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(246, 107, 14));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		lblResultado = new JLabel("------------------------");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setFont(new Font("Product Sans", Font.BOLD, 24));
		panel_1.add(lblResultado);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(246, 107, 14));
		btnCalcular.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.fill = GridBagConstraints.VERTICAL;
		gbc_btnCalcular.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalcular.gridx = 0;
		gbc_btnCalcular.gridy = 1;
		panel.add(btnCalcular, gbc_btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCadena.getText().equals("")) {
					return;
				}
				var respuesta = automata.calcular(txtCadena.getText());
				
				if (respuesta.getDestino().isAceptacion()) {
					lblResultado.setText("CADENA ACEPTADA");
					panel_1.setBackground(new Color(55, 156, 211));
				} else {
					lblResultado.setText("CADENA RECHAZADA");
					panel_1.setBackground(new Color(246, 107, 14));
				}
				panelDibujo.setResultados(automata.getResultados());
				panelDibujo.repaint();
				txtCadena.requestFocus();
			}
		});
		btnCalcular.setFont(new Font("Product Sans", Font.BOLD, 24));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 1;
		contentPane.add(panelDibujo, gbc_panel_11);

	}
}
