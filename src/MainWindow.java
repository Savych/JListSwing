import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
	private ListModel model;
	private JList<String> list;
	private JButton btnRemove;
	private List<String> objects;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 300, 430);
		getContentPane().add(scrollPane);
		
		model = new ListModel();
		
		list = new JList<>(model);
		scrollPane.setViewportView(list);
		
		btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objects = list.getSelectedValuesList();
				for(String s : objects)
					model.removeElement(s);
				list.updateUI();
			}
		});
		btnRemove.setBounds(320, 9, 89, 23);
		getContentPane().add(btnRemove);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = new JOptionPane().showInputDialog("That do you want to add?");
				model.addElement(s);
				list.updateUI();
			}
		});
		btnAdd.setBounds(320, 43, 89, 23);
		getContentPane().add(btnAdd);
	}
	
	public void addElement(String s) {
		model.addElement(s);
	}
}
