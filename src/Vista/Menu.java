package Vista;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Clases.Moneda;

public class Menu {
	public static Moneda Dinero = new Moneda()	;
	
	
	public static void main(String[] args) {
		
		System.out.println("das");
		MenuPrincipal();
	}
	
    public static void MenuPrincipal() {
    	//creacion de opciones
        String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
        
        //Combobox de opciones
        JComboBox<String> cbo = new JComboBox<String>(opciones);
        
        
        Panel panel  = new Panel(new BorderLayout());
        panel.add(new JLabel("Seleccione una opcion:"),BorderLayout.NORTH);
        panel.add(cbo, BorderLayout.CENTER);
        
        
        int option = JOptionPane.showOptionDialog(
        		null,
                panel,
                "Vista",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );

        if (option == JOptionPane.OK_OPTION) {
            String selectedItem = (String) cbo.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedItem);
            ingresoDatos();
        } else {
        	
        	JOptionPane.showMessageDialog(null, "Programa Terminado");
            
        }
    }
    
    
    public static void ingresoDatos() {
    	
    	int valor = 0;
    	try {

    		valor = Integer.parseInt(
        			JOptionPane.showInputDialog(
        					null,
        					"Conversor de Moneda",
        					"Ingrese monto",
        					JOptionPane.INFORMATION_MESSAGE
        			)
        	);

        	if (valor > 0) {
    			System.out.println("El valor introducido es  :"+ valor);
    			Dinero.setValor(valor);
    			CuadroDeDialogo();
    			
    		
    		} else {
    			JOptionPane.showMessageDialog(null, "No se aceptan datos negativos");

    		}    	
    		
		} catch (NumberFormatException e ) {
			JOptionPane.showMessageDialog(null, "Ingrese numeros no textos");
			MenuPrincipal();

			
		}
    	
    	
    }
    
    
    public static void CuadroDeDialogo() {

    	//creacion de opciones
        String[] opciones = {"De Soles a Dolar",
        		"De Soles a Euro",
        		"De Soles a Libras",
        		"De Soles a Yen",
        		"De Soles a Won Coreano ",
        		"De Dolar a Soles",
        		"De Euro a Soles",
        		"De Libras a Soles",
        		"De Yen a Soles",
        		"De Won a Soles"
        		
        
        
        };
        
        //Combobox de opciones
        JComboBox<String> cbo = new JComboBox<String>(opciones);
        
        
        Panel panel  = new Panel(new BorderLayout());
        panel.add(new JLabel("Seleccione una opcion:"),BorderLayout.NORTH);
        panel.add(cbo, BorderLayout.CENTER);
        
        
        int option = JOptionPane.showOptionDialog(
        		null,
                panel,
                "Vista",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );

        if (option == JOptionPane.OK_OPTION) {
            int selectedIndex =  cbo.getSelectedIndex();
            System.out.println("Opción seleccionada: " + selectedIndex);
    		System.out.println(Dinero.getValor());

            
            String resultado = "";
            switch (selectedIndex) {
				case 0:
					resultado = Dinero.toDolar(Dinero.getValor());
					
					break;
				case 1:
					resultado =Dinero.toEuros(Dinero.getValor());
					break;
				case 2:
					resultado =Dinero.toLibras(Dinero.getValor());
					break;
				case 3:
					resultado =Dinero.toYen(Dinero.getValor());
					break;
				case 4:
					resultado =Dinero.toWon(Dinero.getValor());
					break;
				case 5:
					resultado =Dinero.DolartoSoles(Dinero.getValor());
					break;
				case 6:
					resultado =Dinero.EurotoSoles(Dinero.getValor());
					break;
				case 7:
					resultado =Dinero.LibratoSoles(Dinero.getValor());
					break;
				case 8:
					resultado =Dinero.YentoSoles(Dinero.getValor());
					break;
				case 9:
					resultado =Dinero.WontoSoles(Dinero.getValor());
					break;

				}
            
            Resultado(resultado);
        } else {
            System.out.println("Diálogo cancelado");
            MenuPrincipal();
        }
    	
    }
    
    
    public static void Resultado(String result) {
    	
    	String Resultado = "Tienes "+ result;
    	
    	JOptionPane.showMessageDialog(null,Resultado);
    	int resultado = JOptionPane.showOptionDialog(null,
    			"¿Desea continuar?",
    			"Selecciona una opcion",
    			JOptionPane.YES_NO_OPTION,
    			JOptionPane.QUESTION_MESSAGE,
    			null, null, null
    	);
    	
    	switch (resultado) {
		case 0:
			MenuPrincipal();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			break;
		}
    	
    	
    
    }
    

    
    
    
}
