import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FiltrarLista extends JList{
    private CampoFiltro campoFiltro;
    private int DEFAULT_FIELD_WIDTH = 20;

    public FiltrarLista() {
        super();
        setModel(new FiltroModel());
        campoFiltro = new CampoFiltro(DEFAULT_FIELD_WIDTH);
    }
    
    public void setModel(ListModel i)
    {
        if(!(i instanceof FiltroModel))
            throw new IllegalArgumentException();
        super.setModel(i);
    }
    
    public void agregarItem(Object e)
    {
        ((FiltroModel)getModel()).agregarElemento(e);
    }
    
    
    public static void main(String[] arg){
        String[] listItems = {
             "aCancion", "bCancion", "cCancion", "dCancion",
            "eCancion", "fCancion", "gCancion", "hCancion"
        };
        JFrame frame = new JFrame ("Busqueda");
        frame.getContentPane().setLayout (new BorderLayout());
        // populate list
        FiltrarLista list = new FiltrarLista();
        for (int i=0; i<listItems.length; i++)
        {
            list.agregarItem(listItems[i]);
        }
           
        // add to gui
        JScrollPane pane = new JScrollPane (list,
                             ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                             ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        frame.getContentPane().add (pane, BorderLayout.CENTER);
        frame.getContentPane().add (list.getCampoFiltro(),
                                    BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public JTextField getCampoFiltro() {
        return campoFiltro;
    }
    
    class FiltroModel extends AbstractListModel{
        
        ArrayList items;
        ArrayList FiltradoItems;

        public FiltroModel() {
            super();
            items = new ArrayList();
            FiltradoItems = new ArrayList();
        }
        
        public int getSize() {
            return FiltradoItems.size();
        }
 
        public Object getElementAt(int index) {
            if(index<FiltradoItems.size())
            {
                return FiltradoItems.get(index);
            }else
                return null;
        }
        
        public void agregarElemento(Object o)
        {
            items.add(o);
            refiltrar();
        }
        
        public void refiltrar()
        {
            FiltradoItems.clear();
            String texto = getCampoFiltro().getText();
            for(int i=0; i<items.size();i++)
            {
                if(items.get(i).toString().indexOf(texto,0)!=-1)
                {
                    FiltradoItems.add(items.get(i));
                }
            }
            fireContentsChanged(this,0,getSize());
        }
                
        
    }
    
        class CampoFiltro extends JTextField implements DocumentListener {
        public CampoFiltro (int width) {
            super(width);
            getDocument().addDocumentListener (this);
        }       
        @Override
        public void insertUpdate(DocumentEvent e) {
           ((FiltroModel)getModel()).refiltrar();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            ((FiltroModel)getModel()).refiltrar();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            ((FiltroModel)getModel()).refiltrar();
        }
    }
    
}
