package teste;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

class JanelaPrincipal extends JFrame{
    private final JComboBox <String> saborPizza;
    private final JTextField qtdPizzas = new JTextField(1); 
    private final JButton incluir = new JButton("Incluir no Pedido");
    private final List<Pedido> listaPedidos = new ArrayList<>();
    private final JList<Pedido> lstPedidos = new JList<>();
    
    private final JanelaPedido janela2 = new JanelaPedido();

    public JanelaPrincipal() throws HeadlessException {
        
        
        JPanel infoPedido = new JPanel(new GridLayout(1, 5)); 
        String [] pizzas = {"Muçarela","Calabresa","Presunto","Marguerita","Palmito","Pepperone","Napolitana"};
        saborPizza = new JComboBox<>(pizzas);
        infoPedido.add(saborPizza);
        infoPedido.add(qtdPizzas);
        infoPedido.add(incluir); 
        add(infoPedido, BorderLayout.NORTH);
        JPanel detalhePedido = new JPanel(new GridLayout(1, 1)); 
        add(detalhePedido, BorderLayout.SOUTH);
        add(new JScrollPane(lstPedidos), BorderLayout.CENTER);
        
        
        
        //EVENTO CLICAR INCLUIR_PEDIDO
        incluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
}
