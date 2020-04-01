package tugas6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



  public class InputMahasiswa{
      public static void main(String[] args) {
          mahasiswa x = new mahasiswa();

      }
      }
    
class mahasiswa extends JFrame{
    JLabel atas = new JLabel ("data input mahasiswa");
    
    JLabel nama = new JLabel ("Nama");
    final JTextField fnama = new JTextField(10);
    
    JLabel hobby = new JLabel ("Hobby");
    String[] hobbyH = {"...", "menulis", "menggambar", "makan", "olahraga", "main game"};
    JComboBox cmbHobby = new JComboBox(hobbyH);
    
    JLabel jurusan = new JLabel ("Jurusan");
    final JTextField fjurusan = new JTextField(10);
    
    JLabel fakultas = new JLabel ("Fakultas");
    final JTextField ffakultas = new JTextField(10);
    
    JLabel universitas = new JLabel ("universitas");
    final JTextField funiversitas = new JTextField(10);
    
    JLabel alamat = new JLabel ("Alamat");
    final JTextField falamat = new JTextField(10);
    
    JLabel jeniskelamin = new JLabel ("Jenis Kelamin");
    JRadioButton jk1 = new JRadioButton ("Pr");
    JRadioButton jk2 = new JRadioButton ("Lk");
    
    JButton save = new JButton ("Save");
    JButton edit = new JButton ("Edit");
    JButton delete = new JButton ("Delete");
    JButton reset = new JButton ("Reset");
    
    DefaultTableModel model;
    JTable tabel;
    JScrollPane scrollpane;
    
    public mahasiswa(){
        Object kolom[] = {"Nama", "Hobby", "Jurusan", "Fakultas", "Universitas", "Alamat", "Jenis Kelamin"};
        Object data[][] = {{"Anita", "menulis", "informasita", "teknik industri", "upn jogja", "jl. tambakbayan", "pr"}};
        
        model = new DefaultTableModel (data,kolom);
        tabel = new JTable (model);
        scrollpane = new JScrollPane (tabel);
        this.getContentPane().setBackground(Color.blue);
        setTitle ("input Data");
        setDefaultCloseOperation(3);
        setSize(600,650);
        this.getContentPane().setBackground(Color.pink);
        
        setLayout(null);
        add(atas);
        add(nama);add(fnama);
        add(hobby); add(cmbHobby);
        add(jurusan); add(fjurusan);
        add(fakultas); add(ffakultas);
        add(universitas); add(funiversitas);
        add(alamat); add(falamat);
        add(jeniskelamin); add(jk1);add(jk2);
        add(save);
        add(edit);
        add(delete);
        add(reset);
        add(scrollpane);
        ButtonGroup group = new ButtonGroup();
        group.add(jk1);
        group.add(jk2);
    atas.setBounds(20,10,200,50);
    nama.setBounds(20,100,100,20);
    fnama.setBounds(130,100,140,20);
    hobby.setBounds(20,130,100,20);
    cmbHobby.setBounds(130,130,140,20);
    jurusan.setBounds(20,160,100,20);
    fjurusan.setBounds(130,160,140,20);
    fakultas.setBounds(20,190,100,20);
    ffakultas.setBounds(130,190,140,20);
    universitas.setBounds(20,220,100,20);
    funiversitas.setBounds(130,220,140,20);
    alamat.setBounds(20,250,100,20);
    falamat.setBounds(130,250,140,20);
    jeniskelamin.setBounds(20,280,100,20);
    jk1.setBounds(130,280,40,20);
    jk2.setBounds(180,280,40,20);
    save.setBounds(280,130,70,20);
    edit.setBounds(280,160,70,20);
    delete.setBounds(280,190,70,20);
    reset.setBounds(280,220,70,20);
    scrollpane.setBounds(10,350,550,100);
    setVisible(true);
    setAlwaysOnTop(true);
    
    save.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent bb){
            datamhs dm = new datamhs();
            dm.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan ", "warning", JOptionPane.WARNING_MESSAGE);    
        }});
    
    
    reset.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent bb){
            fnama.setText("");
            fjurusan.setText("");
            ffakultas.setText("");
            funiversitas.setText("");
            falamat.setText("");
            cmbHobby.setSelectedItem("...");
            jk1.setSelected(false);
            jk2.setSelected(false);
            
        }});    
    }}
