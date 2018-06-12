import java.util.ArrayList;

import javax.swing.event.ListDataListener;

public class ListModel implements javax.swing.ListModel<String> {
	private ArrayList<String> data;

	public ListModel() {
		data = new ArrayList<>();
	}
	
	@Override
	public void addListDataListener(ListDataListener l) {}
	
	@Override
	public void removeListDataListener(ListDataListener l) {}

	@Override
	public String getElementAt(int index) {	
		return data.get(index);
	}

	@Override
	public int getSize() {
		return data.size();
	}
	
	public void addElement(String s) {
		data.add(s);
	}
	
	public void removeElement(int index) {
		data.remove(index);
	}
	
	public void removeElement(String obj) {
		data.remove(obj);
	}
}
