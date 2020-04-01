package tugas6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DataMahasiswa {
     public static void main(String[] args) {
          datamhs dm = new datamhs();

      }
    
}

class datamhs extends JFrame{
    
    DefaultTableModel model;
    JTable tabel;
    JScrollPane scrollpane;
    public datamhs(){
        Object kolom[] = {"Nama", "Hobby", "Jurusan", "Fakultas", "Universitas", "Alamat", "Jenis Kelamin"};
        Object data[][] = {{"Anita", "menulis", "informasita", "teknik industri", "upn jogja", "jl. tambakbayan", "pr"}};
        
        model = new DefaultTableModel (data,kolom);
        tabel = new JTable (model);
        scrollpane = new JScrollPane (tabel);
        this.getContentPane().setBackground(Color.pink);
        setTitle ("input Data");
        setDefaultCloseOperation(3);
        setSize(600,650);
        setAlwaysOnTop(true);
        setResizable(false);
        setLayout(null);
        add(scrollpane);
        
    }
}
